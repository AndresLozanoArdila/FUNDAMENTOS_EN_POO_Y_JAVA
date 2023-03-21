package retos;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

        Scanner grados = new Scanner(System.in); {
            double K,C;
            float g_harina,k_harina,n_personas;

            System.out.println("Porfavor ingrese el numero de grados Celsius que desea convertir a grados Kelvin");
            C=grados.nextInt();

            K=273.15+C;

            System.out.println("Porfavor ingrese el numero de personas que comerán de la torta");
            n_personas=grados.nextInt();

            System.out.println("Los "+C+"° Celsius se convirtieron a "+K+"° Kelvin");

            g_harina = n_personas * 13;
            k_harina = g_harina / 1000;

            System.out.println("La cantidad de arina en kilogramos es: "+k_harina+"");
            grados.nextLine();
            grados.close();
        }
    }
}
