package teste;

import static org.junit.Assert.*;
import jogo.Life;

import org.junit.Before;
import org.junit.Test;

public class LifeTest {
	
	Life umJogo;

	@Test
	public void testInicializar() {
		umJogo = new Life(5);
		umJogo.inicializar();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				assertNotNull(umJogo.matriz[i][j]);
			}
		}
	}
	
	 @Test
     public void testVizinhos() {                
             umJogo= new Life(3);
             int [][] matriz = {{0,0,0},{0,1,0},{0,0,0}};
             umJogo.setMatriz(matriz);
             assertEquals(0, umJogo.vizinhos(1, 1));
             assertEquals(1, umJogo.vizinhos(0, 0));
             assertEquals(1, umJogo.vizinhos(2, 2));
	 }

	 @Test
     public void testSimulavida() {
             umJogo = new Life(10);
     
             int [][] matriz = {{0,0,0,0,0,0,0,0,0,0},
                                                     {0,0,0,1,0,1,1,1,1,0},
                                                     {0,0,0,0,1,0,0,0,1,0},
                                                     {0,0,0,0,1,1,0,0,0,0},
                                                     {0,1,1,0,1,1,1,0,1,0},
                                                     {0,1,0,0,0,0,1,0,0,0},
                                                     {0,0,1,0,0,0,1,0,0,0},
                                                     {0,0,1,0,1,0,0,0,0,0},
                                                     {0,0,0,0,0,1,1,0,1,0},
                                                     {0,0,0,0,0,0,0,0,0,0}};
             umJogo.setMatriz(matriz);
             umJogo.simulaVida(1);
             int [][]matrizCerta = {{0,0,0,0,0,0,0,0,0,0},
                             {0,0,0,0,1,1,1,1,1,0},
                             {0,0,0,1,0,0,0,0,1,0},
                             {0,0,0,0,0,0,1,1,0,0},
                             {0,1,1,1,1,0,1,1,0,0},
                             {0,1,0,1,0,0,1,0,0,0},
                             {0,1,1,1,0,1,0,0,0,0},
                             {0,0,0,1,0,0,1,1,0,0},
                             {0,0,0,0,0,1,0,0,0,0},
                             {0,0,0,0,0,0,0,0,0,0}};
                             
             
                             for (int i = 0; i < 5; i++) {                          
                     			for (int j = 0; j < 5; j++) {
                     				assertEquals(matrizCerta[i][j], umJogo.matriz[i][j]);
                     			}
                     			 
                             }
                             
     }
}


	