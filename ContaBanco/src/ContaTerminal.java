
public class ContaTerminal {
	private String numero;
	private String agencia;
	private String nomeClient; 
	private float saldo;

	public ContaTerminal(String numero, String agencia, String nomeClient, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeClient = nomeClient;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNomeClient() {
		return nomeClient;
	}
	public float getSaldo() {
		return saldo;
	}
}
