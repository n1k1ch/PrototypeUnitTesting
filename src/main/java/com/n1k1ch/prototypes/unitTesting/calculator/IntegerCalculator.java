package com.n1k1ch.prototypes.unitTesting.calculator;

public class IntegerCalculator implements ICalculator<Integer> {

	public Integer add(Integer first, Integer second) {
		return first + second;
	}

	public Integer substract(Integer first, Integer second) {
		return first - second;
	}

	public Integer multiply(Integer first, Integer second) {
		return first * second;
	}

	public Integer divide(Integer first, Integer second) {
		return first / second;
	}

	public Integer divideRemainder(Integer first, Integer second) {
		return first % second;
	}
}
