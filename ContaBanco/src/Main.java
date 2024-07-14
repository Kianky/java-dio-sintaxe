import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String nomeClient; 
		float saldo;
		String agencia;
		String numero;
		Scanner input = new Scanner(System.in);

		System.out.println("Por favor, digite o número da agencia: \n");
		agencia = input.next();
		System.out.println("Por favor, digite o número da conta: \n");
		numero = input.next();
		System.out.println("Por favor, digite seu nome completo: \n");
		nomeClient = input.next();
		System.out.println("Por favor, digite seu saldo atual: \n");
		saldo = input.nextFloat();
		ContaTerminal conta1 = new ContaTerminal(numero, agencia, nomeClient, saldo);
		
		System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
	}

}
