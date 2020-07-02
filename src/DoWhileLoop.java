import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int response = 0;
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){

                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Has seleccionado la opción Movies");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción Series");
                    break;
                default:
                    System.out.println("Opción inválida, favor selccionar una de las opciones del menú");
                    break;
            }
        }while (response != 0);
            System.out.println("Programa finalizado");

    }
}
