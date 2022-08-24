package ejercicio1;

import java.util.ArrayList;
import java.util.List;

//Clase abstracta ya que no existe una pizza sin su especificacion.
public abstract class Pizza {

    private String nombre;
    private List<String> ingredientes;

    public Pizza() {
        final List<String> ingredientesBase = new ArrayList<>();
        ingredientesBase.add("masa");
        this.ingredientes = ingredientesBase;
    }
    public String getDescripcion() {
      return "La pizza de "+ this.getNombre() + " tiene los siguientes ingredientes: " + this.getIngredientes();
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
