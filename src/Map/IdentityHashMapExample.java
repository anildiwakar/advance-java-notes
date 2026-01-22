package Map;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		String key1=new String("Ram");
		String key2=new String("Ram");
		IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<String, Integer>();
		identityMap.put(key1, 10);
		identityMap.put(key2, 30);
		identityMap.put("Krishna", 10);
		identityMap.put("Krishna", 30);
		System.out.println(identityMap);
	
	}

}
