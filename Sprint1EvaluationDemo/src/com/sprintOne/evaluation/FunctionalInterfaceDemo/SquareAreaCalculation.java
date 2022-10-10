package com.sprintOne.evaluation.FunctionalInterfaceDemo;

public class SquareAreaCalculation {

	public static void main(String[] args) {
		Calculation cal = new Calculation() {
			
			@Override
			public void calculateArea(int a) {
				System.out.println("The area of rectangle is "+a*a);
				
			}
		};

		cal.calculateArea(5);
		
		// using lambda expression
		
		Calculation calculate = (a) ->{
			System.out.println("The area of rectangle is "+a*a);
		};
		calculate.calculateArea(10);
	}

}
