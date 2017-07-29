package com.t_systems_mms.additional;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;

public class AddingComponentTest {

	@Test
	public void addNumbersTest(){
		//Mockito erzeugen
		IntegerAdder ia = Mockito.mock(IntegerAdder.class);
		SummandProvider sp = Mockito.mock(SummandProvider.class);
		//Rückgabewert festlegen
		Mockito.when(ia.addIntegers(1,1)).thenReturn(2);
		Mockito.when(sp.getLeftSummand()).thenReturn(1);
		Mockito.when(sp.getRightSummand()).thenReturn(1);

		//Mockito einsetzen
		AddingComponent addComp = new AddingComponent(ia);
		
		//Testfälle
		assertEquals(2, addComp.addNumbers(sp));
		


	}

}
