package jogo;

public class Movimentos {
	
	Campo campo = new Campo();
	
	public int jogar(String jogador, int posicao) {
		
		return campo.setPosicao(jogador, posicao);
		
	}
}
