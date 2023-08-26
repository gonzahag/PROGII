package Cuenta;

public class Main {

    public static void main(String args[]){

        Cuenta cuenta1 = new Cuenta("gonzahag", "Gonzalo", 500000);
        Cuenta cuenta2 = new Cuenta("black", "Diego");

        System.out.println(cuenta1.getBalance());
        System.out.println(cuenta2.getBalance());
        cuenta1.transferencia(cuenta2, 600000);
        System.out.println(cuenta1.getBalance());
        System.out.println(cuenta2.getBalance());


    }

}
