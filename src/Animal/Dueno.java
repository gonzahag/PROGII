package Animal;

public class Dueno {

    private String nombre;
    private Animal mascotas[];


    public Dueno(String nombre, Animal [] mascotas){
        this.nombre = nombre;
        this.mascotas = mascotas;
    }

    public String getnombreMascotas() {
        String mascotas = "";
        for(int i = 0; i<this.mascotas.length; i++){
            mascotas += this.mascotas[i].getNombre();
            if(i+1 < this.mascotas.length) {
                mascotas += ", ";
            }
        }
        return mascotas;
    }


}
