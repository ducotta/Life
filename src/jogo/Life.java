package jogo;

public class Life {
	private int qtdColunas;
	private int matriz[][];

	public Life(int qtdColunas) {
		this.qtdColunas = qtdColunas;
		this.matriz = new int[this.qtdColunas][this.qtdColunas];
	}

	public void inicializar() {
		for (int i = 1; i < (this.qtdColunas - 1); i++) {
			for (int j = 1; j < (this.qtdColunas - 1); j++) {
				matriz[i][j] = (int) (Math.random() * 1.5);
			}
		}
	}

	public void inicializar(int matriz[][]) {
		this.matriz = matriz;
	}

	public void imprimeTabuleiro() {
		int i, j;

		for (i = 0; i < qtdColunas; i++) {

			for (j = 0; j < qtdColunas; j++) {

				if (matriz[i][j] == 1)
					System.out.print("*");
				else
					System.out.print(".");
			}
			System.out.println();
		}
		System.out.println();
	}

	private int pegarVizinho(int i, int j){
		try{
			return matriz[i][j];
		}catch(Exception e){
			return 0;
		}
	}

	public int vizinhos(int i, int j) {
		return pegarVizinho(i - 1,j - 1) +pegarVizinho(i - 1,j )+pegarVizinho(i - 1,j+1)
				+pegarVizinho(i,j - 1)+pegarVizinho(i ,j + 1)
				+pegarVizinho(i + 1,j - 1)+pegarVizinho(i + 1,j)+pegarVizinho(i + 1,j + 1);

	}

	public int[][] iteracao() {
		int aux[][] = new int[this.qtdColunas][this.qtdColunas];

		for (int i = 0; i < qtdColunas; i++) {
			for (int j = 0; j < qtdColunas; j++) {
				if (matriz[i][j] == 1) {
					if (vizinhos(i, j) < 2 || vizinhos(i, j) > 3) {
						aux[i][j] = 0;
					} else
						aux[i][j] = 1;
				} else {
					if (vizinhos(i, j) == 3) {
						aux[i][j] = 1;
					} else
						aux[i][j] = 0;
				}
			}
		}

		return aux;
	}

	public void simulaVida(int quant) {
		int i;

		for (i = 0; i < quant; i++) {
			imprimeTabuleiro();
			matriz = iteracao();
		}
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
}
