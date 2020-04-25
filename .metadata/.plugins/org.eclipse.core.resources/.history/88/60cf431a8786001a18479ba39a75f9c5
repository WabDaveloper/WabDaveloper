package br.com.nickolas.Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOFacade {
	public String abrirTexto(String arquivo) {
		StringBuilder sb = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(arquivo))) {
			while (scanner.hasNext()) {
				sb.append(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("N�o achei o arquivo pra ler");
			e.printStackTrace();
		}
		return sb.toString();
	}
	public Byte[] abrirBinario(String arquivo) {
		List<Byte> listaBytes = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(arquivo))) {
			while (scanner.hasNextByte()) {
				listaBytes.add(scanner.nextByte());
			}
		} catch (FileNotFoundException e) {
			System.out.println("N�o achei o arquivo pra ler");
			e.printStackTrace();
		}
		return (Byte[]) listaBytes.toArray();
	}

	public Object abrirObjeto(String arquivo) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
			return in.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}



