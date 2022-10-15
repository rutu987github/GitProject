package com.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Rutuja","Supriya","Komal","Trupti");
		
		//System.out.println(list);
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
