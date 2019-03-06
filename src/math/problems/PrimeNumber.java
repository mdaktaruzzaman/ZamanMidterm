package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int n = 1000000;

		int x = 0;
		int count = 0;
		int[] array = new int[78498]; // total # of primes 78498
		for (int a = 2; a <= n; a++) {

			boolean Prime = true;
			for (int i = 2; i < a - 1; i++) {
				if (a % i == 0) {
					Prime = false;

					break;
				}
			}
			if (Prime == true) {
				array[x] = a;
				System.out.println( a );
				count++;
				x++;
			}

		}

		System.out.println(" count: "+ count);

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> storePattern = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_Prime_Number", "column_Prime_Number");
			storePattern = connectToSqlDB.readDataBase("tbl_Prime_Number", "column_Prime_Number");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_Prime_Number) and displaying to the console");
		for(String st:storePattern){
			System.out.println(st);
		}
	}

//		System.out.println(" count: "+ count);
//
//
//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		List<String> storePattern = new ArrayList<>();
//		connectToSqlDB.insertDataFromArrayToSqlTable( array, "tbl_Prime_Number", "column_Prime_Number" );
////storePattern = connectToSqlDB.readDataBase( "tbl_Prime_Number", "column_Prime_Number" );
//
//
//		System.out.println( "Data is being read from the Table (tablePrimeNumber) and displaying to the console" );
//		for (String st : storePattern) {
//			System.out.print( st + " " );
//		}
//
//	}

	}


