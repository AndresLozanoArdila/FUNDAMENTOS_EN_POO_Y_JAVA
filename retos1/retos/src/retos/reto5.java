package retos;

import java.util.Scanner;

public class reto5 {

    public static void main(String[] args) {
        Scanner tienda=new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = tienda.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = tienda.nextLine();

        System.out.print("Ingrese la cantidad de productos comprados: ");
        int cantidadProductos = tienda.nextInt();

        double total = 0;
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = tienda.nextDouble();
            total += precio;
        }

        System.out.println("\n--- Recibo de compra ---");
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total a pagar: $" + total);
        tienda.close();
    }
}

