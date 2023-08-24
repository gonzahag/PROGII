package Autor;

public class Main {

    public static void main(String args[]){

        Autor autor1 = new Autor("Gonzalo", "gonzahag@gmail.com", "M");

        System.out.println(autor1.toString());


        Libro libro1 = new Libro("Programación II", autor1, 1000, 50);
        System.out.println(libro1.toString());

    }


}
