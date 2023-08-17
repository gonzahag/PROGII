import Herencia.Administrativo;
import Herencia.Docente;

public class Main {

    public static void main(String args[]){

        Administrativo p = new Administrativo("Gonzalo", 42790229, 500000, "Marketing");
        Docente d = new Docente("Marcelo", 16897904, 200000, "Matematicas", 24);

        System.out.println("El DNI de "+p.getNombre()+" es "+p.getDni()+" y su sueldo básico es $"+p.getSueldoBasico());

    }


}
