package com.algorithms.unittestapplication.controller;

import com.algorithms.unittestapplication.service.AlgorithmService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlgorithmsTest {

    @Autowired
    Algorithms algorithms;

    @MockBean
    AlgorithmService algorithmService;

    @Test
    void sumOfArrayOfElements() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Mockito.when(algorithmService.sumOfArrayOfElements(numbers)).thenReturn(14);
        assertEquals(14, algorithms.sumOfArrayOfElements(numbers));
    }

    @Test
    void productOfArrayOfElements() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Mockito.when(algorithmService.productOfArrayOfElements(numbers)).thenAnswer(new Answer<Integer>() {
            Integer result = 0;
            @Override
            public Integer answer(InvocationOnMock invocationOnMock) throws Throwable {
                return ++result;
            }
        });
        assertEquals(1, algorithms.productOfArrayOfElements(numbers));
        assertEquals(2, algorithms.productOfArrayOfElements(numbers));
        assertEquals(3, algorithms.productOfArrayOfElements(numbers));
        assertEquals(4, algorithms.productOfArrayOfElements(numbers));

    }
}