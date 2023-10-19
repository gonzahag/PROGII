package TADs;

public class Main {


    public static void main(String args[]){
        List lista1 = new List();

        lista1.agregarInicio(10);
        lista1.agregarFinal(12);
        lista1.agregarInicio(9);
        lista1.agregarMedio(11, 2);

        lista1.imprimir();

        if(lista1.buscarElemento(13)){
            System.out.println("Existe.");
        } else {
            System.out.println("No existe.");
        }

    }





}
