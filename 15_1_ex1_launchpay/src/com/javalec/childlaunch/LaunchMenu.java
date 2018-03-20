package com.javalec.childlaunch;

public abstract class LaunchMenu {
	
	public int Rice; 
	public int Bulgogi; 
	public int Banana; 
	public int Milk; 
	public int Almond; 
	
	public LaunchMenu(int Rice, int Bulgogi, int Banana, int Milk, int Almond) {
		// TODO Auto-generated constructor stub
		this.Rice = Rice; 
		this.Bulgogi = Bulgogi; 
		this.Banana = Banana; 
		this.Milk = Milk; 
		this.Almond = Almond; 
	}
	
	// 추상메소드 
	public abstract int calcutateMenu();
	
}
