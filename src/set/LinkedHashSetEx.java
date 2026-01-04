package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(8);
		//Set<Integer> numbers1 = new HashSet<>(Arrays.asList(8,5,1,3));
		for(Integer num:numbers)
		{
			System.out.println(num);
		}				
	}

}
