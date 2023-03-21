package retos;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        Scanner famisalud = new Scanner(System.in);

        String n_ma,n_doc,n_bb;
        int anio_act,anio_nac,mes_act,mes_nac;
        int res_mes,res_anio,mes_ttl;
        int edad_bb,peso_bb,dosis_bb;

    
        System.out.println("Porfavor ingrese el nombre de la enfermera");
        n_doc=famisalud.nextLine();

        System.out.println("Porfavor ingrese el nombre de la mamá");
        n_ma=famisalud.nextLine();

        System.out.println("Porfavor ingrese el nombre del bebé");
        n_bb=famisalud.nextLine();

        System.out.println("Porfavor ingrese mes actual");
        mes_act=famisalud.nextInt();

        System.out.println("Porfavor ingrese mes de nacimiento de "+n_bb);
        mes_nac=famisalud.nextInt();

        res_mes=mes_act-mes_nac;

        
        System.out.println("Porfavor ingrese año actual");
        anio_act=famisalud.nextInt();

        System.out.println("Porfavor ingrese año de nacimiento de "+n_bb);
        anio_nac=famisalud.nextInt();

        res_anio=anio_act-anio_nac;

        mes_ttl=res_anio*12;
        edad_bb=mes_ttl+res_mes;

        System.out.println("La edad actual de "+n_bb+"es de "+edad_bb+" meses");

        System.out.println("Porfavor ingrese el peso en Kilogramos de "+n_bb);
        peso_bb=famisalud.nextInt();

        dosis_bb=peso_bb+(15 / edad_bb +10)*8; 

        System.out.println("Al hacer la consulta de las dosis la enfermera" 
                            +n_doc+" le informa a la señora "+n_ma+" que la dosis necesaria para "
                            +n_bb+" deben ser "+dosis_bb+" Mililitros");
        famisalud.nextLine();
        famisalud.close();

    }

}