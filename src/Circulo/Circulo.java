package Circulo;

public class Circulo {

    private double radio;
    private String color;

    public Circulo(double radio){
            this.radio = radio;
        }

    public Circulo(double radio, String color) {
            this.radio = radio;
            this.color = color;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia(){
        return Math.PI * radio * 2;
    }

    @Override
    public String toString() {
            return super.toString();
    }
}
