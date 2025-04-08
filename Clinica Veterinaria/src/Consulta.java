import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta implements IRegraAgendamento {
	private Pet pet;
	private Medico vet;
	private LocalDateTime data;

	private Consulta(Builder builder) throws HorarioInvalidoException {
		this.pet = builder.pet;
		this.vet = builder.vet;
		this.data = builder.data;
		this.regraAgendamento = builder.regraAgendamento;

		if (!regraAgendamento.validarHorario(this)) {
			throw new HorarioInvalidoException("Fora do horário comercial. Tente novamente mais tarde!");

		}
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Consulta(Pet pet, Medico vet, LocalDateTime data, IRegraAgendamento regraAgendamento) {
		super();
		this.pet = pet;
		this.vet = vet;
		this.data = data;
		this.regraAgendamento = regraAgendamento;
	}

	public Medico getVet() {
		return vet;
	}

	public void setVet(Medico vet) {
		this.vet = vet;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public IRegraAgendamento getRegraAgendamento() {
		return regraAgendamento;
	}

	public void setRegraAgendamento(IRegraAgendamento regraAgendamento) {
		this.regraAgendamento = regraAgendamento;
	}

	@Override
	public String toString() {
		return "Consulta agendada:\n" + "Pet: " + pet.getNome() + "\n" + "Veterinário: " + vet.getNome() + "\n"
				+ "Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}

	private IRegraAgendamento regraAgendamento;

	public IRegraAgendamento getAgendamento() {
		return regraAgendamento;
	}

	public void setAgendamento(IRegraAgendamento agendamento) {
		this.regraAgendamento = agendamento;
	}

	@Override
	public boolean validarHorario(Consulta consulta) {
		// TODO Auto-generated method stub
		return false;
	}

	public static class Builder {

		private Pet pet;
		private Medico vet;
		private LocalDateTime data;
		private IRegraAgendamento regraAgendamento;

		public Builder pet(Pet pet) {
			this.pet = pet;
			return this;
		}

		public Builder vet(Medico vet) {
			this.vet = vet;
			return this;
		}

		public Builder data(LocalDateTime data) {
			this.data = data;
			return this;
		}

		public Builder regraAgendamento(IRegraAgendamento regraAgendamento) {
			this.regraAgendamento = regraAgendamento;
			return this;
		}

		public Consulta build() throws HorarioInvalidoException {
			return new Consulta(this);
		}
	}

}
