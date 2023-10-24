import java.io.PrintStream;
import java.util.Scanner;

public class Ejer24 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int est1 = 0;
        int est2 = 0;
        int est3 = 0;
        int estaux = 0;

        screen.print("Ingrese la primera estatura: ");
        est1 = keyboard.nextInt();
        screen.print("Ingrese la segunda estatura: ");
        est2 = keyboard.nextInt();
        screen.print("Ingrese la tercera estatura: ");
        est3 = keyboard.nextInt();

        if (est3 < est2){
            estaux=est3;
            est3=est2;
            est2=estaux;
        }
        if (est2 < est1){
            estaux=est2;
            est2=est1;
            est1=estaux;
        }
        if (est3 < est2){
            estaux=est3;
            est3=est2;
            est2=estaux;
        }

        screen.println("Las estaturas ordenadas van de la siguiente manera: ");
        screen.println(est1);
        screen.println(est2);
        screen.println(est3);
    }
}
