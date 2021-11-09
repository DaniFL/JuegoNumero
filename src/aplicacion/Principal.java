package aplicacion;

import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Boolean condition = true;

        System.out.println("Bienvenido, ¿Cómo te llamas?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre + ", por favor, introduce un número: ");

                int numero = sc.nextInt();
                Random random = new Random();
                int low = 1;
                int high = numero;
                int result = random.nextInt(high - low) + low;
                System.out.println("Ahora introduzca un número entre 1 y " + numero + " para adivinar el número generado:");
                

            while (condition) {
                try {

                    int numeroApedir = sc.nextInt();
                    if (numeroApedir == result) {
                        System.out.println("Has acertado!!");
                        condition = false;
                    } else if (numeroApedir > result) {
                        System.out.println("El número introducido es mayor que el generado");
                        System.out.println("Por favor, vuelva a introducir un valor entre 1 y " + numero + ":");
                    } else if (numeroApedir < result) {
                        System.out.println("El número introducido es menor que el generado");
                        System.out.println("Por favor, vuelva a introducir un valor entre 1 y " + numero + ":");
                    } else if (numeroApedir != result) {
                        System.out.println("Ese no era el número correcto");
                        System.out.println("Por favor, introduce un nuevo número: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número");
                    sc.next();

                }
            }

        }
}
