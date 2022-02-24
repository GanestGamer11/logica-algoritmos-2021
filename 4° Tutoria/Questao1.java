/*
peça ao usuario que digite dois numeros, 
depois faça a comparação deles e informe qual é o maior.
*/

import java.util.Scanner;//importando o Scanner

public class Questao1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Criando o objeto Scanner

		System.out.println("Digite dois numeros");
		int a = sc.nextInt();//Coletando o numero que o usuario digitar
		int b = sc.nextInt();//rt

		if(a>b){//se a for maior do que b, exibira a msg o primeiro é o maior
			System.out.println("o Primeiro numero e o maior: "+a);
		}else if(a==b){//se A for igual a B, exibira a msg que os numeros são iguais
			System.out.println("Os numeros sao iguais :)");
		}else{//se nenhum dos casos acima for verdadeiro, exibira que o segundo numero é o maior
			System.out.println("O seguindo numero é o maior: "+b);
		}



	}
}
