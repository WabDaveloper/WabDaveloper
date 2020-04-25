package br.com.usjt.Transformador;

public class Duplicar extends TransformadorDeTextos{

	@Override
	protected void transformar(String texto) {
		String duplicata;
		duplicata = texto;
		System.out.println("String duplicada: "+ duplicata + " " + texto);	
		
	}

}
