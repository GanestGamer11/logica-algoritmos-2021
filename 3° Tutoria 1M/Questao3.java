/*
crie um programa que receba a base e a altura de um triangulo, depois calcule sua area.
*/

import java.util.Scanner;//importando o Scanner

public class Questao3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Inicializando o Scanner e dando um nome a ele

		System.out.println("Digite a base do triangulo");
		Double base = sc.nextDouble();//base será igual ao proximo Double que o Scanner coletar, ou seja, base=sc.nextDouble();

		System.out.println("Digite a altura do triangulo");
		Double altura = sc.nextDouble();//altura será igual ao proximo Double que o Scanner coletar, ou seja, altura=sc.nextDouble();

		Double area = (base*altura)/2;//a formula pra calcular a area de um triangulo eh base*altura/2. Como queremos que 
		//primeiro a multiplicação seja feita, colocamos um parentese ao redor deles, pra indicar que primeiro, queremos que o
		//java multiplique-os, e depois divida por 2


		System.out.println("A area do triangulo eh: "+area);//imprimi a area, a formula poderia ser usada diretamente aqui tambem
	}
}
