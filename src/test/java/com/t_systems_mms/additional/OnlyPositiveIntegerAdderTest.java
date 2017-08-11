package com.t_systems_mms.additional;

import org.junit.*;
import static org.junit.Assert.*;


public class OnlyPositiveIntegerAdderTest {

	@Test
	public void addIntegersTest(){
		OnlyPositiveIntegerAdder adder= new OnlyPositiveIntegerAdder();
		//Test für Positivfall
		assertEquals(2, adder.addIntegers(1,1));
		//Test für Negativfall
		try{
			adder.addIntegers(-1,-1);
			fail("Methode sollte eine Exception werfen");
		}
		catch(IllegalArgumentException e){
			
		}
	}
}