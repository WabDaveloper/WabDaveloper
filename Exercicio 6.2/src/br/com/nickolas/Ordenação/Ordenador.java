package br.com.nickolas.Ordenação;

public class Ordenador {
	private final Ordenacao ordenacao;
	
	public Ordenador(Ordenacao ordenacao) {
		this.ordenacao = ordenacao;
		}
	public void ordenarVetor (int[]vetor) {
		ordenacao.ordenar(vetor);
	}
}
