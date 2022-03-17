/*
Faça um programa que receba dois números inteiros e gere os 
números inteiros que estão no intervalo compreendido por eles. 
No final, exiba a soma dos numeros.
*/
import java.util.Scanner;
public class Questao4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int a = sc.nextInt();//essa variavel servirá para indicar onde começara o for

		System.out.println("Digite o segundo numero");
		int b = sc.nextInt();//essa variavel serve para indicar até onde o for deve ir

		int soma = 0;//variavel auxiliar pra guardar a soma dos numeros

		for (int i = a ; i<=b ;i++ ) {
			System.out.println(i);

			soma += i;
		}

		System.out.println("A soma dos numeros eh: "+soma);
		

	}
}
