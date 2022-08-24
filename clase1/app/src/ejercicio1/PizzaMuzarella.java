package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PizzaMuzarella extends Pizza{


    public PizzaMuzarella() {
        final List<String> ingredientes = new ArrayList<>();
        ingredientes.add("muzarella");
        ingredientes.add("salsa tomate");
        ingredientes.add("masa");
        super.setIngredientes(ingredientes);
        super.setNombre("muzarella");
    }


}
