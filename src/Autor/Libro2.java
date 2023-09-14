package Autor;

import java.util.Arrays;

public class Libro2 {

    private String nombre;
    private Autor autores[];
    private double precio;
    private int cantidad;

    public Libro2(String nombre, Autor [] autores, double precio){
        this.nombre = nombre;
        this.autores = autores;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Libro2(String nombre, Autor [] autores, double precio, int cantidad){
        this.nombre = nombre;
        this.autores = autores;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getnombreAutores() {
        String autores = "";
        for(int i = 0; i<this.autores.length; i++){
            autores += this.autores[i].getNombre();
            if(i+1 < this.autores.length) {
                autores += ", ";
            }
        }
        return autores;
    }

    @Override
    public String toString() {
        return "Libro2{" +
                "nombre='" + nombre + '\'' +
                ", autores=" + Arrays.toString(autores) +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
