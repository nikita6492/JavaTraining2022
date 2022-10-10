package com.sprintOne.evaluation.StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
			mylist.add("Apple");
			mylist.add("Banana");
			mylist.add("Orange");
			mylist.add("Kiwi");
			mylist.add("Berry");
		
			Stream<String> stream = mylist.parallelStream();
			Stream<String> stringStream = stream.filter(p ->p.length()>5);
			stringStream.forEach(p->System.out.println(p));

	}

}
