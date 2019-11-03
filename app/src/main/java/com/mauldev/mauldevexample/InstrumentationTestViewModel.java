package com.mauldev.mauldevexample;

public class InstrumentationTestViewModel {

    private BMIModel bmiModel;

    public InstrumentationTestViewModel(BMIModel bmiModel) {
        this.bmiModel = bmiModel;
    }

    public void save(double tinggi, double berat){
        this.bmiModel.saveData(tinggi, berat);
    }

    public BMIModel getBmiModel() {
        return bmiModel;
    }

    public void setBmiModel(BMIModel bmiModel) {
        this.bmiModel = bmiModel;
    }

    public double hitungBMI(){
        return this.bmiModel.hitungBMI();
    }

}
