
public class Diagnostico {

	private String nomeDoenca;
	private String descricaoDoenca;
	private Pet animal;
	private Medico doutor;

	public String getNomeDoenca() {
		return nomeDoenca;
	}

	public Diagnostico(String nomeDoenca, String descricaoDoenca, Pet animal, Medico doutor) {
		this.nomeDoenca = nomeDoenca;
		this.descricaoDoenca = descricaoDoenca;
		this.animal = animal;
		this.doutor = doutor;
	}

	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}

	public String getDescricaoDoenca() {
		return descricaoDoenca;
	}

	public void setDescricaoDoenca(String descricaoDoenca) {
		this.descricaoDoenca = descricaoDoenca;
	}

	public Pet getAnimal() {
		return animal;
	}

	public void setAnimal(Pet animal) {
		this.animal = animal;
	}

	public Medico getDoutor() {
		return doutor;
	}

	public void setDoutor(Medico doutor) {
		this.doutor = doutor;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Nome do Animal: " + animal.getNome() + "\n");
		sb.append("Peso do Animal: " + animal.getPeso() + "\n");
		sb.append("Descricao da Doenca: " + descricaoDoenca + "\n");
		sb.append("Médico: " + doutor.getNome());
		return sb.toString();
	}

}
