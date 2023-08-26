package Escuela;

public class Directivos extends Persona {

    private String escuela;
    private double pago;

    public Directivos(String nombre, String direccion, String escuela, double pago){
        super(nombre, direccion);
        this.escuela = escuela;
        this.pago = pago;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public String toString() {
        return "Directivo["+getNombre()+", Direccion: "+getDireccion()+", Pago: "+getPago()+"]";
    }

}
