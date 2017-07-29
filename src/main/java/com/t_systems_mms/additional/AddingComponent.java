package com.t_systems_mms.additional;

public class AddingComponent{
	private IntegerAdder integerAdder;
	

	public AddingComponent(IntegerAdder adder){
		this.integerAdder=adder;
	}
	
	public int addNumbers(SummandProvider prov){
		int sum=prov.getLeftSummand() + prov.getRightSummand();
	return sum;
	}

	//public int addNumbers(SummandProvider prov){
	//	int sum=integerAdder.addIntegers(prov.getLeftSummand(), prov.getRightSummand());
	//return sum;
	//}
	
}