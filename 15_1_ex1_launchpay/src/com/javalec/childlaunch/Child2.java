package com.javalec.childlaunch;

public class Child2 extends LaunchMenu{
	
	public Child2(int Rice, int Bulgogi, int Banana, int Milk, int Almond) {
		// TODO Auto-generated constructor stub
		super(Rice,Bulgogi,Banana,Milk,Almond);
	}
	
	@Override
	public int calcutateMenu() {
		// TODO Auto-generated method stub
		return Banana+Milk+Almond;
	}
}
