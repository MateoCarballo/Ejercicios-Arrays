package Avanzados;

import misUtilidades.utilidadesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int tamañoMatriz=20;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] matrizEntradas = new int[tamañoMatriz];
        System.out.println("introduce 20 valores enteros");
        for (int i = 0; i < 20 i++) {
            if (i<10){
                System.out.println("valor "+i);
                matrizEntradas[i]=Integer.parseInt(br.readLine);
            }
            if (i>=10){
                System.out.println("valor "+i);
            }
        }
        }
}