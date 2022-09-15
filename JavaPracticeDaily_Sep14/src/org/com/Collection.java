package org.com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection {
	public static void main(String[] args) {
//		//Map<Integer, String> ex = new Hashtable<Integer,String>(); 
//		Map<Integer, String> ex = new HashMap<Integer,String>();
//		//Map<Integer, String> ex = new TreeMap<Integer,String>();
//		ex.put(10, "Java");
//		ex.put(20, "Java");
//		ex.put(30, "sql");
//		ex.put(40, ".net");
//		ex.put(50, "sales");
//		ex.put(5, "fire");
//		ex.put(50, "fire");
//		ex.put(50, "fire");
//		ex.put(88, null);
//		ex.put(888, null);
//		
//		//Set<Integer> s= ex.keySet();
//		//System.out.println(s);
//		System.out.println(ex);
		
		
		//Map<String, String> ex = new HashMap<String,String>();
		//Map<String, String> ex = new LinkedHashMap<String,String>();
		Map<String, String> ex = new TreeMap<String,String>();
		//Map<String, String> ex = new Hashtable<String,String>();
		ex.put("A", "Java");
		ex.put("B", "Java");
		ex.put("C", "sql");
		ex.put("B", "Java1");
		ex.put("C", "sql3");
		
		ex.put("D","BNM");
		ex.put("D","BNM");
		ex.put(null,null);
		ex.put(null,null);
		
		System.out.println(ex);
		
		
		}

}
