package com.example.quadratic.controllers;

import com.example.quadratic.requests.QuadraticRequest;
import com.example.quadratic.response.QuadraticResponse;
import com.example.quadratic.service.QuadraticService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Slf4j
@RestController
@RequestMapping("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class QuadraticController {

    private final Gson gson;
    private final QuadraticService quadraticService;

    @Autowired
    public QuadraticController(QuadraticService quadraticService) {
        gson = new GsonBuilder().setPrettyPrinting().create();
        this.quadraticService = quadraticService;
    }

    //ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/quadratic", method = RequestMethod.POST)
    public QuadraticResponse quadraticMethod(@RequestBody QuadraticRequest request){
        log.info("request: \n{}", gson.toJson(request));
        Double [] results = quadraticService
                .computeQuadratic(request.getaDouble(), request.getbDouble(), request.getcDouble());

        return QuadraticResponse.builder()
                .roots(results)
                .build();
    }

}
