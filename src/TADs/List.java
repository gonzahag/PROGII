package TADs;

public class List {

    Node primerNodo;

    public List(Node node){
        this.primerNodo = node;
    }

    public List(){}

    public void agregarInicio(int valor){
        Node elemento = new Node(valor);
        if (this.primerNodo == null){
            primerNodo = elemento;
            return;
        }
        elemento.next = primerNodo;
        primerNodo = elemento;
    }

    public void agregarFinal(int valor){
        Node elemento = new Node(valor);

        if (this.primerNodo == null){
            primerNodo = elemento;
            return;
        }

        Node ultimo = primerNodo;
        while(ultimo.next != null){
            ultimo = ultimo.next;
        }

        ultimo.next = elemento;

    }


    public boolean buscarElemento(int valor){
        Node elemento = primerNodo;

        while(elemento.next != null){
            if (elemento.data == valor){
                return true;
            }
            elemento = elemento.next;
        }

        if (elemento.data == valor){
            return true;
        }

        return false;
    }



}
