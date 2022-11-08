package com.algorithms.unittestapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlgorithmService {
    public Integer sumOfArrayOfElements(List<Integer> numbers){
        Integer result = 0;
        for(Integer i : numbers){
            result += i;
        }
        return result;
    }


    public Integer productOfArrayOfElements(List<Integer> numbers){
        Integer result = 1;
        for(Integer i : numbers){
            result *= i;
        }
        return result;
    }

    public Boolean iseven(Integer number){
        return number % 2 == 0;
    }
}
