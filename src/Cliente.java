
public class Cliente extends Pessoa {

	private String cpf;
	private String nome;

	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		System.out.println("Olá Cliente " + this.nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return toString();
	}

}
