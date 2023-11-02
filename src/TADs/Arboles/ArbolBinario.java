package TADs.Arboles;

public class ArbolBinario {

    private NodoBinario raiz;

    private ArbolBinario(){
        this.raiz = null;
    }


    public boolean vacio(){
        return this.raiz == null;
    }

    public void construir(NodoBinario raiz){
        this.raiz = raiz;
    }

    public void agregar(int valor){
        this.raiz = agregarRecursivo(this.raiz, valor);
    }

    //public void eliminar(String valor){
    //    this.raiz = eliminarRecursivo(this.raiz, valor);
    //}

    public void imprimirPreOrder(){
        preOrder(this.raiz);
    }

    public void imprimirInOrder(){
        inOrder(this.raiz);
    }

    public void imprimirPostOrder(){
        posOrder(this.raiz);
    }

    //public void imprimirEnAnchura(){
    //    anchura(this.raiz);
    //}

    private void inOrder(NodoBinario nodo){

        if (nodo == null){
            return;
        }

        inOrder(nodo.izq);
        System.out.println(nodo.valor);
        inOrder(nodo.der);
    }

    private void posOrder(NodoBinario nodo){
        if (nodo == null){
            return;
        }

        posOrder(nodo.izq);
        posOrder(nodo.der);
        System.out.println(nodo.valor);

    }

    private void preOrder(NodoBinario nodo){
        if (nodo == null){
            return;
        }

        System.out.println(nodo.valor);
        preOrder(nodo.izq);
        preOrder(nodo.der);

    }


    /*private void anchura (NodoBinario nodo){

        ColaBusquedaAnchura cola = new ColaBusquedaAnchura();
        cola.encolar(nodo);

        while (!cola.vacia()){
            NodoBinario aux = cola.desencolar();
            System.out.println(aux.valor + " ");

            if (aux.izq != null){
                cola.encolar(aux.izq);
            }

            if (aux.der != null){
                cola.encolar(aux.der);
            }

        }

    }
*/
    private NodoBinario agregarRecursivo(NodoBinario nodo, int valor){

        if (nodo == null){
            nodo = new NodoBinario(valor);
            return nodo;
        }

        if (valor <= nodo.valor){
            nodo.izq = agregarRecursivo(nodo.izq, valor);
        } else if (valor > nodo.valor){
            nodo.der = agregarRecursivo(nodo.der, valor);
        }

        return nodo;


    }












}
