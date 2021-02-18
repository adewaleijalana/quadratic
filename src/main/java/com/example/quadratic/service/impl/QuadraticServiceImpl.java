package com.example.quadratic.service.impl;

import com.example.quadratic.service.QuadraticService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class QuadraticServiceImpl implements QuadraticService {

    @Override
    public Double[] computeQuadratic(double a, double b, double c) {
        log.info("a: {}, b: {}, c: {}", a, b, c);
        Double[] roots;
        double result = Math.pow(b, 2) - (4 * a * c);
        if (result > 0.0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            roots = new Double[]{r1, r2};
        }else if (result == 0.0){
            double r1 = -b / (2.0 * a);
            roots = new Double[]{r1};
        }else {
            roots = new Double[]{};
            log.info("No real roots");
        }
        return roots;
    }
}
