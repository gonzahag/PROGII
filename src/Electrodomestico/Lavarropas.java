package Electrodomestico;

public class Lavarropas extends Electrodomestico {

    protected final static int CARGA_DEFECTO = 5;

    private int carga;

    public Lavarropas(double precioBase, String color, char consumo, double peso, int carga){
        super(PRECIO_DEFECTO, COLOR_DEFECTO, CONSUMO_DEFECTO, PESO_DEFECTO);
        this.carga = CARGA_DEFECTO;

    }

    public Lavarropas(double precioBase, double peso, String color, char consumo, int carga){
        super(precioBase, COLOR_DEFECTO, CONSUMO_DEFECTO, peso);
        this.carga = CARGA_DEFECTO;
    }



}
