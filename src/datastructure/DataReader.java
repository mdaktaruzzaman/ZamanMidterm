package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader( textFile );

			br = new BufferedReader( fr );
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		String st = "";
		String store = "";
		try {
			while ((st = br.readLine()) != null) {
				store += st;
				System.out.println( st );
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}

		}
		String[] array = store.split( " " );
		List<String> list = new LinkedList<String>();
		Stack<String> storeStack = new Stack<String>();

		for (String element : array) {
			list.add( element );
			storeStack.push( element );  //push is used here
		}
		System.out.println( "\nLinkedList FIFO:" );
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print( itr.next() + " " );
		}

		System.out.println( "\n\nStack FILO:" );

		while (!storeStack.isEmpty()) {
			System.out.print( storeStack.pop() + " " );
			// POP remove the item from the stack as - last in first out
		}

		System.out.println( storeStack.push( "\n\nMusta!" ) );
		System.out.println( storeStack.search( "right" ) );
		// on this stack.,
		System.out.println( storeStack.peek() );
		// removing it from the stack.

		System.out.println( storeStack.empty() );
	}
}

