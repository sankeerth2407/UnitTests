package com.algorithms.unittestapplication.controller;

import com.algorithms.unittestapplication.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Algorithms {
    @Autowired
    AlgorithmService algorithmService;
    @GetMapping(value = "/sum")
    public Integer sumOfArrayOfElements(@RequestBody List<Integer> numbers){
        return algorithmService.sumOfArrayOfElements(numbers);
    }

    @GetMapping(value = "/product")
    public Integer productOfArrayOfElements(@RequestBody List<Integer> numbers){
        return algorithmService.productOfArrayOfElements(numbers);
    }

    @GetMapping(value = "/isEven")
    public Boolean iseven(Integer number){
        return number % 2 == 0;
    }
}
