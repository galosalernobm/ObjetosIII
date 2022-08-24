package ejercicio2.Chinpokomons;

public class Zapato extends Chinpokomon {
    public Zapato(){
        this.setVida(20);
        this.setNombre("Zapato");
    }
    private void zapatazo(Chinpokomon chinpokomon){
        chinpokomon.dealDamage(1);
    }
    @Override
    public void atacar(Chinpokomon chinpokomon) {
        this.zapatazo(chinpokomon);
    }
}
