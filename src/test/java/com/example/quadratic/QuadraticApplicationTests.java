package com.example.quadratic;

import com.example.quadratic.service.QuadraticService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public abstract class QuadraticApplicationTests {

	@Autowired
	protected QuadraticService quadraticService;

	@Test
	void contextLoads() {
	}

}
