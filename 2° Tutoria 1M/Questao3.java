/*
crie um progama que peça ao usuario 3 numeros diferentes, 
depois realize a somas dos mesmos e por fim, imprima o resultado.

*/


import java.util.Scanner;//importando a classe do Scanner

public class Questao3{
	public static void main(String[] args) {
		Scanner Leandro = new Scanner(System.in);//Inicializando e dando um nome ao Scanner

		int a,b,c;//Inicializando as variaveis do tipo int a,b,c

		System.out.println("Digite o primeiro numero: ");
		a = Leandro.nextInt();//guardando o primeiro valor digitado dentro de a
		System.out.println("Digite o segundo numero: ");
		b = Leandro.nextInt();//guardando o primeiro valor digitado dentro de b
		System.out.println("Digite o terceiro numero: ");
		c = Leandro.nextInt();//guardando o primeiro valor digitado dentro de c

		int soma = a+b+c;//realizando a soma dos numeros e guardando dentro de uma variavel auxiliar (soma)

		System.out.println("A soma dos numeros eh: "+soma);//imprimindo o resultado final

	}
}
