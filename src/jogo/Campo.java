package jogo;

public class Campo {
	
	String campo[][] = new String[3][3];
	
	public boolean getPosicao(int posicao) {
		
		switch (posicao) {
			case 1:
				if(campo[0][0].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 2:
				if(campo[0][1] != null) {
					System.out.println("Posição já ocupada.");
					return false;
				} else {
					return true;
				}
			
			case 3:
				if(campo[0][2].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 4:
				if(campo[1][0].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 5:
				if(campo[1][1].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 6:
				if(campo[1][2].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 7:
				if(campo[2][0].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
			
			case 8:
				if(campo[2][1].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}
				
			case 9:
				if(campo[2][2].equals(null)) {
					System.out.println(campo[0][0]);
					return true;
				} else {
					System.out.println("Posição já ocupada.");
					return false;
				}		
			
			default:
				System.out.println("Posição inválida!");
				return false;			
		}
		
	}
	
	public boolean setPosicao(String jogador, int posicao) {

		boolean livre = getPosicao(posicao);
		
		if(livre) {
			
			switch (posicao) {
				case 1: 
					campo[0][0] = jogador;
					return true;
				
				case 2: 
					campo[0][1] = jogador;
					return true;
				
				case 3:
					campo[0][2] = jogador;
					return true;

				case 4:
					campo[1][0] = jogador;
					return true;
					
				case 5:
					campo[1][1] = jogador;
					return true;
					
				case 6:
					campo[1][2] = jogador;
					return true;
					
				case 7:
					campo[2][0] = jogador;
					return true;
					
				case 8:
					campo[2][1] = jogador;
					return true;
					
				case 9:
					campo[2][2] = jogador;
					return true;
					
				default:
					return false;
			}
		}
		
		return false;
		
	}
	
	public void verificarVitoria() {
		if( campo[0][0].equals("X") && campo[0][1].equals("X") && campo[0][2].equals("X") || 
			campo[1][0].equals("X") && campo[1][1].equals("X") && campo[1][2].equals("X") ||	
			campo[2][0].equals("X") && campo[2][1].equals("X") && campo[2][2].equals("X") ||
			
			campo[0][0].equals("X") && campo[1][0].equals("X") && campo[2][0].equals("X") || 
			campo[0][1].equals("X") && campo[1][1].equals("X") && campo[2][1].equals("X") ||	
			campo[0][2].equals("X") && campo[1][2].equals("X") && campo[2][2].equals("X") ||
			
			campo[0][0].equals("X") && campo[1][1].equals("X") && campo[2][2].equals("X") || 
			campo[0][2].equals("X") && campo[1][1].equals("X") && campo[2][0].equals("X")) {
			
		}
	}
	
	public void montarCampo() {
		
		String campoAuxiliar[][] = new String[3][3];
		
		for(int i=0; i < 10; i++) {
			System.out.println(" ");
		}
		
		for (int i=0; i < campo.length;i++) {
			for(int j=0; j < campo.length;j++) {
				if(campo[i][j] != null) {
					campoAuxiliar[i][j] = campo[i][j];
				} else {
					campoAuxiliar[i][j] = "    ";
				}
			}
		}
		
		System.out.println("  "+campoAuxiliar[0][0]+" | "+campoAuxiliar[0][1]+" | "+ campoAuxiliar[0][2]);
		System.out.println("———————————————————————");
		System.out.println("  "+campoAuxiliar[1][0]+" | "+campoAuxiliar[1][1]+" | "+ campoAuxiliar[1][2]);
		System.out.println("———————————————————————");
		System.out.println("  "+campoAuxiliar[2][0]+" | "+campoAuxiliar[2][1]+" | "+ campoAuxiliar[2][2]);
	}

}
