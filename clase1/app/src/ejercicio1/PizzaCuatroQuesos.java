package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaCuatroQuesos extends Pizza{
    public PizzaCuatroQuesos() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("masa");
        ingredientes.add("provolone");
        ingredientes.add("muzarella");
        ingredientes.add("roquefort");
        ingredientes.add("ricota");
        ingredientes.add("salsa tomate");
        super.setIngredientes(ingredientes);
        super.setNombre("4Quesos");
    }
}

