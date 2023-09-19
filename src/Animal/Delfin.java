package Animal;

public class Delfin extends Animal implements Sonido{

    private String nombre;
    private int edad;

    public Delfin(){}

    public Delfin(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void locomocion() {
        System.out.println("El delfín se desplaza por el agua");
    }

    @Override
    public void sonido() {
        System.out.println("El delfín emite sus chasquidos");
    }
}
