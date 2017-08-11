package com.t_systems_mms.additional;

public class OnlyPositiveIntegerAdder implements IntegerAdder{
	
	public int addIntegers(int a, int b) throws IllegalArgumentException{
		if(a < 0 || b<0) 
			throw new IllegalArgumentException("Es dürfen keine Zahlen kleiner 0 eingegeben werden.");
		else
		return a+b;
	}
}