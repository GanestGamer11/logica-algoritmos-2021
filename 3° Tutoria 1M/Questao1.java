/*
Crie um programa que peça ao usuario seu nome, idade e matricula, 
depois imprima-os dentro de um mesmo sysout/output/comando de imprimir...

Para usar o Scanner:
1° deve se importa-lo da biblioteca do java, pra isso, basta colocar "import java.util.Scanner;"
antes do começo da classe
2° devemos inicialziar o Scanner, para isso basta colocar "Scanner (nome do Scanner)" = new Scanner(System.in);
agr sempre que quisermos usar o Scanner, basta chamar pelo seu nome;
3° para usa-lo temos de colocar o nome.next(tipo da variavel onde será guardado o que for digitado)
ex: int a = sc.nextInt();


*/
import java.util.Scanner;//importando o Scanner da biblioteca do java

public class Questao1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//Inicializando o Scanner, e dando um nome a ele

		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();//declaramos a String nome e ela será igual ao que o Scanner coletar na proxima linha, ou seja, sc.nextLine();

		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();//declaramos o int idade, e ele será igual ao proximo numero inteiro que o usuario digitar, ou seja, sc.nextInt();

		sc.nextLine();//Geralmente, apos coletar numero e depois texto, o buffer do Scanner pode ficar sujo e ele não coletar a proxima coisa. Pra limpa-lo, basta manda-lo coletar o nada. sc.nextLine();

		System.out.println("Digite sua matricula:");
		String matricula = sc.nextLine();//declaramos a String matricula, e ela será igual a o que o usuario digitar na proxima linha, ou seja, sc.nextLine();


		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nMatricula: "+matricula);//o \n serve para indicar ao java que queremos dar uma quebra de linha no texto, ou seja, dar um enter.		



	}
}
