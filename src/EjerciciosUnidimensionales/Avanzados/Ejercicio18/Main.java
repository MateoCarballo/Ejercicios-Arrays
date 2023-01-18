package EjerciciosUnidimensionales.Avanzados.Ejercicio18;

import EjerciciosUnidimensionales.Avanzados.misUtilidades.*;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int tamañoMatriz=30;

        int[] matrizEntradas = new int[tamañoMatriz];

        utilidadesArrays.llenarMatrizInt(matrizEntradas,0,10);
        System.out.println("Orden ascendente");
        Arrays.sort(matrizEntradas);
        System.out.println(Arrays.toString(matrizEntradas));
        System.out.println("Orden descendente");
        utilidadesArrays.ordenarMatrizInt(matrizEntradas,false);
        System.out.println(Arrays.toString(matrizEntradas));

    }
}
