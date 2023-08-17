package Herencia;

public class Persona {

    protected String nombre;
    protected int dni;
    protected double sueldoBasico;


    public double sueldo(){
        return sueldoBasico;
    }

    public Persona(String nombre, int dni, double sueldoBasico) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
}
