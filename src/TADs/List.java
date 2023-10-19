package TADs;

public class List {

    private Node primerNodo;

    public List(Node node){
        this.primerNodo = node;
    }

    public List(){
    }

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



    public void agregarMedio(int valor, int ubicacion){

        Node elemento = new Node(valor);

        if(this.primerNodo == null){
            primerNodo = elemento;
            return;
        }


        Node auxiliar = primerNodo;
        int indice = 0;

        while(indice < ubicacion - 1){
            auxiliar = auxiliar.next;
            indice++;
        }

        elemento.next = auxiliar.next;
        auxiliar.next = elemento;

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

    public void imprimir() {
            Node aux = this.primerNodo;

            while(aux.next != null){
                System.out.println(aux.data);
                aux = aux.next;
            }

            if (aux.next==null){
                System.out.println(aux.data);
            }

    }



}
