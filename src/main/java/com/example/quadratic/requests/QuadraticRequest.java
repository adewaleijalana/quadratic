package com.example.quadratic.requests;


import java.io.Serializable;

public class QuadraticRequest implements Serializable {

    public QuadraticRequest(){

    }

    private double aDouble;
    private double bDouble;
    private double cDouble;

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public double getbDouble() {
        return bDouble;
    }

    public void setbDouble(double bDouble) {
        this.bDouble = bDouble;
    }

    public double getcDouble() {
        return cDouble;
    }

    public void setcDouble(double cDouble) {
        this.cDouble = cDouble;
    }

    @Override
    public String toString() {
        return "QuadraticRequest{" +
                "aDouble=" + aDouble +
                ", bDouble=" + bDouble +
                ", cDouble=" + cDouble +
                '}';
    }
}
