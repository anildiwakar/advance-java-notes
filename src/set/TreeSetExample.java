package set;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//after sorting order will be "C","Java","JavaScript","Python"
		TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("C","Java","Python","JavaScript"));
		System.out.println(treeSet.first()); // to get first/ root element
		System.out.println(treeSet.last()); // to get last element
		TreeSet<String> subSet= (TreeSet<String>) treeSet.subSet("Java", "Python");
		TreeSet<String> headSet= (TreeSet<String>) treeSet.headSet("JavaScript");
		TreeSet<String> tailSet= (TreeSet<String>) treeSet.tailSet("JavaScript");

		System.out.println("Subset elements...................");
		for(String ele:subSet)
		{
			System.out.println(ele);
		}
		System.out.println("head set..................");
		for(String ele:headSet)
		{
			System.out.println(ele);
		}
		System.out.println("tail set..................");
		for(String ele:tailSet)
		{
			System.out.println(ele);
		}
		System.out.println(treeSet.pollFirst()); // this will give first element and remove from the set
		System.out.println("tree set after polling..................");

		for(String ele:treeSet)
		{
			System.out.println(ele);
		}
		//System.out.println(treeSet.pollLast()); // this will give last element and remove from the set
		System.out.println("navigable set..................");
		TreeSet<String> navigableSubSet= (TreeSet<String>) treeSet.subSet("Java",true,"Python",true);
		for(String ele:navigableSubSet)
		{
			System.out.println(ele);
		}
		//3,15,17,20,25
		TreeSet<Integer> numbersSet = new TreeSet<>(Arrays.asList(20,15,3,17,25,8));
//		for(Integer ele:numbersSet)
//		{
//			System.out.println(ele);
//		}
		System.out.println(numbersSet.ceiling(8));
		System.out.println(numbersSet.floor(8));
		System.out.println(numbersSet.higher(8));
		System.out.println(numbersSet.lower(8));


	}

}
