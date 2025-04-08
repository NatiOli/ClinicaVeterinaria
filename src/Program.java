import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		//Cliente
		System.out.println("Bem vindo a Clinica VET!");
		System.out.print("Entre com o nome do Cliente: ");
		String nome = sc.nextLine();
		System.out.println("Entre com o seu cpf: ");
		String cpf = sc.nextLine();
		
		FactoryPessoa factory = new FactoryPessoa();
		
		Pessoa cliente = factory.getPessoa(nome, cpf, "CLI");
		
		//Pet
		System.out.println("Digite abaixo a raca do seu pet: ");
		String racaPet = sc.nextLine();
		System.out.println("Digite abaixo o nome do seu pet: ");
		String nomePet = sc.nextLine();
		System.out.println("Digite abaixo a idade do seu pet (pode ser aproximada): ");
		int idadePet = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite abaixo o peso aproximado do seu pet: ");
		double pesoPet = sc.nextDouble();
		sc.nextLine();
		
		Pet pet = new Pet(racaPet, nomePet, idadePet, pesoPet);

		//Pessoa cliente = new Cliente(cpf, nome);

		// Veterinário

		System.out.println("Digite o nome do veterinário: ");
		String nomeVeterinario = sc.nextLine();
		
		Pessoa vet = factory.getPessoa(nomeVeterinario, "CRMVSP 018", "VET");
		
		//Medico vet = new Medico(nomeVeterinario, "CRMVSP 018", "Emergencia");
		//System.out.println(vet);
		Medico medico= (Medico) vet;
		Diagnostico dg = new Diagnostico("verme", "verme", pet, medico);
		System.out.println(dg);

		System.out.println("Digite a data e hora da consulta: ");
		String data = sc.nextLine();

		try {
			Consulta consulta = new Consulta.Builder().pet(pet).vet(medico)
					.data(LocalDateTime.parse(data, formatter)).regraAgendamento(new RegraDeHorarioComercial()).build();

			System.out.println(consulta);

		} catch (HorarioInvalidoException e) {
			System.out.println("Erro:" + e.getMessage());

		}

		sc.close();

	}

}
