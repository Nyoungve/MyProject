package com.javalec.childlaunch;

public class MainClass {
	public static void main(String[] args) {
		Child1 child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND); 
		Child2 child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("Child1급식비  = "+ child1.calcutateMenu() );
		System.out.println("Child2급식비  = "+ child2.calcutateMenu() );
	}
}
