package Queue_LinkedList;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PrioityQueue1 {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("ndjndjkdk");
		pq.add("gaurav");
		pq.add("kesa");
		pq.add("surya");
		pq.add("john");
		pq.add("list");

		// Printing the top element of PriorityQueue
		System.out.println(pq.peek());

		// printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pq.poll());

	
		pq.remove("gaurav");
		System.out.println("\n final pririority queue is " + pq);
		
		// for accesing the element
		String element=pq.peek();
		System.out.println("\n extract an element from " + element);
		
		
		//iterating over priority queue
		Iterator iq=pq.iterator();
		if(iq.hasNext()) {
			System.out.println("\n iterate over an loop is " + iq.next());
		}
		
	}

}
