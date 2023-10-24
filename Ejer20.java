import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        String mensaje = "";

        screen.println("Ingrese un numero entero");
        num = keyboard.nextInt();

        if (num % 2 == 0){
            mensaje="Número ingresado par";
        }
        else if (num % 2 != 0){
            mensaje="Número ingresado impar";
        }
        screen.println(mensaje);
    }
}
