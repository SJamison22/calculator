package io.stevejamison;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by stevejaminson on 4/27/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The actual value should be 4",expectedSum,actualSum);

    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expectedAns = 0;
        int actualAns = calculator.subtract(2,2);
        assertEquals("The actual value should be 0",expectedAns,actualAns);

    }

    @Test
    public void productTest(){
        Calculator calculator = new Calculator();
        int expectedProd = 25;
        int actualProd = calculator.product(5,5);
        assertEquals("The actual value should be 25", expectedProd, actualProd);
    }

    @Test
    public void divTest(){
        Calculator calculator = new Calculator();
        int expectedDiv = 4;
        int actualDiv = calculator.div(20,5);
        assertEquals("The actual value should be 5", expectedDiv, actualDiv);
    }
}
