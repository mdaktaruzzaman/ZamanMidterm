package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Zaman");  //head, first
		queue.add("Mahmud");
		queue.add("Lisa");
		queue.add("Taher");
		queue.add("Tanjim");  //tail, last
		System.out.println("\nFirst element of the queue: "+queue.peek()+"\n");
		queue.remove();
		System.out.println("After removing head (by remove method), first element of this queue is: "+queue.peek());

		System.out.println("\nPrinting queue using for each loop: ");
		for(String st : queue) {
			System.out.print(st + " ");
		}
		queue.add("Alina");
		queue.poll();

		System.out.println("\n\nPrinting queue After adding and removing one element using Iterator ");
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
