package com.example.quadratic.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class QuadraticRequest implements Serializable {

    public QuadraticRequest(){

    }

    private double aDouble;
    private double bDouble;
    private double cDouble;

    @Override
    public String toString() {
        return "QuadraticRequest{" +
                "aDouble=" + aDouble +
                ", bDouble=" + bDouble +
                ", cDouble=" + cDouble +
                '}';
    }
}
