package Animal;

public class Aguila extends Animal implements Sonido {

    private String nombre;
    private int edad;

    public Aguila(){}

    public Aguila(String nombre, int edad){
        super(nombre, edad);
    }


    @Override
    public void locomocion() {
        System.out.println("El águila vuela!");
    }

    @Override
    public void sonido() {
        System.out.println("El águila emite chillidos");
    }
}
