/*
2. Escreva um progama que peça 5 numeros e exiba o maior deles.
*/

import java.util.Scanner;
public class Questao2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		int a = sc.nextInt();

		int auxi = a;//para podermos comparar se o numero digitado é maior que outros, devemos utilizar uma variavel auxiliar que guardará o valor do primeiro numero digitado
		// Assim, podemos futuramente compara-la a outros numeros	

		for (int i = 0; i<4 ; i++ ) {//este ciclo se repetira 4 vezes
			System.out.println("Digite outro numero");
			int b = sc.nextInt();

			if(auxi<b){//se o numero digitado foi maior que auxi, auxi passara a ter o valor do numero digitado. Dessa forma, auxi será sempre igual ao maior numero digitado
				auxi=b;
			}
		}

		System.out.println("O maior numero eh: "+auxi);//por fim, exibimos auxi, assim veremos qual foi o maior numero digitado



	}
}