package Autor;

public class Main2 {

    public static void main(String args[]){

        Autor autor1 = new Autor("Gonzalo", "gonza@gmail.com", "m");
        Autor autor2 = new Autor("Diego", "diego@gmail.com", "m");
        Autor autor3 = new Autor("Gabi", "gabi@gmail.com", "f");


        Autor[] autoresLibro1 = {autor1, autor2};
        Autor[] autoresLibro2 = {autor1, autor3};


        Libro2 libro = new Libro2("Libro1", autoresLibro1, 200);
        Libro2 libro2 = new Libro2("Libro2", autoresLibro2, 150);

        System.out.println(libro.getnombreAutores());
        System.out.println(libro2.getnombreAutores());

    }

}
