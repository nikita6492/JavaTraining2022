package com.sprintOne.evaluation.DateTimeDemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.of(2022, Month.SEPTEMBER, 12);
		System.out.println(ld1);
		
		LocalDate ld2 =LocalDate.ofEpochDay(200);
		System.out.println(ld2);	
		
		LocalDate ld3 = LocalDate.ofYearDay(2022, 30);
		System.out.println( ld3);

	}

}
