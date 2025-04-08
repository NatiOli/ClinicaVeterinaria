
public class FactoryPessoa {
	
	public Pessoa getPessoa(String nome, String registro, String tipoPessoa) {
		if (tipoPessoa.equals("VET"))
			return new Medico(nome, registro);
		if (tipoPessoa.equals("CLI"))
			return new Cliente(nome, registro);
		return null;
	}

}
