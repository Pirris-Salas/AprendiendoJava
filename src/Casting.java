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

    }

}
