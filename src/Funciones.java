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
    /**
     * Descripción: Esta función toma el radio de una circunferencia y devuelve el valor del área de un círculo.
     * @param radio Radio de la circunferencia, acepta decimales.
     * @return Devuelve el área de un círculo.
     *
     * @autor Luis Salas
     * */
public static double circleArea(double radio){

        return Math.PI  * Math.pow(radio,2);
}

    /**
     * Descripción: Esta función toma el radio de una circunferencia y devuelve el valor del área de una esfera
     * @param radio Radio de la circunferencia, acepta decimales.
     * @return Devuelve el área de la esfera
     *
     * @autor Luis Salas
     * */
public static double sphereArea(double radio){

      return   4 * Math.PI * Math.pow(radio,2);
}
/**
 * Descripción: Esta función convierte una cantidad de dinero y la retorna en dólares
 * @param cantidad Cantidad de dinero.
 * @param moneda  Tipo de moneda.
 * <p>Actualmente, esta función está validada solamente para las siguientes monedas: CRC y MXN.</p>
 * @return cantidad Devuelve la cantidad actualizada en dólares
 *
 * @autor Luis Salas
 * */
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
