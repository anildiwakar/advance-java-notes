package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExampe {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(8);
		//Set<Integer> numbers1 = new HashSet<>(Arrays.asList(8,5,1,3));
		HashSet<Integer> numbers2= (HashSet<Integer>) numbers.clone();
		for(Integer num:numbers2)
		{ 
			System.out.println(num);
		}		
		numbers2.add(6);
		System.out.println(numbers.hashCode());
		System.out.println(numbers2.hashCode());

	}

}
