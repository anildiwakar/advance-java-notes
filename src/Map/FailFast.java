package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>(Arrays.asList(1,5,3,8,5,7));
		Iterator<Integer> itr1=list1.iterator();
		Iterator<Integer> itr2=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		itr1.remove();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
