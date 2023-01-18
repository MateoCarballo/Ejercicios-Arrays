package EjerciciosBidimensionales;

import EjerciciosUnidimensionales.misUtilidades.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int filas = 10;
        int columnas = 5;

        int[][] matrizEntradas = new int[filas][columnas];

        for (int i = 0; i < matrizEntradas.length; i++) {
            for (int j = 0; j<matrizEntradas[i].length; j++) {
                matrizEntradas[i][j] = utilidadesMatematicas.numAleatorioEntero(1, 25);
            }
        }

        escribirMatrizBidimensional(escribirMatrizBidimensional(matrizEntradas));
    }
    public static int[][] escribirMatrizBidimensional(int[][] miMatriz) {

        for (int i = 0; i < miMatriz.length; i++) {
            System.out.print("Fila->" + i + "  ");

            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print("|");
                if (miMatriz[i][j] < 10) {
                    System.out.print(0);
                }
                System.out.print(miMatriz[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }

        return miMatriz;
    }
}

