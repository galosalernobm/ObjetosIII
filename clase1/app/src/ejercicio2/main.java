package ejercicio2;

import ejercicio2.Chinpokomons.Carnotron;
import ejercicio2.Chinpokomons.Chinpokomon;
import ejercicio2.Chinpokomons.Zapato;

public class main {

    //Campo de batalla
    public static void main(String[] args) {
        final Chinpokomon carnotron = new Carnotron();
        final Chinpokomon zapato = new Zapato();
        final CampoBatalla campoBatalla = new CampoBatalla(carnotron, zapato);
        campoBatalla.comenzarPelea();
    }
}
