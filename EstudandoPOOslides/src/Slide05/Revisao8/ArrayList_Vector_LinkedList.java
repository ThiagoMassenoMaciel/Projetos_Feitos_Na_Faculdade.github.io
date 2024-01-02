package Slide05.Revisao8;

import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;

public class ArrayList_Vector_LinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(null);
		arraylist.add(398);
		arraylist.add(1365);
		
		System.out.println(arraylist);
		
		Vector<Double> vector = new Vector<Double>();
		
		vector.add(23.7);
		vector.add(null);
		vector.add(0.81);
		
		System.out.println(vector);
		
		LinkedList<Character> linkedlist = new LinkedList<Character>();
		
		linkedlist.add('A');
		linkedlist.add('C');
		linkedlist.add('B');
		
		System.out.println(linkedlist);
	}
}