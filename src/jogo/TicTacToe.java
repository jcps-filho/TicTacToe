package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	private static Scanner sc;

	public static void main(String[] args) {
		Campo campo = new Campo();
		Jogador jogador = new Jogador();
		sc = new Scanner(System.in);

		boolean opcao = true;
		boolean fimDeJogo = true;
		int escolha = 0;
		int turno = 0;
		int jogada = 0;
		int vitoria = 0;
		int resultado = 1;

		System.out.print("Digite um nome para o jogador 1: ");
		jogador.setPlayer1(sc.nextLine());
		while (opcao) {
			try {
				System.out.println("Escolha seu objeto.");
				System.out.println("1 - X");
				System.out.println("2 - O");
				escolha = sc.nextInt();
			
				if (escolha == 1) {
					jogador.setObjeto1("X");
					jogador.setObjeto2("O");
					opcao = false;
				} else if (escolha == 2) {
					jogador.setObjeto1("O");
					jogador.setObjeto2("X");
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
		jogador.setPlayer2(sc.nextLine());
		
		while(fimDeJogo) {
			try {
			campo.montarCampo(resultado);
			if(turno == 0) {
 				System.out.print(jogador.getPlayer1()+" escolha a posição que deseja jogar: ");
				jogada = sc.nextInt();
				resultado = campo.setPosicao(jogador.getObjeto1(), jogada);
				if(resultado == 1) {
					turno = 1;
				} else if(resultado == 0){	
					turno = 2;
				} else if(resultado == 2) {
					turno = 2;
				}
			} else if(turno == 1) {
				System.out.println(jogador.getPlayer2()+" escolha a posição que deseja jogar: ");
				jogada = sc.nextInt();
				resultado = campo.setPosicao(jogador.getObjeto2(), jogada);
				if(resultado == 1) {
					turno = 2;
				} else if(resultado == 0){
					turno = 1;
				} else if(resultado == 2) {
					turno = 1;
				}
			} else {
				System.out.print(jogador.getPlayer1()+" escolha a posição que deseja jogar: ");
				jogada = sc.nextInt();
				resultado = campo.setPosicao(jogador.getObjeto1(), jogada);
				if(resultado == 1) {
					turno = 1;
				} else if(resultado == 0){
					turno = 2;
				} else if(resultado == 2) {
					turno = 2;
				}
			}
			
			vitoria = campo.verificarVitoria();
			
			if(vitoria == 1) {
				System.out.println("O jogador "+jogador.getPlayer1()+" é o vencedor!");
				System.out.println("Obrigado por jogar!");
				System.exit(0);
			} else if(vitoria == 2) {
				System.out.println("O jogador "+jogador.getPlayer2()+" é o vencedor!");
				System.out.println("Obrigado por jogar!");
				System.exit(0);
			} else if(vitoria == 3) {
				System.out.println("Ops! Houve um empate");
				System.exit(0);
			}else {
				continue;
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
