package br.com.usjt.Incremental;
//singleton eager
public class Incremental {

	private static int count = 0; 
	private int numero;
	private static Incremental inc;
	
	private Incremental() { 
		
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		if(inc==null) {
			inc = new Incremental();
		}
		return inc;
	}
	

	public String toString() {
		return "Incremental " + numero; 
	}
}
