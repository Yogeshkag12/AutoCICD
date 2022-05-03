package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class test {
	public void duplicateChar(String input) 
	{
		Map<Character, Integer> output=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			Character ch=input.charAt(i);
			if(output.containsKey(ch))
			{
				 output.put(ch, output.get(ch) + 1);
			}else {
				output.put(ch, 1);
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		test t=new test();
		t.duplicateChar("YogesYYh Kag");
	}

}
