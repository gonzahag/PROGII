package Herencia;

import Herencia.Administrativo;
import Herencia.Docente;

public class Main {

    public static void main(String args[]){

        Administrativo p = new Administrativo("Gonzalo", 12345678, 500000, "Marketing");
        Docente d = new Docente("Marcelo", 87654321, 200000, "Matematicas", 24);

        System.out.println("El DNI de "+d.getNombre()+" es "+d.getDni()+" y su sueldo básico es $"+d.getSueldoBasico()+". Por sus horas trabajadas su sueldo final es: $"+d.sueldo());

    }


}
