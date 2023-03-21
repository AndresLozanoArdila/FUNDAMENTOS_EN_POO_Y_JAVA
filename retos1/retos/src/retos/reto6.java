package retos;

import java.util.Random;
import java.util.Scanner;

public class reto6 {
   
    public static void main(String[] args) {
        Scanner carasello = new Scanner(System.in);
        Random random = new Random();

        int dinero = 0;
        while (dinero <= 0) {
            System.out.print("Ingrese la cantidad de dinero con la que desea jugar: ");
            dinero = carasello.nextInt();
            if (dinero <= 0) {
                System.out.println("Ingrese una cantidad válida.");
            }
        }

        int vidas = 3;
        boolean jugando = true;

        while (jugando) {
            System.out.println("Tienes " + dinero + " de dinero.");

            int apuesta = 0;
            while (apuesta <= 0 || apuesta > dinero) {
                System.out.print("¿Cuánto quieres apostar? (1-" + dinero + "): ");
                apuesta = carasello.nextInt();
                if (apuesta > dinero) {
                    System.out.println("No puedes apostar más de lo que tienes.");
                }
            }

            int resultado = random.nextInt(2); // 0 es cara, 1 es sello
            if (resultado == 0) {
                System.out.println("Es cara.");
            } else {
                System.out.println("Es sello.");
            }

            if (resultado == 0) {
                dinero += apuesta;
                System.out.println("¡Ganaste " + apuesta + " de dinero!");
            } else {
                vidas--;
                System.out.println("Perdiste una vida. Te quedan " + vidas + " vidas.");
                if (vidas == 0) {
                    System.out.println("Te quedaste sin vidas. Juego terminado.");
                    jugando = false;
                }
            }

            if (dinero == 0) {
                System.out.println("Te quedaste sin dinero. Juego terminado.");
                jugando = false;
            }
        }

        System.out.println("Gracias por jugar.");
        carasello.close();
    }
}
