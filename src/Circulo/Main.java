package Circulo;

public class Main {

    public static void main(String args[]){

        Circulo circulo1 = new Circulo(10);

        System.out.println("El radio del circulo es: "+circulo1.getRadio());
        System.out.println("El área del círculo es: "+circulo1.getArea());
        System.out.println("La circunferencia del círculo es: "+circulo1.getCircunferencia());

        Cilindro cilindro1 = new Cilindro(10, 10);
        System.out.println(cilindro1.getAltura());
        System.out.println(cilindro1.getVolumen(circulo1));

    }

}
