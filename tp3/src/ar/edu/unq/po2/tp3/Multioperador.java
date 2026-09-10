package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List <Integer> numbers= new ArrayList<Integer>(); 
	
	private int suma() {
		int resultado= 0;
		for (Integer number: numbers) {
			resultado += number;
		}
		return resultado;
	}
	
	private int resta() {
		int resultado= 0;
		for (Integer number: numbers) {
			resultado -= number;
		}
		return resultado;
	}
	
	private int multiplicacion() {
		int resultado= 0;
		for (Integer number: numbers) {
			resultado *= number;
		}
		return resultado;
	}
}
