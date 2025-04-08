
public class RegraDeHorarioComercial implements IRegraAgendamento {
	@Override
	public boolean validarHorario(Consulta consulta) throws HorarioInvalidoException {
		int hora = consulta.getData().getHour();

		if (hora < 8 || hora > 18) {
			throw new HorarioInvalidoException("Fora do horário comercial. Não é possível agendar.");
		}

		return true;
	}
}
