package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> Bdcity=new ArrayList<String>();
		Bdcity.add("Dhaka");
		Bdcity.add("Chittagong");
		Bdcity.add("Comilla");

		List<String>UScity=new ArrayList<String>();
		UScity.add("New York");
		UScity.add("Virginia");
		UScity.add("California");


		List<String>Cdcity=new ArrayList<String>();
		Cdcity.add("Toronto");
		Cdcity.add("Montreal");
		Cdcity.add("Vancouver");

		Map<String,List<String>> listofCities=new HashMap<String,List<String>>();
		listofCities.put("Cities of Bangladesh",Bdcity);
		listofCities.put("States of USA",UScity);
		listofCities.put("Cities of Canada",Cdcity);

		Iterator it=listofCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry<String,List<String>> cityInfo:listofCities.entrySet()){
			System.out.println("Cities of different countries :"+cityInfo.getKey()+"--->"+cityInfo.getValue());
		}

	}

}

