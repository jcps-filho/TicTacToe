package jogo;

public class Campo {
	
	public String campo[][] = new String[3][3];
	public String campoAuxiliar[][] = new String[3][3];
	
	public int getPosicao(int posicao) {
		
		switch (posicao) {
			case 1:
				if(campo[0][0] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 2:
				if(campo[0][1] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 3:
				if(campo[0][2] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 4:
				if(campo[1][0] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 5:
				if(campo[1][1] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 6:
				if(campo[1][2] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 7:
				if(campo[2][0] == null) {
					return 1;
				} else {
					return 0;
				}
			
			case 8:
				if(campo[2][1] == null) {
					return 1;
				} else {
					return 0;
				}
				
			case 9:
				if(campo[2][2] == null) {
					return 1;
				} else {
					return 0;
				}		
			
			default:
				return 2;			
		}
		
	}
	
	public int setPosicao(String jogador, int posicao) {
		
		int resultado = getPosicao(posicao);
		
		if(resultado == 1) {
			
			switch (posicao) {
				case 1: 
					campo[0][0] = jogador;
					campoAuxiliar[0][0] = jogador;
					return 1;
				
				case 2: 
					campo[0][1] = jogador;
					campoAuxiliar[0][1] = jogador;
					return 1;
				
				case 3:
					campo[0][2] = jogador;
					campoAuxiliar[0][2] = jogador;
					return 1;

				case 4:
					campo[1][0] = jogador;
					campoAuxiliar[1][0] = jogador;
					return 1;
					
				case 5:
					campo[1][1] = jogador;
					campoAuxiliar[1][1] = jogador;
					return 1;
					
				case 6:
					campo[1][2] = jogador;
					campoAuxiliar[1][2] = jogador;
					return 1;
					
				case 7:
					campo[2][0] = jogador;
					campoAuxiliar[2][0] = jogador;
					return 1;
					
				case 8:
					campo[2][1] = jogador;
					campoAuxiliar[2][1] = jogador;
					return 1;
					
				case 9:
					campo[2][2] = jogador;
					campoAuxiliar[2][2] = jogador;
					return 1;
			}
		}
		
		return resultado;
		
	}
	
	public int verificarVitoria() {
		int empate = 0;
		
		if( campo[0][0] == "X" && campo[0][1] == "X" && campo[0][2] == "X" || 
			campo[1][0] == "X" && campo[1][1] == "X" && campo[1][2] == "X" ||	
			campo[2][0] == "X" && campo[2][1] == "X" && campo[2][2] == "X" ||
			
			campo[0][0] == "X" && campo[1][0] == "X" && campo[2][0] == "X" || 
			campo[0][1] == "X" && campo[1][1] == "X" && campo[2][1] == "X" ||	
			campo[0][2] == "X" && campo[1][2] == "X" && campo[2][2] == "X" ||
			
			campo[0][0] == "X" && campo[1][1] == "X" && campo[2][2] == "X" || 
			campo[0][2] == "X" && campo[1][1] == "X" && campo[2][0] == "X") {
			
			return 1;
			
		}
		
		if( campo[0][0] == "O" && campo[0][1] == "O" && campo[0][2] == "O" || 
			campo[1][0] == "O" && campo[1][1] == "O" && campo[1][2] == "O" ||	
			campo[2][0] == "O" && campo[2][1] == "O" && campo[2][2] == "O" ||
				
			campo[0][0] == "O" && campo[1][0] == "O" && campo[2][0] == "O" || 
			campo[0][1] == "O" && campo[1][1] == "O" && campo[2][1] == "O" ||	
			campo[0][2] == "O" && campo[1][2] == "O" && campo[2][2] == "O" ||
				
			campo[0][0] == "O" && campo[1][1] == "O" && campo[2][2] == "O" || 
			campo[0][2] == "O" && campo[1][1] == "O" && campo[2][0] == "O") {
			
			return 2;
		}
		
		for (int i=0; i < campo.length;i++) {
			for(int j=0; j < campo.length;j++) {
				if(campo[i][j] != null) {
					empate++;
				} 
			}
		}
		
		if (empate == 9) {
			return 3;
		} 
	
		return 0;
	}
	
	public void montarCampo(int erro) {
		
		for(int i=0; i < 300; i++) {
			System.out.println(" ");
		}
		
		for (int i=0; i < campo.length;i++) {
			for(int j=0; j < campo.length;j++) {
				if(campo[i][j] != null) {
					continue;
				} else {
					campoAuxiliar[i][j] = "";
				}
			}
		}
		
		System.out.println("  "+campoAuxiliar[0][0]+" | "+campoAuxiliar[0][1]+" | "+ campoAuxiliar[0][2]);
		System.out.println("———————————");
		System.out.println("  "+campoAuxiliar[1][0]+" | "+campoAuxiliar[1][1]+" | "+ campoAuxiliar[1][2]);
		System.out.println("———————————");
		System.out.println("  "+campoAuxiliar[2][0]+" | "+campoAuxiliar[2][1]+" | "+ campoAuxiliar[2][2]);
		if(erro != 1) {
			if(erro == 0) {
				System.out.println("Posição já ocupada! Tente novamente");
			} else if(erro == 2) {
				System.out.println("Posição invalida!");
			}
		}
	}

}
