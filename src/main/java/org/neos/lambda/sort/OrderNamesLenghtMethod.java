package org.neos.lambda.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Hugo Hidalgo
 * 15/06/2018
 *
 */
public class OrderNamesLenghtMethod {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("hugo","victoria","veronica","mario","janet","alejandra","roberto");
		Collections.sort(names,Comparator.comparing(String::length));
		
		for(String name: names) {
			System.out.println("name: " + name);
		}
	}

}
