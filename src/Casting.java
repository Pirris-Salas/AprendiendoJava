public class Casting {

    public static void main(String[] args){

        //En un año ubicamos 30 perros
        //Cuántos perros ubicamos por mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);


        // CASTEO ENTRE TIPOS DE DATOS

        //Convirtiendo de int a double, a y b son int, por lo que el resultado de c será entero a no ser que lo
        //convirtamos a double.
        double c = (double) a/b;
        System.out.println(c);

        //convirtiendo de char a int, el resultado es 49 por que en código ACSII 1 equivale a 49. Char como variable es
        //menor que int, por lo que la conversión ser realiza de manera automática
        char n = '1';
        int nI = n;
        System.out.println(nI);

        //convirtiendo de char s short, char es un dato más grande que short, por lo que si requiere convertirlo
        // mediante casting
        short nS = (short) n;
        System.out.println(nS);
    }

}
