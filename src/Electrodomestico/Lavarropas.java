package Electrodomestico;

public class Lavarropas extends Electrodomestico {

    protected final static int CARGA_DEFECTO = 5;

    private int carga;

    public Lavarropas(){
        super();
        this.carga = CARGA_DEFECTO;

    }

    public Lavarropas(double precioBase, double peso){
        super(precioBase, peso);
        this.carga = CARGA_DEFECTO;

    }

    public Lavarropas(int carga, double precioBase, String color, char consumo, double peso){
        super(precioBase, color, consumo, peso);
        this.carga = CARGA_DEFECTO;

    }


    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(char consumo, double peso) {
        double precioFinal = super.precioFinal(consumo, peso);
        if (getCarga() > 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
