/*
peça ao usuario que digite um numero, e depois digite outro. 
o seu progama devera exibir a tabuada de 2 do primeiro numero, até o segundo numero.

o for possui tres parametros
for( onde vai começar; até onde vai; (incremento ou decremento))

o for executa o que estiver dentro, enquanto a segunda condição for verdadeira
o incremento/decremento serve para ser possivel em algum momento a condição ser falsa e o for encerrar

*/

import java.util.Scanner;

public class Pessego{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		int a = sc.nextInt();//esse numero guardara o valor de onde começara

		System.out.println("Digite outro numero");
		int b = sc.nextInt();//esse numero ira indicar até onde devemos ir
	
		System.out.println("A tabuada de 2");
		//A logica é simples, igualamos "i" a nossa variavel que indica onde começará
		//depois, dizemos que "i" irá até no variavel b
		//e por fim, colocamos um incremento
		for (int i = a; i<=b ;i++ ) {
			System.out.println("A soma de 2+"+i+"="+(2+i));
			System.out.println("A multiplicação de 2+"+i+"="+(2+i));
		}

	}
}
