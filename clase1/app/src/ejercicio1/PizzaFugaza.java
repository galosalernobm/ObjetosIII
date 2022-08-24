package ejercicio1;

import java.util.ArrayList;
        import java.util.List;

public class PizzaFugaza extends Pizza{
    public PizzaFugaza() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("masa");
        ingredientes.add("cebolla");
        ingredientes.add("muzarella");
        super.setIngredientes(ingredientes);
        super.setNombre("fugazza");
    }
}

