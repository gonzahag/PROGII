package Cuenta;

public class Cuenta {

    private String id;
    private String nombre;
    private int balance = 0;

    public Cuenta(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Cuenta(String id, String nombre, int balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credito(int monto){
        setBalance(balance+monto);
        return balance;
    }

    public int debito(int monto){
        if(monto <= balance){
            setBalance(getBalance()-monto);
        } else {
            System.out.println("Monto excedido del balance");
        }
        return balance;
    }

    public int transferencia(Cuenta otraCuenta, int monto){
        if (monto <= balance){
            setBalance(getBalance()-monto);
            otraCuenta.setBalance(otraCuenta.getBalance()+monto);
        } else {
            System.out.println("Monto excedido del balance");
        }
        return balance;
    }

}
