import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String nomeClient; 
		float saldo;
		String agencia;
		String numero;
		Scanner input = new Scanner(System.in);

		System.out.println("Por favor, digite o n�mero da agencia: \n");
		agencia = input.next();
		System.out.println("Por favor, digite o n�mero da conta: \n");
		numero = input.next();
		System.out.println("Por favor, digite seu nome completo: \n");
		nomeClient = input.next();
		System.out.println("Por favor, digite seu saldo atual: \n");
		saldo = input.nextFloat();
		ContaTerminal conta1 = new ContaTerminal(numero, agencia, nomeClient, saldo);
		
		System.out.println("Ol� " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " j� est� dispon�vel para saque.");
	}

}
