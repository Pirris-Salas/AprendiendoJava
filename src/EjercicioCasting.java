public class EjercicioCasting {

    public static void main(String[] args){

       //Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes
        // casteos indicando qué tipo es y si se está calculando estimación o exactitud.


        char c = 'z';
        int y = c;
        System.out.println(y); //EXACTITUD

        int i = 250;
        long l = i;
        System.out.println(l); //EXACTITUD

        short s = (short) l;  //ESTIMACIÓN
        System.out.println(s);

        double d = 301.067;
        long dL = (long) d;   // ESTIMACIÓN
        System.out.println(dL);

        int in = 100;
        float f = in + 5000.66F; //EXACTITUD
        System.out.println(f);

        int ini = 737 * 100;
        byte b = (byte) ini;   //ESTIMACIÓN
        System.out.println(b);

        double dou = 298.638 / 25;
        long lo = (long) dou;  //ESTIMACIÓN
        System.out.println(lo);

    }

}
