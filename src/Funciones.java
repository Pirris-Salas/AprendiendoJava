public class Funciones {

    public static void main(String[] args){
        double radio = 3;

        //Area de un círculo
        //pi* radio al cuadrado

        System.out.println(circleArea(radio));

        //Area de una esfera
        //4*PI*r2
        double esfera = sphereArea(radio);
        System.out.println(esfera);


        System.out.println("La cantidad de dolares es: " + convertToDolar(1000, "MXN"));
    }

public static double circleArea(double radio){

        return Math.PI  * Math.pow(radio,2);
}

public static double sphereArea(double radio){

      return   4 * Math.PI * Math.pow(radio,2);
}

public static double convertToDolar(double cantidad, String moneda){

        switch (moneda) {
            case "CRC":
               cantidad = cantidad * 0.0017;
                break;
            case "MXN":
                cantidad = cantidad * 0.044;
                break;
        }
          return cantidad;
}


}
