package main;

import java.util.Scanner;

import entities.Manifestacao;
import entities.Usuario;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seja Bem Vindo!");
		System.out.println("Realizar Manifestaçao:\n" + "Escolha uma das Opções:\n1-Login\n2-Cadastro\n3-Sair");
		Integer resposta = Integer.parseInt(scanner.nextLine());
		;
		Usuario usuario = new Usuario();
		Manifestacao manifestacao = new Manifestacao();
		boolean continua = true;

		if (resposta == 1) {
			System.out.println("faz login");
		}
		if (resposta == 2) {
			System.out.println("Preencha os dados para realizar seu cadastro:");

			System.out.println("Seu nome completo:");
			String nomeUsuario = scanner.nextLine();
			usuario.setNomeUser(nomeUsuario);

			System.out.println("Seu nome de usuário:");
			String loginUsuario = scanner.nextLine();
			usuario.setLoginUser(loginUsuario);

			System.out.println("Sua senha:");
			String senhaUsuario = scanner.nextLine();
			usuario.setSenhaUser(senhaUsuario);

			usuario.criaUserID();
			System.out.println(usuario.toString());

			System.out.println("Deseja fazer login?\n1-Sim/2-Não ?");
			Integer pergunta = Integer.parseInt(scanner.nextLine());

			if (pergunta == 1) {

				System.out.println("Digite seu login:");
				String login = scanner.nextLine();
				System.out.println("Digite sua senha:");
				String senha = scanner.nextLine();
				if (usuario.verificaUser(login, senhaUsuario) == true) {
					boolean logado = true;
					System.out.println("Deseja fazer manifestação?\n1-Sim/2-Não");
				}

			}

		} else {
			System.out.println("acaba");
		}

	}
}