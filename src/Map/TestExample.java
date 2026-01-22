package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		String s1=new String("Key1");
		String s2=new String("Key1");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		List<Long> numbers = new ArrayList<>(Arrays.asList(12345l,567788l,334556l));
		for(Long num:numbers)
		{
			System.out.println(num);
		}
	}

}


