package br.com.usjt.Transformador;

public class Maiusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Texto em minusculo: " + texto.toLowerCase());
	}

}
