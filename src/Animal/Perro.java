package Animal;

public class Perro extends Animal implements Sonido {

    private String nombre;
    private int edad;

    public Perro(){}

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void locomocion() {
        System.out.println("El perro se mueve sobre sus 4 patas");
    }

    @Override
    public void sonido() {
        System.out.println("El perro está ladrando");
    }
}
