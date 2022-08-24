package ejercicio2.Chinpokomons;

public class Carnotron extends Chinpokomon {

    public Carnotron() {
        this.setVida(20);
        this.setNombre("Carnotron");

    }
    private void rayoVeloz(Chinpokomon chinpokomon){
        chinpokomon.dealDamage(3);
    }
    private void cañonConico(Chinpokomon chinpokomon){
        chinpokomon.dealDamage(4);
    }
    @Override
    public void atacar(Chinpokomon chinpokomon) {
        this.rayoVeloz(chinpokomon);
        this.cañonConico(chinpokomon);
    }
}
