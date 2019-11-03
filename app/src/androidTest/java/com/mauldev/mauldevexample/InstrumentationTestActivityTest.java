package com.mauldev.mauldevexample;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class InstrumentationTestActivityTest {
    private String dummyTinggi = "175";
    private String dummyBerat = "65";
    private String dummyBMI = "21.2";
    private String emptyInput = "";
    private String fieldEmpty = "Field ini tidak boleh kosong";

    @Rule
    public ActivityTestRule<InstrumentationTestActivity> mActivityRule = new ActivityTestRule<>(InstrumentationTestActivity.class);

    @Test
    public void onGetBMI(){
        onView(withId(R.id.tinggiET)).perform(typeText(dummyTinggi), closeSoftKeyboard());
        onView(withId(R.id.beratET)).perform(typeText(dummyBerat), closeSoftKeyboard());

        onView(withId(R.id.hitungBMIButton)).check(matches(isDisplayed()));
        onView(withId(R.id.hitungBMIButton)).perform(click());

        onView(withId(R.id.bmiTV)).check(matches(isDisplayed()));
        onView(withId(R.id.bmiTV)).check(matches(withText(dummyBMI)));
    }
}