package Queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(null);

		for (Integer i : q) {
			System.out.println(i);
		}

		// this method will delete the top element
		q.remove();
		System.out.println("\n after deletion of elements");
		for (Integer i : q) {
			System.out.println(i);
		}

		

	}

}
