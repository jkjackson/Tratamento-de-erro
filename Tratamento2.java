package Erro;

import java.io.IOException;

public class Tratamento2 {

	public static void main(String[] args) {
		byte [] bytes = new byte[10];
		System.out.println("Digite algo: ");
		try {
			System.in.read(bytes);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(new String(bytes));		

	}

}
