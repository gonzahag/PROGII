package Empleado;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int dni, String nombre, String apellido, int salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }

    public String getNombreCompleto(){
        return nombre+" "+apellido;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioAnual(){
        return salario * 12;
    }

    public int incrementarSalario(int porcentaje){
        setSalario(salario + (salario*porcentaje/100));
        return salario;
    }

    public String toString(){
        return "Empleado[DNI: "+dni+", Nombre: "+nombre+", Apellido: "+apellido+", Salario: "+salario+"]";
    }
}
