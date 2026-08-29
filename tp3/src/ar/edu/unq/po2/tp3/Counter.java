package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List <Integer> numbers= new ArrayList<Integer>(); 
		
	public void addNumber(int i) {
		numbers.add(i);
	}
	
	public int getEvenOcurrences() {
		int acc= 0;
		for (Integer number: numbers) {
			if (number % 2 == 0) {
				acc= acc + 1;
			}
		}
		return acc; 
	}
}
