package br.com.usjt.exercicio81;


public class NoticiarioAssina extends Noticiario{
	
	Noticia noticia;
    Consumidor consumidor = new Consumidor();
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		
		this.noticia = new Noticia(textoNoticia,dia,mes,topico);
		this.notificarConsumidores();
			
		
	}
	
		public void notificarConsumidores() {
			System.out.println("TODOS OS CONSUMIDORES FORAM NOTIFICADOS!");
			consumidor.consomeNoticia(noticia);
			
			
		}
		

		
	}
	
