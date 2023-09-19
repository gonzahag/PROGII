package Animal;

public class Gato extends Animal implements Sonido{

    private String nombre;
    private int edad;

    public Gato(){}

    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void locomocion() {
        System.out.println("El gato se mueve sobre sus 4 patas");
    }

    @Override
    public void sonido() {
        System.out.println("El gato está maullando");
    }


    public void banarse(){
        System.out.println("El gato se está bañando");
    }

    public void banarse(int minutos){
        System.out.println("El gato se baña durante "+minutos+" minutos!");
    }
}
