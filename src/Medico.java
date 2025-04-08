
public class Medico extends Pessoa {

	private String crmv;
	private String especialidade;
	private String nome;
	
	public Medico(String crmv, String nome) {
		this.crmv = crmv;
		this.nome = nome;
		this.especialidade = "Veterinario";
		System.out.println("Olá médico " + this.nome);
	}

	public Medico(String nomeVeterinario, String crmv, String especialidade) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Médico: ").append(super.getNome()).append("\n");
		sb.append("CRMV: ").append(crmv).append("\n");
		sb.append("Especialidade: ").append(especialidade).append("\n");

		return sb.toString();

	}

}
