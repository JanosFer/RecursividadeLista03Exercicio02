package view;

import controller.RepetidosController;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		RepetidosController rc = new RepetidosController();
		Scanner ler = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		while(true) {
			System.out.println("Informe um número inteiro de 10 a 999999: ");
			n1 = ler.nextInt();
			ler.nextLine();
			if(n1 >= 10 && n1 <= 999999) {
				break;
			}else {
				System.out.println("ERRO: Por favor informe um valor válido!");
			}
		}
		
		while(true) {
			System.out.println("Informe um número inteiro de 0 a 9: ");
			n2 = ler.nextInt();
			ler.nextLine();
			if(n2 >= 0 && n2 < 10) {
				break;
			}else {
				System.out.println("ERRO: Por favor informe um valor válido!");
			}
		}
		
		String numero = n1 + "";
		
		System.out.println("O número '" +n2+ "' aparece " +rc.aparece(numero, numero.length()-1, n2)+ " vezes em '" +n1+ "'.");
		ler.close();
	}
}
