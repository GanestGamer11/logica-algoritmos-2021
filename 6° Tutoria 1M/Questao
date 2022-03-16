/*
1. Faça um programa que peça uma nota, entre zero e dez. 
Mostre uma mensagem caso o valor seja inválido e continue pedindo 
até que o usuário informe um valor válido.
*/
import java.util.Scanner;

public class Questao1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean auxi = false;//essa variavel vai servir pro nosso ciclo continuar ocorrendo

		while(auxi != true){//enquanto auxi for diferente de true (isto é, igual a false), este ciclo se repetira

			System.out.println("Digite um numero entre 0 e 10");
			int a = sc.nextInt();

			//Apos digitar um numero, ele é testado se corresponde a condição da questão, que é estar entre 0 e 10

			if (a>=0 && a<=10) {//se a for maior ou igual a 0, e, se a for menor ou igual a 10, essa condição será verdadeira
				System.out.println("Parabens!!!!");
				auxi = true;//se a condição foi verdaderia, então temos que encerrar o ciclo, pra isso mudamos o valor de auxi para true, fazendo com que a condição do while seja falsa e encerrando o ciclo
			}else{
				//se o numero não foi valido, então o ciclo se repetira após exibir essa mensagem
				System.out.println("Digite um numero valido >:(");
			}

		}

		
		//Aqui abaixo segue a mesma questão, sendo feita com outra lógia (mais complicada aliás)
		//caso queira testar o codigo abaixo, lembre de descomenta-lo e comentar o codigo acima

		/*int auxi = 0;
		
		//inicializamos o for e colocamos a seguinte condição, i<2. ou seja, o for só será encerrado se i for maior ou igual a 2 por exemplo
		for(int i = 0; i<2; i++){
			System.out.println("Digite um numero entre 0 e 10");
			int a = sc.nextInt();

			//assim como o de cima, testamos se o numero digitado é valido, se ele for, encerramos o for atribuindo a i, um valor que seja maior ou igual a 2
			if (a>=0 && a<=10) {
				System.out.println("parabenss");
				i=2;
			}else{
				//caso seja falsa a condição, reduziremos i em 1, ou seja. no final do for é adicionado 1 a i, mas se a condição for falsa. é removido de i 1. ou seja, ele ficara num loop de 0 e 1.
				System.out.println("Digite um numero valido");
				i--;
			}

		}*/



	}
}
