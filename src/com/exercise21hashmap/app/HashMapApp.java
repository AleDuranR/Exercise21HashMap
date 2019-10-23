package com.exercise21hashmap.app;

import java.util.HashMap;
import java.util.Map;
public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A 'HashMap' accepts any kind a valueType
		HashMap <Integer, String> myHash = new HashMap<Integer, String>();
		myHash.put(1,"Daniel");
		myHash.put(2,"Jorge");
		for(int i = 1; i <= myHash.size();i++) {
			if(myHash.containsKey(i)) {
				System.out.println(myHash.get(i));
			}
		}
		for(Map.Entry<Integer, String> myMap : myHash.entrySet()) {
			System.out.format("The Key is %d , value %s \n", myMap.getKey(),myMap.getValue());
		}
	}

}
