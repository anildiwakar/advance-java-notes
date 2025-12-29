package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> alist=new ArrayList<String>(Arrays.asList("C","C++","Java","Python"));
		for(String lang:alist)
		{
			System.out.println(lang);
		}
		System.out.println("----------------------------");
		alist.add(2, "JavaScript");
		System.out.println(alist.get(2));
		alist.set(2, "html");
		for(String lang:alist)
		{
			System.out.println(lang);
		}

	}

}
