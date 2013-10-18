package jogo;

import javax.swing.JOptionPane;

public class ExecutarLife {


	public static void main(String[] args) {
		int tamanho = 5;
		int aux[][] =  new int[tamanho][tamanho];
		Life life = new Life(tamanho);
		
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j < tamanho; j++){
				aux[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite 0=morte ou 1=vida"));
				
			}
		}

	}

}
