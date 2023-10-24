import java.io.PrintStream;
import java.util.Scanner;

public class Ejer27 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String signozodc = "";
        String fechacumpl = "";
        String cumpl = "";
        int numcumpl = 0;

        screen.println("Ingrese la fecha de nacimiento en formato AAAA-MM-DD");
        fechacumpl = keyboard.nextLine();

        cumpl = fechacumpl.substring(5,7) + fechacumpl.substring(8,10);
        numcumpl = Integer.parseInt(cumpl);

        if ((numcumpl >= 120 && numcumpl <= 131)||(numcumpl >= 201 && numcumpl <= 218)){
            signozodc = "Acuario";
        } else if ((numcumpl >= 219 && numcumpl <= 229)||(numcumpl <= 301 && numcumpl >= 218)){
            signozodc = "Piscis";
        }
        if (signozodc.isEmpty()){
            screen.println("Su signo zodiacal es: "+signozodc);
        } else screen.println("No se pudo determinar su signo zodiacal");
    }
}
