import java.util.Scanner;

public class reto2 {
    
    public static void main(String[] args) {
        Scanner compnatacion = new Scanner(System.in);
        
        System.out.println("Ingrese el número de participantes: ");
        int numParticipantes=compnatacion.nextInt();
        
        String[] nombres = new String[numParticipantes];
        double[] tiempos = new double[numParticipantes];
        
        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("Ingrese el nombre del participante " + (i+1) + ": ");
            nombres[i] = compnatacion.next();
            System.out.println("Ingrese el tiempo del participante " + (i+1) + ": ");
            tiempos[i] = compnatacion.nextDouble();
        }
        
        for (int i = 0; i < numParticipantes-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < numParticipantes; j++) {
                if (tiempos[j] < tiempos[minIndex]) {
                    minIndex = j;
                }
            }
            double tempTiempo = tiempos[i];
            tiempos[i] = tiempos[minIndex];
            tiempos[minIndex] = tempTiempo;
            String tempNombre = nombres[i];
            nombres[i] = nombres[minIndex];
            nombres[minIndex] = tempNombre;
        }
        
        System.out.println("Los tres primeros competidores son:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + nombres[i] + " - " + tiempos[i] + " segundos");
            compnatacion.close();

        }
    }
}

