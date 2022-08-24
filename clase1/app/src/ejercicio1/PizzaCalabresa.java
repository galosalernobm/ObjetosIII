package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaCalabresa extends Pizza{
    public PizzaCalabresa() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("masa");
        ingredientes.add("salamin");
        ingredientes.add("aceitunas verdes");
        ingredientes.add("muzarella");
        ingredientes.add("salsa tomate");
        super.setIngredientes(ingredientes);
        super.setNombre("calabresa");
    }
}

