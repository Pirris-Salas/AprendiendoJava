public class IFStatement {

    public static void main(String[] args) {

        boolean isBluethoothEnabled = false;
        int fileSended = 3;

        //Este if es particular ya que al ser un boolean, el mismo se valida si es true or false automáticamente
        if(isBluethoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado.");
        }


    }
}
