package com.mauldev.mauldevexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class InstrumentationTestActivity extends AppCompatActivity {

    private EditText tinggiET, beratET;
    private Button hitungButton;
    private TextView bmiTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumentation_test);

        bindView();
        initialize();
    }

    private void bindView() {
        this.tinggiET = findViewById(R.id.tinggiET);
        this.beratET= findViewById(R.id.beratET);
        this.bmiTV = findViewById(R.id.bmiTV);
        this.hitungButton = findViewById(R.id.hitungBMIButton);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tinggiET.getText().toString().trim().equals("")){
                    tinggiET.setError("Field ini tidak boleh kosong");
                } else if(beratET.getText().toString().trim().equals("")){
                    beratET.setError("Field ini tidak boleh kosong");
                } else {
                    BMIModel model = new BMIModel();
                    double tinggi = Double.parseDouble(tinggiET.getText().toString().trim());
                    double berat = Double.parseDouble(beratET.getText().toString().trim());
                    model.saveData(tinggi, berat);
                    DecimalFormat decimalFormat = new DecimalFormat("#.#");

                    bmiTV.setVisibility(View.VISIBLE);
                    bmiTV.setText(decimalFormat.format(model.hitungBMI()));
                }
            }
        });
    }

    private void initialize() {

    }
}
