package br.com.nickolas.Direcionador;

public class DirecionadorConsole extends Direcionador{
	
	int i =0;
	@Override
	public void criarLog() {
		// TODO Auto-generated method stub
		for(i = 0; i<=10;i++) {
			System.out.println(i);
		}
		
	}
}
