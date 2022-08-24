package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaJamonYMorron extends Pizza{
    public PizzaJamonYMorron() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("masa");
        ingredientes.add("jamon");
        ingredientes.add("morron");
        ingredientes.add("muzarella");
        ingredientes.add("salsa tomate");
        super.setIngredientes(ingredientes);
        super.setNombre("jamon y morron");
    }
}

