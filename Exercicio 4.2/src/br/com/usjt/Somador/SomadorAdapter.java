package br.com.usjt.Somador;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for (int i : vetor) {
			lista.add(i);
		}
		SomadorExistente se = new SomadorExistente();
		return se.somaLista(lista);
	}
	
}