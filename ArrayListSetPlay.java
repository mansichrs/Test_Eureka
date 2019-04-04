package demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListSetPlay {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("abc");
		ar.add("bcd");
		ar.add("cde");
		ar.add("abc");
		ar.add("bcd");
		System.out.println(ar.toString());
		Set newSet = new HashSet();
		Set newTree = new TreeSet();
		newSet.addAll(ar);
		System.out.println(newSet);
		System.out.println("***********");
		newTree.addAll(ar);
		System.out.println(newTree);
		System.out.println("***********");
		Collections.sort(ar);
		System.out.println(ar.toString());
		System.out.println("***********");

	}

}
