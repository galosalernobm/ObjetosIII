package ejercicio2.Chinpokomons;

public class Gallotronix extends Chinpokomon{
    public Gallotronix(){
        this.setVida(25);
        this.setNombre("Gallotronix");
    }
    private void garraMecanica(Chinpokomon chinpokomon){
        chinpokomon.dealDamage(2);
    }
    @Override
    public void atacar(Chinpokomon chinpokomon) {
        this.garraMecanica(chinpokomon);
    }
}
