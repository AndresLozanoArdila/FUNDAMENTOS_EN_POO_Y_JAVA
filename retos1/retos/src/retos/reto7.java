package retos;
import java.util.Random;
import java.util.Scanner;

public class reto7 {
    

    public static void main(String[] args) {
        Scanner piedrapapeltijera = new Scanner(System.in);
        Random random = new Random();
        int saldo = 0;
        int vidas = 3;

        System.out.println("Bienvenido al juego de piedra, papel o tijera.");
        System.out.println("¿Cuánto dinero deseas insertar?");
        saldo = piedrapapeltijera.nextInt();

        while (vidas > 0 && saldo > 0) {
            System.out.println("Tu saldo actual es: " + saldo);
            System.out.println("¿Cuánto dinero deseas apostar? (máximo: " + saldo + ")");
            int apuesta = piedrapapeltijera.nextInt();

            if (apuesta > saldo) {
                System.out.println("No tienes suficiente saldo para realizar esa apuesta.");
                continue;
            }

            if (apuesta <= 0) {
                System.out.println("La apuesta debe ser mayor que cero.");
                continue;
            }

            saldo -= apuesta;

            System.out.println("Elige tu jugada:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");

            int jugadaJugador = piedrapapeltijera.nextInt();

            if (jugadaJugador < 1 || jugadaJugador > 3) {
                System.out.println("Jugada inválida.");
                continue;
            }

            int jugadaComputadora = random.nextInt(3) + 1;

            System.out.println("Tu jugada: " + (jugadaJugador));
            System.out.println("Jugada de la computadora: " + (jugadaComputadora));

            int resultado = (jugadaJugador);

            if (resultado == 0) {
                System.out.println("Empate.");
                saldo += apuesta;
            } else if (resultado == 1) {
                System.out.println("Ganaste.");
                saldo += apuesta * 2;
            } else {
                System.out.println("Perdiste.");
                vidas--;
            }

            System.out.println("Tu saldo actual es: " + saldo);
            System.out.println("Vidas restantes: " + vidas);
        }

        if (vidas == 0) {
            System.out.println("Se te acabaron las vidas. Fin del juego.");
        } else if (saldo == 0) {
            System.out.println("Se te acabó el dinero. Fin del juego.");
            piedrapapeltijera.close();
        }
    }
}
