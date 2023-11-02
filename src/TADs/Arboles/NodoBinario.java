package TADs.Arboles;

public class NodoBinario {


    public int valor;

    public NodoBinario izq;
    public NodoBinario der;

    public NodoBinario(int valor){
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }


    @Override
    public String toString() {
        return this.valor;
    }
}
