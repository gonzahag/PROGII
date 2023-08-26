package Escuela;

public class Main {

    public static void main(String args[]){

        Estudiante estudiante1 = new Estudiante("Gonzalo", "José Marmol", "Programacion", 2023, 7500);

        System.out.println(estudiante1.toString());

        Directivos directivo1 = new Directivos("Roberto", "Jose Marmol", "Nacional", 350000);

        System.out.println(directivo1.toString());

    }

}
