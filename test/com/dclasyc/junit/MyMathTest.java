package com.dclasyc.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSum() {

    // Arrange - Setup Test Object
        MyMath myMath = new MyMath();

    //Act - Do the actual method
        int [] numbers = {1, 2, 3};
        int actualResult = myMath.calculateSum(numbers);
        int expectedResult = 6;

    //Assert - Check if actualValue equals expectedValue
        assertEquals(expectedResult, actualResult);

    }
}