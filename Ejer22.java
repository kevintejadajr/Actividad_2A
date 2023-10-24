import java.io.PrintStream;
import java.util.Scanner;

public class Ejer22 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        String mensaje = "";
        String mensaje2 ="";

        screen.println("Ingrese un número entero");
        num = keyboard.nextInt();

        if (num == 0){
            mensaje="El número ingresado es 0";
        }
        else if (num < 0){
            if (num % 2 == 0){
                mensaje2="par";
            }
            else if (num % 2 != 0){
                mensaje2="impar";
            }
            mensaje="El número ingresado es negativo "+mensaje2;
        }
        else if (num > 0){
            if (num % 2 == 0){
                mensaje2="par";
            }
            else if (num % 2 != 0){
                mensaje2="impar";
            }
            mensaje="El número ingresado es positivo "+mensaje2;
        }

        screen.println(mensaje);
    }
}
