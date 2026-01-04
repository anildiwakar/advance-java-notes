package Map;

import java.util.*;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("Rahul", 25);
		treeMap.put("Ajay", 36);
		treeMap.put("Vijay", 15);
		treeMap.put("Shankar", 50);
		treeMap.put("Srinu", 30);
		treeMap.put("Vamsi", 30);
		treeMap.put("Kiran", 30);

		//sorted order
		for(Map.Entry<String,Integer> person:treeMap.entrySet())
		{
			System.out.println(person.getKey());
			System.out.println(person.getValue());
		}
		
		System.out.println("First Key = "+treeMap.firstKey());
		System.out.println("Last Key = "+treeMap.lastKey());
		SortedMap<String,Integer> subMap = treeMap.subMap("Kiran", "Srinu");
		//sub map
		System.out.println("Sub Map ="+subMap);
		SortedMap<String,Integer> headMap = treeMap.headMap("Srinu");
		System.out.println("head Map ="+headMap);
		SortedMap<String,Integer> tailMap = treeMap.tailMap("Srinu");
		System.out.println("tail Map ="+tailMap);
		System.out.println("First Entry : "+treeMap.firstEntry());
		System.out.println("Last Entry : "+treeMap.lastEntry());
		//below 2 methods output will be same as above 2 but below 2 methods will delete from the actual map
		System.out.println("First Entry : "+treeMap.pollFirstEntry());
		System.out.println("Last Entry : "+treeMap.pollLastEntry());
		System.out.println("map after poll first and last  ="+treeMap);
		System.out.println("Ceiling Entry : "+treeMap.ceilingEntry("Uma"));
		System.out.println("Ceiling Key : "+treeMap.ceilingKey("Uma"));
		System.out.println("Floor Entry : "+treeMap.floorEntry("Uma"));
		System.out.println("Floor Key : "+treeMap.floorKey("Uma"));
		System.out.println("higher Entry : "+treeMap.higherEntry("Rahul"));
		System.out.println("higher Key : "+treeMap.higherKey("Rahul"));
		System.out.println("lower Entry : "+treeMap.lowerEntry("Rahul"));
		System.out.println("lower Key : "+treeMap.lowerKey("Rahul"));
		System.out.println("Decending order ="+treeMap.descendingMap());
		System.out.println("Decending keys ="+treeMap.descendingKeySet());


		




	}
}
