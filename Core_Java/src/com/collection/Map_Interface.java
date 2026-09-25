package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_Interface {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "core java");
		h.put(2, "HTML");
		h.put(3, "css");
		h.put(4, "BS");
		h.put(5, null);
		h.put(null, "SQL");
		h.put(6, "Spring");
		
		System.out.println(h);
		
		System.out.println(h.compute(1, (k,v)->v.concat(": Welcome")));
		System.out.println("====================================================");
		System.out.println(h.computeIfAbsent(7, (k->"hibernate")));
		System.out.println("====================================================");
		System.out.println(h.computeIfPresent(7, (k,v)->v.toUpperCase()));
		System.out.println("====================================================");
		System.out.println(h.containsKey(4));
		System.out.println("====================================================");
		System.out.println(h.containsValue("SQL"));
		System.out.println("====================================================");
		System.out.println(h.equals(h));
		System.out.println("====================================================");
		System.out.println(h.get(2));
		System.out.println("====================================================");
		System.out.println(h.hashCode());
		System.out.println("====================================================");
		System.out.println(h.isEmpty());
		System.out.println("====================================================");
		System.out.println(h.merge(2, ": HyperText", (oldval,newval)->(oldval = newval)));
		System.out.println(h);
		System.out.println("====================================================");
		System.out.println(h.remove(null));
		System.out.println("====================================================");
		System.out.println(h.merge(8, "SB", (oldval, newval)->(oldval+newval)));
		System.out.println("====================================================");
		System.out.println(h.replace(8, "JS"));
		System.out.println("====================================================");
		System.out.println(h.size());
		System.out.println("====================================================");
		System.out.println(h.entrySet());
		System.out.println("====================================================");
		System.out.println(h.keySet());
		System.out.println("====================================================");
		System.out.println(h.values());
		System.out.println("====================================================");
		h.forEach((k,v)->System.out.println(k+" : "+v));
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println();
		
		System.out.println("==================LinkedHashMap=====================");
		
		LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
		l.put(22, "Java");
		l.put(20, "Pen");
		l.put(12, "html");
		l.put(52, "BS");
		l.put(54, "SB");
		l.put(10, "SQL");
		l.put(11, "Spring");
		l.put(null, "css");
		l.put(34, null);
		
		System.out.println(l);
		System.out.println("====================================================");
		System.out.println(l.compute(22, (k,v)->v.repeat(2)));
		System.out.println("====================================================");
		System.out.println(l.computeIfAbsent(1, (k->"Hello")));
		System.out.println("====================================================");
		System.out.println(l.computeIfPresent(11, (k,v)->v.replace("Spring", "Book")));
		System.out.println("====================================================");
		System.out.println(l.containsKey(11));
		System.out.println("====================================================");
		System.out.println(l.containsValue("SB"));
		System.out.println("====================================================");
		System.out.println(l.firstEntry());
		System.out.println("====================================================");
		System.out.println(l.lastEntry());
		System.out.println("====================================================");
		System.out.println(l.keySet());
		System.out.println("====================================================");
	}
}
