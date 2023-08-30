package Electrodomestico;

public class Televisor extends Electrodomestico{

    protected final static int PULGADAS_DEFECTO = 20;
    protected final static boolean TDT_DEFECTO = false;

    private int pulgadas;
    private boolean tdt;


    public Televisor(){
        super(PRECIO_DEFECTO, COLOR_DEFECTO, CONSUMO_DEFECTO, PESO_DEFECTO);
        this.pulgadas = PULGADAS_DEFECTO;
        this.tdt = TDT_DEFECTO;
    }

    public Televisor(double precioBase, double peso){
        super(precioBase, peso);
        this.pulgadas = PULGADAS_DEFECTO;
        this.tdt = TDT_DEFECTO;
    }

    public Televisor(double precioBase, double peso, String color, char consumo, int pulgadas, boolean tdt){
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }


    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double precioFinal(char consumo, double peso) {
        double precioFinal = super.precioFinal(consumo, peso);
        if (getPulgadas() > 40){
            precioFinal *= 1.30;
        }
        if (isTdt()){
            precioFinal += 50;
        }

        return precioFinal;
    }




}
