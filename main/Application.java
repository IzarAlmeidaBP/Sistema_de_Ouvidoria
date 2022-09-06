package main;

import java.util.Scanner;

import entities.Manifestacao;
import entities.Usuario;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Usuario usuario = new Usuario();
		Manifestacao manifestacao = new Manifestacao();

		System.out.println("Seja Bem Vindo!");
		System.out.println("Realizar Manifestaçao:\nEscolha uma das Opções:\n1-Login\n2-Cadastro\n3-Sair");
		Integer resposta = Integer.parseInt(sc.nextLine());

		do {

			if (resposta == 1) {
				System.out.println("Digite seu Login: ");
				String login = sc.nextLine();

				System.out.println("Digite a senha: ");
				String senhaUser = sc.nextLine();

				System.out.println("Qual manifestação deseja realizar:\n1-Reclamação\n2-Sugestão\n3-Elogio");
				Integer numeroEscolhido = Integer.parseInt(sc.nextLine());
				if (numeroEscolhido == 1) {
					System.out.println("Digite o Tiutlo da sua Reclamção");
					String titulo = sc.nextLine();
					manifestacao.setTitulo(titulo);

					System.out.println("Digite sua Reclamação");
					String descricao = sc.nextLine();

					System.out.println("O id de sua Reclamção é: " + manifestacao.getId());
					s
					

				}

				System.out.println("Deseja colocar qual titulo?");
				String titulo = sc.nextLine();
				manifestacao.setTitulo(titulo);

				System.out.println("");

			} else if (resposta == 2) {
				System.out.println("Digite seu Nome Completo:");
				String nomeUser = sc.nextLine();
				usuario.setNomeUser(nomeUser);

				System.out.println("Crie seu UserName:");
				String userName = sc.nextLine();
				usuario.setLoginUser(userName);

				System.out.println("Crie sua Senha :");
				String senhaUser = sc.nextLine();
				usuario.setSenhaUser(senhaUser);

			} else {
				System.out.println("Opção Inválida!");

			}
		} while (resposta != 3);

	}

}
