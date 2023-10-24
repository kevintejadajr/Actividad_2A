import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        String mensaje = "";

        screen.println("Ingrese un número entero");
        num = keyboard.nextInt();

        if (num == 0){
            mensaje="El número ingresado es 0";
        }
        else if (num < 0){
            mensaje="El número ingresado es negativo";
        }
        else if (num > 0){
            mensaje="El número ingresado es positivo";
        }

        screen.println(mensaje);
    }
}
