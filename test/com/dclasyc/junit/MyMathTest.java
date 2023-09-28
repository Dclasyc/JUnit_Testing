package com.dclasyc.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    // Arrange - Setup Test Object
    MyMath myMath = new MyMath();

    @Test
    void calculateSum_ThreeLengthArray() {

    //Act - Do the actual method
        int [] numbers = {1, 2, 3};
        int actualResult = myMath.calculateSum(numbers);
        int expectedResult = 6;

    //Assert - Check if actualValue equals expectedValue
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void calculateSum_ZeroLengthArray(){

        assertEquals(0, myMath.calculateSum(new int[] {}));

    }

}