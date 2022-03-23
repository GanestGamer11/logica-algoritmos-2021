/*

2- Faça um algoritmo que leia um vetor com 10 valores inteiros, 
encontre o maior e o menor valor do vetor e realize a soma de todos os valores.

*/

import java.util.Scanner;

public class Questao1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[10];//inciializando o vetor com dez posições
		int maior, menor;// essas variaveis servirão para guardar o maior e o menor valor
		int soma = 0;//servira para guardar a soma das variaveis

		System.out.println("Digite o 1° valor");
		a[0] = sc.nextInt();//a questão é que precisamos igualar a variavel menor a primeira posição de a. por isso inicializamos aqui fora

		menor = a[0];//se igualarmos a menor a 0, não conseguiriamos saber qual valor seria o menor, já que 0 já seria o menor valor
		maior = a[0];//se inicializarmos a maior com 0, só teriamos problema se trabalhassemos com numeros negativos.

		for (int i = 1; i<10 ;i++ ) {
			System.out.println("Digite o "+(i+1)+"° Numero...");//automatizando as perguntas
			a[i] = sc.nextInt();//dessa forma, conseguimos definir cada posição de A de 1-9 de forma automatica

			soma += a[i];// o simbolo += é a mesma coisa que soma = soma + a[i]. ou seja, ele irá somar o valor interno com o externo, e depois, guardará em si mesmo

			if (maior<a[i]) {//se algum numero for maior que maior, então ele será um possivel maior numero
				maior = a[i];//então igualamos maior a ele
			}
			if(a[i]<menor){//a mesma lógica, só que inversa
				menor = a[i];
			}
		}

		for (int i = 0; i<a.length ;i++ ) {
			System.out.println("A["+i+"] = "+a[i]);//ímprimindo de forma automatizada
		}
		System.out.println("A soma de todos os valores eh"+soma);
		System.out.println("O menor dos valores eh"+menor);
		System.out.println("O maior dos valores eh"+maior);

		

		

	}
}
