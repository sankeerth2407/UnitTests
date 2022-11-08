package com.algorithms.unittestapplication.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class AlgorithmServiceTest {

    @Autowired
    AlgorithmService algorithmService;

    @Test
    void sumOfArrayOfElements() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        assertEquals(14, algorithmService.sumOfArrayOfElements(numbers));
    }

    @Test
    void productOfArrayOfElements() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        assertEquals(120, algorithmService.productOfArrayOfElements(numbers));
    }
}