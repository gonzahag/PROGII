package Electrodomestico;

public class Electrodomestico {

    protected final static double PRECIO_DEFECTO = 100.00;
    protected final static String COLOR_DEFECTO = "Blanco";
    protected final static char CONSUMO_DEFECTO = 'F';
    protected final static double PESO_DEFECTO = 5.00;


    private double precioBase;
    private String color;
    private char consumo;
    private double peso;


    public Electrodomestico(){
        this.precioBase = PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso){
        this.color = COLOR_DEFECTO;
        this.consumo = CONSUMO_DEFECTO;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumo, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    private char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};
    private String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
    private double[] aumentoPorConsumo = {100.00, 80.00, 60.00, 50.00, 30.00, 10.00};
    private double[] aumentoPorPeso = {10.00, 50.00, 80.00, 100.00};



    public void comprobarConsumoEnergetico(char consumo){
        for (int i = 0; i < consumos.length; i++){
            if (consumos[i] == consumo){
                this.consumo = consumo;
                break;
            }
        }
        this.consumo = 'F';
    }

    public void comprobarColor(String color){
        for (int i = 0; i < colores.length; i++){
            if (colores[i] == color){
                this.color = color;
                break;
            }
        }
        this.color = "Blanco";
    }

    public double precioFinal(char consumo, double peso){
        double precioFinal = 0;
        for(int i = 0; i < consumos.length; i++){
            if (consumos[i] == consumo){
                precioFinal = precioBase + aumentoPorConsumo[i];
                break;
            }
        }
        if(peso>=0 && peso<=19){
            precioFinal += 10.00;
        } else if (peso >= 20 && peso <= 49){
            precioFinal += 50.00;
        } else if (peso >= 50 && peso <= 79){
            precioFinal += 80.00;
        } else {
            precioFinal += 100.00;
        }
        return precioFinal;
    }


}
