/*
crie um programa bancario que guarde o nome de usuario, 
cpf e saldo de determinada pessoa. Depois imprima as informações.
saida:
Nome: ....
CPF: .....
Saldo: ...
*/

public class Questao1{
	public static void main(String[] args) {
		
		String nome = "Juan Vyctor Silva Garcia de Oliveira";
		String Cpf = "434.567.976-32";
		Double Saldo = 25000.00;
		Double saldo2 = 13.0;

		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+Cpf+"\nSaldo: "+(Saldo+saldo2));


	}
}
