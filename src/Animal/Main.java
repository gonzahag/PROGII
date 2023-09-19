package Animal;

public class Main {

    public static void main(String args[]){

        Gato gato1 = new Gato("Raya", 3);
        Perro perro1 = new Perro("Kira", 3);

        Animal [] mascotas = {gato1, perro1};

        Dueno dueno = new Dueno("Gonzalo", mascotas);

        System.out.println(dueno.getnombreMascotas());


    }
}
