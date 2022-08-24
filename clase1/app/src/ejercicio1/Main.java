package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        final Fabrica fabricaPizzas = new Fabrica();
        final String muzza = fabricaPizzas.pizzaMuzzarella();
        final String anchoas = fabricaPizzas.pizzaAnchoas();
        final String calabresa = fabricaPizzas.pizzaCalabresa();
        final String cuatroQuesos = fabricaPizzas.pizzaCuatroQuesos();
        final String fugaza = fabricaPizzas.pizzaFugaza();
        final String jamonYMorron = fabricaPizzas.pizzaJamonYMorron();
        final String napolitana = fabricaPizzas.pizzaNapolitana();
        final List<String> pizzas = new ArrayList<>();
        pizzas.add(muzza);
        pizzas.add(anchoas);
        pizzas.add(calabresa);
        pizzas.add(cuatroQuesos);
        pizzas.add(fugaza);
        pizzas.add(jamonYMorron);
        pizzas.add(napolitana);

        //Mostramos todas las pizzas
        for (int i=0;i<pizzas.size();i++) {
            System.out.println(pizzas.get(i));
        }

    }
}
