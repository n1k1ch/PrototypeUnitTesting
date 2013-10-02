package com.n1k1ch.prototypes.unitTesting.calculator;

public interface ICalculator<T> {
	public T add(T first, T second);
	public T substract(T first, T second);
	public T multiply(T first, T second);
	public T divide(T first, T second);
	public T divideRemainder(T first, T second);
}
