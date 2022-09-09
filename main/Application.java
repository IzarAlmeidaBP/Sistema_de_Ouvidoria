package main;

import java.util.Scanner;

import entities.Manifestacao;
import entities.Usuario;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Manifestacao manifestacao1 = new Manifestacao();

		Usuario usuario = new Usuario();

		System.out.println("Seja Bem Vindo!");

		System.out.println("Ja possui conta\n1-Sim\n2-Não");
		Integer respostaCon = Integer.parseInt(sc.nextLine());

		boolean logado = true;
		while (logado) {
			if (respostaCon == 1) {

				System.out.println("Digite seu Nome do Usuario:");
				String userName = sc.nextLine();

				System.out.println("Digite sua senha:");
				String senhaUser = sc.nextLine();

				System.out.println(
						"Deseja Realizar uma nova Manifestação ou ver as Manifestações em aberto:\n1-Realizar Manifestação\n2-Vizualizar Manifestações em Aberto ");
				Integer respostaMani = Integer.parseInt(sc.nextLine());

				if (respostaMani == 1) {

					System.out
							.println("Qual tipo de manifestação deseja realizar:\n1-Reclamação\n2-Sugestão\n3-Elogio");
					Integer respostaOp = Integer.parseInt(sc.nextLine());

					if (respostaOp == 1) {

						System.out.println("Insira o titulo da sua Reclamaçao:");
						String tituloR = sc.nextLine();
						System.out.println("Insira sua Reclamção:");
						String reclamacaoT = sc.nextLine();
						Manifestacao manifestacao = new Manifestacao(tituloR, reclamacaoT);
						usuario.addManifestacao(manifestacao);

						System.out.println("O Id da sua Manifestação é: " + manifestacao1.getIdMani());
					} else if (respostaOp == 2) {
						System.out.println("Insira o titulo da sua Sugestão:");
						String tituloR = sc.nextLine();

						System.out.println("Insira sua Sugestão:");
						String reclamacaoT = sc.nextLine();

						System.out.println("O Id da sua Manifestação é: " + manifestacao1.getIdMani());
						Manifestacao manifestacao = new Manifestacao(tituloR, reclamacaoT);
						usuario.addManifestacao(manifestacao);

					} else if (respostaOp == 3) {

						System.out.println("Insira o titulo da sua Elogio:");
						String tituloR = sc.nextLine();

						System.out.println("Insira sua Elogio:");
						String reclamacaoT = sc.nextLine();

						System.out.println("O Id da sua Manifestação é: " + manifestacao1.getIdMani());
						Manifestacao manifestacao = new Manifestacao(tituloR, reclamacaoT);
						usuario.addManifestacao(manifestacao);
					}

				} else if (respostaMani == 2) {
					System.out.println(usuario.getManfistacoes());
				} else {
					System.out.println("Resposta Incorreta");
				}
				System.out.println("Deseja continuar:\n1-Sim\n2-Não");
				Integer respsotaConti = Integer.parseInt(sc.nextLine());

				if (respsotaConti == 1) {
					logado = true;

				} else {
					logado = false;

				}
			} else if (respostaCon == 2) {
				System.out.println("Realizar Cadastro\n1-Sim\n2-Não");
				Integer respostaCad = Integer.parseInt(sc.nextLine());

				if (respostaCad == 1) {
					System.out.println("Digite seu Nome Completo:");
					String nomeUser = sc.nextLine();

					System.out.println("Crie um Nome de Usuario:");
					String loginUser = sc.nextLine();

					System.out.println("Crie sua Senha(com 6 digitos):");
					String senhaUser = sc.nextLine();

					Usuario usuario1 = new Usuario(nomeUser, loginUser, senhaUser);

					System.out.println(usuario1);
				}
			}
		}
	}
}