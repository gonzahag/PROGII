package Empleado;

public class Main {

    public static void main(String args[]){

        Empleado empleado1 = new Empleado(42790229, "Gonzalo", "Aguirre", 300000);

        System.out.println(empleado1.getNombreCompleto());
        System.out.println(empleado1.getSalarioAnual());
        System.out.println(empleado1.incrementarSalario(20));
        System.out.println(empleado1.toString());

    }

}
