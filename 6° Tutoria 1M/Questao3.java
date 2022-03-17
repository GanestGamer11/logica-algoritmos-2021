/*
Faça um programa que leia 5 números e informe a soma, 
multiplicação e a média dos números.
*/
import java.util.Scanner;
public class Questao3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;//variavel auxiliar que guardará a soma de todos os numeros
		double multi = 1;//variavel auxiliar que guardará a multiplicação de todos os numeros


		for (int i = 0; i<5 ;i++ ) {
			System.out.println("Digite o "+(i+1)+"° Numero");
			double a = sc.nextInt();

			soma  += a;//é a msm coisa que soma = soma + a;
			multi *= a;//é a msm coisa que multi = multi * a;
		}

		System.out.println("A soma de todos os numeros eh: "+soma);
		System.out.println("A multiplicação dos numeros eh: "+multi);
		System.out.println("A media dos numeros eh: "+(soma/5));//Como já temos uma variavel que guarda a soma de todos os numeros, basta dividirmos pela quantidade


	}
}