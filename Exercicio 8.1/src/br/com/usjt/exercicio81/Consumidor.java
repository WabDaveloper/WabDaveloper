package br.com.usjt.exercicio81;


public class Consumidor implements ConsomeNoticia {
	

	@Override
	public void consomeNoticia(Noticia noticia) {
		System.out.println("Fui Notificado!");
		System.out.println(noticia);
		
	}

	

}
