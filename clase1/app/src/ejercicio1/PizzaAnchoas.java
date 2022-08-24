package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaAnchoas extends Pizza{
    public PizzaAnchoas() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("anchoas");
        ingredientes.add("aceitunas negras");
        ingredientes.add("salsa tomate");
        ingredientes.add("masa");
        super.setIngredientes(ingredientes);
        super.setNombre("anchoas");
    }
}
