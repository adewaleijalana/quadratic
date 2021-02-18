package com.example.quadratic;

import com.example.quadratic.service.QuadraticService;
import com.example.quadratic.service.impl.QuadraticServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class QuadraticServiceImplTest extends QuadraticApplicationTests{

//    private QuadraticService quadraticService;
//
//    @BeforeAll
//    public void setup(){
//        quadraticService = new QuadraticServiceImpl();
//    }


    @Test
    public void testQuadratic(){
        //QuadraticService quadraticService = new QuadraticServiceImpl();
        Double [] result = quadraticService.computeQuadratic(1, 4, 1);
        log.info("result: {}", result);
        //Assertions.assertNotNull(result);
    }

}