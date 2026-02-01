import java.util.Scanner;

public class Practica0 {
    static Scanner sc = new Scanner(System.in);
    static void run(){
        String nombre;
        System.out.print("Proporciona tu nombre: ");
        nombre = sc.nextLine();
        System.out.printf("Bienvenido %s al curso de POO\n",nombre);
    }

    public static void main(String[] args) {
        run();
    }
}
