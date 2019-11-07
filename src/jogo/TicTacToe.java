package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	private static Scanner sc;

	public static void main(String[] args) {
		Campo campo = new Campo();
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		sc = new Scanner(System.in);

		boolean opcao = true;
		boolean fimDeJogo = true;
		int escolha = 0;
		int jogada = 0;

		System.out.print("Digite um nome para o jogador 1: ");
		jogador1.setNome(sc.nextLine());
		while (opcao) {
			try {
				System.out.println("Escolha seu objeto.");
				System.out.println("1 - X");
				System.out.println("2 - O");
				escolha = sc.nextInt();
			
				if (escolha == 1) {
					jogador1.setObjeto("X");
					jogador2.setObjeto("O");
					opcao = false;
				} else if (escolha == 2) {
					jogador1.setObjeto("O");
					jogador2.setObjeto("X");
					opcao = false;
				} else {
					System.out.println("Opção inválida!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Neste campo só é possivel digitar os números '1' e '2'.");
				sc.next();
			    continue;
			} catch (Exception e) {
				System.out.println("Erro inesperado!");
			}
		}
		
		sc.nextLine();
		System.out.println("Digite um nome para o jogador 2: ");
		jogador2.setNome(sc.nextLine());
		
		while(fimDeJogo) {
			try {
			campo.montarCampo();
			if(jogada == 0) {
				System.out.print(jogador1.getNome()+" escolha a posição que deseja jogar: ");
				jogador1.jogar(jogador1.getObjeto(), sc.nextInt());
				jogada = 1;
			} else if(jogada == 1) {
				System.out.println(jogador2.getNome()+" escolha a posição que deseja jogar: ");
				jogada = 2;
			} else {
				System.out.print(jogador1.getNome()+" escolha a posição que deseja jogar: ");
				jogada = 1;
			}

			} catch (InputMismatchException e) {
				System.out.println("Neste campo só é possivel digitar números.");
				sc.next();
			    continue;
			} catch (Exception e) {
				System.out.println("Erro inesperado!");
			}
		}

	}

}
