
import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner promedionotas= new Scanner(System.in);
        int numnotas,pro,operacion=0 ; 

     System.out.println("Ingresar la cantidad de notas");
     numnotas = promedionotas.nextInt();
     float notas []= new float[numnotas];


     for (int i = 0; i < numnotas; i++) {
        System.out.print("Ingrese la nota " + (i+1) + ": ");
        float nota = promedionotas.nextFloat();
        notas[i] = nota;
        operacion += nota;
    }
    pro= operacion / numnotas;

    if (pro<30) {
        System.out.println("Nota final: " + pro + " - Reprobaste");
    } else if (pro<40) {
        System.out.println("Nota final: " + pro + " - Pasaste Raspando");
    } else {
        System.out.println("Nota final: " + pro + " - Aprobaste con buenos resultados");
    }
    promedionotas.close();
}


}


