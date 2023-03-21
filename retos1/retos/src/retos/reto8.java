package retos;
import java.util.Scanner;


public class reto8 {

    public static void main(String[] args) {
        Scanner auxilioaprendiz = new Scanner(System.in);

        String nombre, auxilio;
        boolean registrado = false;

        System.out.print("Ingrese el nombre del aprendiz: ");
        nombre = auxilioaprendiz.nextLine();

        if (registrado) {
            System.out.println(nombre + " ya tiene un auxilio registrado.");
        } else {
            System.out.print("Ingrese el tipo de auxilio (Ejemplo: 'Alimentación, '): ");
            auxilio = auxilioaprendiz.nextLine();

            registrado = true;
            System.out.println(nombre + " ha sido registrado para el auxilio de " + auxilio + ".");
        }

        auxilioaprendiz.close();
    }
}

