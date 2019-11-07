package jogo;

public class Movimentos {
	
	Campo campo = new Campo();
	
	public boolean jogar(String jogador, int posicao) {
		
		return campo.setPosicao(jogador, posicao);
		
	}
}
