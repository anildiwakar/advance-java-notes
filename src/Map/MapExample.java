package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> personsMap = new HashMap<>();
		personsMap.put("Ram", 25);
		personsMap.put("Ajay", 35);
		personsMap.put("Vijay", 26);
		personsMap.put("Rahul", null);
		personsMap.put("Ganesh", 27);
		personsMap.put("Krishna", 10);
		personsMap.put("Ram", 45);
		//personsMap.put(null, 47);
		
		Map<String, Integer> linkedPersonsMap = new LinkedHashMap<>();
		linkedPersonsMap.put("Ram", 25);
		linkedPersonsMap.put("Ajay", 35);
		linkedPersonsMap.put("Vijay", 26);
		linkedPersonsMap.put("Rahul", null);
		linkedPersonsMap.put("Ganesh", 27);
		linkedPersonsMap.put("Krishna", 10);
		linkedPersonsMap.put("Ram", 45);
		System.out.println(linkedPersonsMap);

		Map<String, Integer> personsList2 = new HashMap<>();
		personsList2.putAll(personsMap);
		personsList2.remove("Ajay");
		personsList2.clear();
		for(Map.Entry<String,Integer> person:personsList2.entrySet())
		{
			System.out.println(person.getKey());
			System.out.println(person.getValue());

		}
		
		//method - 1 iterating map
		for(Map.Entry<String,Integer> person:personsMap.entrySet())
		{
			System.out.println(person.getKey());
			System.out.println(person.getValue());

		}
		System.out.println(personsMap.get("Krishna"));
		System.out.println(personsMap.containsKey("Ganesh"));
		System.out.println(personsMap.containsValue(null));
		System.out.println(personsMap.size());
		System.out.println(personsList2.isEmpty());
		//printing all the keys
		for(String key:personsMap.keySet())
		{
			System.out.println(key);
		}
		
		//printing all the values
				for(Integer value:personsMap.values())
				{
					System.out.println(value);
				}

		
		//method - 2 
//		Set<Map.Entry<String, Integer>> personSet = personsMap.entrySet();
//		Iterator<Map.Entry<String, Integer>> itr = personSet.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next().getKey());
//			System.out.println(itr.next().getValue());
//
//		}

		

	}

}
