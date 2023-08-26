package Herencia;

public class Docente extends Persona {

    private String cargo;
    private int horasTrabajadas;

    public Docente(String nombre, int dni, double sueldoBasico, String cargo, int horasTrabajadas) {
        super(nombre, dni, sueldoBasico);
        this.cargo = cargo;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double sueldo(){
        double newSueldo = super.sueldo();
        if(horasTrabajadas > 20){
            newSueldo = newSueldo * 1.2;
        }
        return newSueldo;
    }
}
