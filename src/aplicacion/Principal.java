/*Copyright [2021] (Daniel Fernández López copyright) Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.*/

package aplicacion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * La clase Principal inicializa el programa.
 * @author Daniel Fernández lópez
 */
public class Principal {

    /**
     * Método main a partir del que se llevará a cabo la ejecución del programa.
     * @param args
     */
    public static void main(String[] args) {

        Boolean condition = true;
        Boolean condition2 = true;
        System.out.println("Bienvenid@, ¿Cómo te llamas?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenid@ " + nombre + ", por favor, introduzca un número: ");

        while (condition2) {
            try {
                int numero = sc.nextInt();
                Random random = new Random();
                int low = 1;
                int high = numero;
                int result = random.nextInt(high - low) + low;
                System.out.println(nombre + " ahora introduzca un número entre 1 y " + numero + " para adivinar el número generado:");

                while (condition) {
                    try {

                        int numeroApedir = sc.nextInt();
                        if (numeroApedir == result) {
                            System.out.println("Has acertado!!");
                            System.exit(0);
                            condition = false;
                        } else if (numeroApedir > result) {
                            System.out.println("El número introducido es mayor que el generado");
                            System.out.println("Por favor," + nombre + " vuelva a introducir un valor entre 1 y " + numero + ":");
                            //condition = true;
                        } else if (numeroApedir < result) {
                            System.out.println("El número introducido es menor que el generado");
                            System.out.println("Por favor," + nombre + " vuelva a introducir un valor entre 1 y " + numero + ":");
                            //condition = true;
                        } else if (numeroApedir != result) {
                            System.out.println("Ese no era el número correcto");
                            System.out.println("Por favor," + nombre + " introduce un nuevo número: ");
                            //condition = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor," + nombre + " introduzca un número");
                        sc.next();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor," + nombre + " introduzca un número");
                sc.next();
            }
        }
    }
}
