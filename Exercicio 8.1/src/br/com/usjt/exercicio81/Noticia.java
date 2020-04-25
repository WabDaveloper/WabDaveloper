package br.com.usjt.exercicio81;

public class Noticia {
	
	private String texto;
	private int dia;
	private int mes;
	private String topico;

	public Noticia(String texto, int dia, int mes, String topico) {

		this.texto = texto;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}
	
	public String toString() {
		return "Noticia [textoNoticia=" + texto + ", dia=" + dia + ", mes=" + mes + ", topico=" + topico + "]";
	}
	
	
	
}
