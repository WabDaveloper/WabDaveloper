package br.com.usjt.Comparador;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1decimal = d1 - Math.floor(d1); //d1 - o inteiro de d1 deixando só o valor depois da virgula
		Double d2decimal = d2 - Math.floor(d2);
		return d1decimal.compareTo(d2decimal); //compara o valor do d1decimal com o d2decimal
	}
}
