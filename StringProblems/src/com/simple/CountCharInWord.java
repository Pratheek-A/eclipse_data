package com.simple;

import java.util.*;

public class CountCharInWord {
public static void main(String[] args) {
	String str = "Balaji";
	
	Map<Character, Integer> map = new HashMap<>();
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		 
		if(map.containsKey(ch)) {
			
		map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	
	System.out.println();
	System.out.println(map.keySet()+"-->"+map.values());
	
	}
}
