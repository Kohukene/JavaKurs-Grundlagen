package com.t_systems_mms.additional;

public class SimpleSummandProvider implements SummandProvider{

int leftSummand;
int rightSummand;

	public SimpleSummandProvider(int left, int right){
		this.leftSummand=left;
		this.rightSummand=right;	
	}
	
	public int getLeftSummand(){
		return this.leftSummand;
	}

	public int getRightSummand(){
		return this.rightSummand;
	}
}