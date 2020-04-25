package br.com.usjt.Transformador;

public class Inverter extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		String reversed = "";
	    for (int i = texto.length() - 1;  0 <= i; i--) {
	        reversed += texto.charAt(i);
	        }
	    
	    texto = reversed;
	        System.out.println("Texto invertido: " + reversed);	
	}
	

}
