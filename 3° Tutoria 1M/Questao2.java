/*
crie um programa que peça o nome do aluno e receba as suas 4 notas, 
depois faça a media aritmetica das notas e imprima o resultado
*/

import java.util.Scanner;//Importação do Scanner

public class Questao2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Inicialização do Scanner e dando um nome a ele.

		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();//nome será igual a o que o Scanner coletar na proxima linha, ou seja, nome=sc.nextLine();

		System.out.println("Digite sua 1° nota");
		Double nota1 = sc.nextDouble();//nota1 será igual a o que o Scanner coletar e será do tipo double, ou seja, nota1=sc.nextDouble();

		System.out.println("Digite sua 2° nota");
		Double nota2 = sc.nextDouble();//nota2 será igual a o que o Scanner coletar e será do tipo double, ou seja, nota2=sc.nextDouble();

		System.out.println("Digite sua 3° nota");
		Double nota3 = sc.nextDouble();//nota3 será igual a o que o Scanner coletar e será do tipo double, ou seja, nota3=sc.nextDouble();

		System.out.println("Digite sua 4° nota");
		Double nota4 = sc.nextDouble();//nota4 será igual a o que o Scanner coletar e será do tipo double, ou seja, nota4=sc.nextDouble();

		System.out.println("A media aritmetica de *"'+nome+"* eh: \n"+((nota1+nota2+nota3+nota4)/4));//A formula da media aritmetica é a soma dos numeros dividido pela quantidade
	}
}
