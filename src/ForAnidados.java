public class ForAnidados {
    public static void main(String[] args) {

        String[] androidVersions = new String[17]; //Vector de 1 dimension, 17 variables.

        /**
         * Vector de 2 dimensiones
         * 4 renglones y 2 columnas
         * */
        String cities[][] = new String[4][2];
        /**
         * +-------------------------+
         * | Country    |  City      |
         * ---------------------------
         * |  México    |  CDMX      |
         * |  México    |Guadalajara |
         * |  Colombia  |  Bogotá    |
         * |  Colombia  |  Medellín  |
         * +-------------------------+
         */

        int [][][] numbers = new int[2][2][2]; // Vector de 3 dimensiones, 2 renglones, 2 columnas, 2 páginas

        int [][][][] numbers4 = new int[2][2][2][2];  // Vector de 4 dimensiones

        String[][][][] chango = new String[2][3][2][2]; // Vector 4 dimensiones


        // Los arrays son considerados objetos, por lo que una vez instanciados se deben de declarar a través de new


        /**
         * Agregando datos a un array de 1 dimensión
         */
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /**
         * Agregando datos a un array de 2 dimensiones
         */
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        /**
         * Agrendo un valor al array de 4 dimensiones, posición 1001
         */
        chango[1][0][0][1] = "Monkey";


        /**
         * Imprimiendo un array de 1 dimension mediante un for
         */
        for(int i = 0; i < androidVersions.length; i++){

            if(androidVersions[i] != null) {
                System.out.println(androidVersions[i]);
            }
        }

        System.out.println();
        /**
         * Imprimiendo un array de 2 dimensiones
         */
        for(int i = 0; i < cities.length; i++ ){

            for (int j = 0; j < cities[i].length ; j++) {

                System.out.println(cities[i][j]);
            }

        }

        /**
         * Imprimiendo un array de 4 dimensiones
         */
        for (int i = 0; i < chango.length ; i++) {
            for (int j = 0; j < chango[i].length ; j++) {
                for (int k = 0; k < chango[i][j].length ; k++) {
                    for (int l = 0; l < chango[i][j][k].length; l++) {


                        if (chango[i][j][k][l] != null){

                            System.out.println(chango[i][j][k][l]);

                        }

                    }

                }

            }

        }

    }
}
