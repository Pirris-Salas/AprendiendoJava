public class Arrays {

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

        // Los arrays son considerados objetos, por lo que una vez instanciados se deben de declarar a través de new


        /**
         * Agregando datos a un array de 1 dimensión
         */
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

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

        System.out.println(cities[0][0]); //Primer corchete es renglón, segundo corchete es columna
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);


        String[][][][] chango = new String[2][3][2][2];

        chango[1][0][0][1] = "Monkey";

        System.out.println(chango[1][0][0][1]);

    }


}
