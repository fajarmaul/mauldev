package com.mauldev.mauldevexample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InstrumentationTestViewModelTest {
    private BMIModel bmiModel;
    private InstrumentationTestViewModel instrumentationTestViewModel;

    private double dummyBMI = 21.2;
    private double dummyTinggi = 175.0;
    private double dummyBerat = 65.0;

    @Before
    public void setUp() throws Exception {
        bmiModel = mock(BMIModel.class);
        instrumentationTestViewModel = new InstrumentationTestViewModel(bmiModel);
    }

    @Test
    public void hitungBMI() {
        bmiModel = new BMIModel();
        instrumentationTestViewModel = new InstrumentationTestViewModel(bmiModel);
        instrumentationTestViewModel.save(dummyTinggi,dummyBerat);
        double bmi = instrumentationTestViewModel.hitungBMI();
        assertEquals(dummyBMI, bmi, 0.1);
    }

    @Test
    public void mockHitungBMI() {
        when(instrumentationTestViewModel.hitungBMI()).thenReturn(dummyBMI);
        double bmi = instrumentationTestViewModel.hitungBMI();
        verify(bmiModel).hitungBMI();
        assertEquals(dummyBMI, bmi, 0.1);
    }


}