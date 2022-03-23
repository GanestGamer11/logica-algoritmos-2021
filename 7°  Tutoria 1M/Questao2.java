/*
3- Faça um algoritmo que construa quatro vetores inteiros A, B , C e D de dimensão 6. 
O terceiro vetor deverá conter a soma dos vetores A e B. 
O quarto vetor deverá conter a multiplicação dos vetores A e B. 
Por fim, imprima todos os vetores.
*/


public class Questao2{
	public static void main(String[] args) {
		
		int a[] = {2, 6, 8, 9, 12, 16};
		int b[] = {8, 1, 7, 10, 9, 11};

		int c[] = new int[6];
		int d[] = new int[6];

		for ( int i = 0; i<6 ;i++ ) {
			c[i] = a[i] + b[i];
			d[i] = a[i] * b[i];
		}

		for (int i = 0; i<6 ;i++ ) {
			System.out.println("A["+(i+1)+"] = "+a[i]+" B["+(i+1)+"] = "+b[i]+" Soma = "+c[i]+" Multiplicacao = "+d[i]);
		}


	}
}