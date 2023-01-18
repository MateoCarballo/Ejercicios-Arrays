package misUtilidades;


public final class utilidadesArrays{

    private utilidadesArrays(){

    }

    public static void llenarMatrizInt(int[]miMatriz,int limiteInferior,int limiteSuperior){
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i]= utilidadesMatematicas.numAleatorioEntero(limiteInferior,limiteSuperior);
        }
    }

    public static void ordenarMatrizDouble(double[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        double aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;
                        }
                    }
                }
            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;
                        }
                    }
                }
            }
        }
    }

    public static void ordenarMatrizInt(int[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        int aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;

                        }
                    }

                }

            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;
                        }
                    }
                }
            }
        }
    }

    public static void escribirMatriz(int[]miMatriz){
        for (int i = 0; i < miMatriz.length ; i++) {
            System.out.println("Posicion "+i+"-->"+miMatriz[i]);
        }
    }

}