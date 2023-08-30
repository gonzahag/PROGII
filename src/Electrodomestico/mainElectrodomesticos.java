package Electrodomestico;

public class mainElectrodomesticos {
    public static void main(String args[]) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[9];
        Lavarropas lavarropas1 = new Lavarropas();
        Lavarropas lavarropas2 = new Lavarropas();
        Televisor televisor1 = new Televisor();
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Televisor televisor2 = new Televisor();
        Televisor televisor3 = new Televisor();
        Electrodomestico electrodomestico2 = new Electrodomestico();
        Lavarropas lavarropas3 = new Lavarropas();
        Televisor televisor4 = new Televisor();

        electrodomesticos[0] = lavarropas1;
        electrodomesticos[1] = lavarropas2;
        //electrodomesticos[2] = televisor1;
        //electrodomesticos[3] = electrodomestico1;
        //electrodomesticos[4] = televisor2;
        //electrodomesticos[5] = televisor3;
        //electrodomesticos[6] = electrodomestico2;
        electrodomesticos[2] = lavarropas3;
        //electrodomesticos[8] = televisor4;

        double precioTotalElectrodomesticos = 0;
        double precioTotalTelevisores = 0;
        double precioTotalLavarropas = 0;

        for (int i = 0; i < electrodomesticos.length; i++){

            if (electrodomesticos[i] instanceof Televisor){
                precioTotalTelevisores += electrodomesticos[i].precioFinal(electrodomesticos[i].getConsumo(), electrodomesticos[i].getPeso());
            } else if (electrodomesticos[i] instanceof Lavarropas) {
                precioTotalLavarropas += electrodomesticos[i].precioFinal(electrodomesticos[i].getConsumo(), electrodomesticos[i].getPeso());
            }

        }

        precioTotalElectrodomesticos += precioTotalLavarropas + precioTotalTelevisores;

        System.out.println("El precio total de los televisores es: $"+precioTotalTelevisores);
        System.out.println("El precio total de los lavarropas es: $"+precioTotalLavarropas);
        System.out.println("El precio total de los electrodomesticos es: $"+precioTotalElectrodomesticos);

    }
}
