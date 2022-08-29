package ejercicio2;

import ejercicio2.Chinpokomons.Chinpokomon;

public class CampoBatalla {
    final Chinpokomon peleador1;
    final Chinpokomon peleador2;

    public CampoBatalla(Chinpokomon peleador1, Chinpokomon peleador2) {
        this.peleador1 = peleador1;
        this.peleador2 = peleador2;
    }
    protected void comenzarPelea(){

        peleador1.atacar(peleador2);
        peleador2.atacar(peleador1);


        System.out.println("La vida del peleador "+peleador1.getNombre() +"es: "+peleador1.getVida() + "\n" + "La vida del peleador " +peleador2.getNombre() +" es: " +peleador2.getVida());
    }
}
