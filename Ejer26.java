import java.io.PrintStream;
import java.util.Scanner;

public class Ejer26 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long cel = 0;
        String oper = "";

        screen.print("Ingrese el número de la linea celular: ");
        cel = keyboard.nextLong();
        long pref = cel/10000000;

        if (pref >= 310 && pref <= 314){
            oper = "Claro";
        } else if (pref >= 320 && pref <= 323){
            oper = "Claro";
        }
        if (pref >= 300 && pref <= 304){
            oper = "Tigo";
        } else if (pref == 324){
            oper = "Tigo";
        }
        if (pref == 305){
            oper = "ETB";
        }
        if (pref >= 315 && pref < 319){
            oper = "Movistar";
        }
        if (pref == 319){
            oper = "Virgin Mobile";
        }
        if (pref >= 350 && pref <= 351) {
            oper = "Avantel";
        }

        screen.println("La información de la linea móvil se aprecia a continuación: ");
        screen.println("Prefijo: "+pref);
        screen.println("Operador: "+oper);
    }
}
