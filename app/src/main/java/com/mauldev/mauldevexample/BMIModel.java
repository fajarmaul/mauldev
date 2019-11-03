package com.mauldev.mauldevexample;

import java.text.DecimalFormat;

public class BMIModel {
    private double tinggi;
    private double berat;

    public BMIModel() {
    }

    public void saveData(double tinggi, double berat){
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double hitungBMI(){
        double value = 0;
        value = this.berat / (this.tinggi*this.tinggi);
        value = value*10000;
        return value;
    }
}
