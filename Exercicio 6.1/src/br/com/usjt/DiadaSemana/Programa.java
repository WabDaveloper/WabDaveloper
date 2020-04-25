package br.com.usjt.DiadaSemana;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe o dia da semana ");
			int dds = entrada.nextInt();
			DiaSemana diaSemana = DiaSemana.values()[dds - 1];
			
			Dia dia = diaSemana.obterMensagem();
			
			
			System.out.println(dia.obterMensagem());
			
		}

	}

}
