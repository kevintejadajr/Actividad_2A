import java.io.PrintStream;
import java.util.Scanner;

public class Ejer23 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int llan = 120000;
        int llanprom = 108000;
        int numllan = 0;
        String msj = "";

        screen.println("Ingrese la cantidad de llantas que necesita: ");
        numllan = keyboard.nextInt();

        if (numllan > 0 && numllan < 4){
            int preciollan = llan*numllan;
            msj="El precio para las "+numllan+" llantas es de: "+preciollan;
        }
        else if (numllan >= 4){
            int preciollan = llanprom*numllan;
            msj="El precio para las "+numllan+" llantas es de: "+preciollan;
        }
        screen.println(msj);
    }
}
