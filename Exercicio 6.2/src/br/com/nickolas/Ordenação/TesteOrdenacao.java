package br.com.nickolas.Ordenação;

import java.util.Random;

public class TesteOrdenacao {

		public static void main (String[] args) {
			
			Random random = new Random ();
			Ordenacao ordenacao = null;
			int numero = random.nextInt(4);
			
			if(numero == 0) {
				ordenacao = new BubbleSort();
			} else if (numero == 1) {
				ordenacao = new InsertionSort();
			} else if (numero == 2 ) {
				ordenacao = new SelectionSort();
			} else if (numero == 3) {
				ordenacao = new QuickSort();
			}
			
			Ordenador ordenador = new Ordenador(ordenacao);
			int vetor [] = {18,8,65,789,10,165,30,123,5,3,2,13} ;
			ordenador.ordenarVetor(vetor);
			
		}			
	
}
