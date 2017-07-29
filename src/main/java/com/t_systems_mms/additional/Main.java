package com.t_systems_mms.additional;

public class Main{

	public static void main(String[] args){
		
		SimpleIntegerAdder simpleAdder=new SimpleIntegerAdder();
		AddingComponent addComp=new AddingComponent(simpleAdder);
		SimpleSummandProvider simSumProv = new SimpleSummandProvider(1,2);
		
		addComp.addNumbers(simSumProv);

		System.out.println(addComp.addNumbers(simSumProv));
		
	}
}