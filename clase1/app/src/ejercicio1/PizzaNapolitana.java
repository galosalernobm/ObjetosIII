package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaNapolitana extends Pizza{
    public PizzaNapolitana() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("tomate");
        ingredientes.add("aceitunas verdes");
        ingredientes.add("muzarella");
        ingredientes.add("salsa tomate");
        ingredientes.add("masa");
        super.setIngredientes(ingredientes);
        super.setNombre("napolitana");
    }
}

