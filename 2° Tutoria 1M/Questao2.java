/*
crie um progama que peça a o usuario seu nome e depois o imprima.

*/

import java.util.Scanner;

public class Questao2{
	public static void main(String[] args) {
		Scanner pizza = new Scanner(System.in);

		String nome;

		System.out.println("Digite seu nome");
		nome = pizza.nextLine();

		System.out.println("Seu nome eh: "+nome);
	}
}
