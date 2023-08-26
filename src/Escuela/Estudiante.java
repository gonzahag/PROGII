package Escuela;

public class Estudiante extends Persona {

    private String program;
    private int year;
    private double fee;

    public Estudiante(String nombre, String direccion, String program, int year, double fee){
        super(nombre, direccion);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    public String toString() {
        return "Estudiante["+getNombre()+", Direccion: "+getDireccion()+", Programa: "+getProgram()+", Fee: "+getFee()+"]";
    }
}
