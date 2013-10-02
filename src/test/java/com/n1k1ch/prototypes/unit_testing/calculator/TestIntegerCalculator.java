package com.n1k1ch.prototypes.unit_testing.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.n1k1ch.prototypes.unitTesting.calculator.ICalculator;
import com.n1k1ch.prototypes.unitTesting.calculator.IntegerCalculator;

public class TestIntegerCalculator {
	
	ICalculator<Integer> calculator;
	
	@Before
	public void setup() {
		calculator = new IntegerCalculator();
	}
	
	@Test
	public void testAdd() {
		Integer result = calculator.add(1, 2);
		
		assertEquals(result, new Integer(1 + 2));
	}
	
	@Test
	public void testSubstract() {
		Integer result = calculator.substract(2, 1);
		
		assertEquals(result, new Integer(2 - 1));
	}

	@Test
	public void testMultiply() {
		Integer result = calculator.multiply(3, 4);
		
		assertEquals(result, new Integer(3 * 4));
	}

	@Test
	public void testDivide() {
		Integer result = calculator.divide(10, 5);
		
		assertEquals(result, new Integer(10 / 5));
	}

	@Test
	public void testDivideRemainder() {
		Integer result = calculator.divideRemainder(10, 9);
		
		assertEquals(result, new Integer(10 % 9));
	}

}
