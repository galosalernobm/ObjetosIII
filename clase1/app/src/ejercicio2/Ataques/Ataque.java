package ejercicio2.Ataques;

public abstract class Ataque {
    private int damage;

    public Ataque() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
