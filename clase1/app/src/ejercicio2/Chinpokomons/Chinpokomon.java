package ejercicio2.Chinpokomons;

public abstract class Chinpokomon {
    private Integer vida;
    private String nombre;
    private Boolean isDeath;
    public Chinpokomon() {

    }
    public void dealDamage(final Integer damage){
        if(this.getVida() - damage < 0){
            setDeath(true);
            this.setVida(0);
        }else {
            this.setVida(this.vida - damage);
        }
    }
    public void atacar(Chinpokomon chinpokomon){

    }
    public Integer getVida() {
        return vida;
    }

    public void setDeath(Boolean death) {
        isDeath = death;
    }

    public Boolean getDeath() {
        return isDeath;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
