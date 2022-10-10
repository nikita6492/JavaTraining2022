package com.sprintOne.evaluation.OptionalClassDemo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String str =null;
		String str1="HELLO";
		Optional<String> checkNull = Optional.ofNullable(str);
		Optional<String> checkNull2 = Optional.ofNullable(str1);
		if(checkNull.isPresent()) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println("String not present");
		}

		if(checkNull2.isPresent()) {
			System.out.println(str1.toLowerCase());
		}else {
			System.out.println("String not present");
		}
	}

}
