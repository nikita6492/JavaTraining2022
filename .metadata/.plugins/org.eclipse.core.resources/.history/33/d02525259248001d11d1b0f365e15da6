package com.sprintOne.evaluation.ForEachDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class IterateStringsList {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter five strings::");
		for(int i=0; i<5; i++) {
			mylist.add(scan.next());
		}
		
		//Iterate using for each
		
		System.out.println("Entered strings are (ForEach)::");
		mylist.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		//Iterate using consumer class
		System.out.println("Entered strings are(Consumer class)::");
		MyStringConsumer myStringConsumer = new MyStringConsumer();
		mylist.forEach(myStringConsumer);
	}

}

class MyStringConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}