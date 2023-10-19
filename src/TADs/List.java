package TADs;

public class List {

    public Node primerNodo;
    public int tamano;

    public List(Node node){
        this.primerNodo = node;
        this.tamano = 0;
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
        this.tamano++;
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
        this.tamano++;

    }



    public void agregarMedio(int valor, int ubicacion){

        Node elemento = new Node(valor);

        if (this.tamano < ubicacion){
            System.out.println("Se ingresó un índice fuera del rango.");
            return;
        }

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

        this.tamano++;

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

            for (int i = 0; i<=this.tamano; i++){
                System.out.println(aux.data);
                aux = aux.next;
            }

            /*if (aux.next==null){
                System.out.println(aux.data);
            }*/

    }



}
