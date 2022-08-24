import ejercicio1.*;

public class Fabrica {
    final String pizzaMuzzarella(){
        return new PizzaMuzarella().getDescripcion();
    }
    final String pizzaAnchoas(){
        return new PizzaAnchoas().getDescripcion();
    }
    final String pizzaCalabresa(){
        return new PizzaCalabresa().getDescripcion();
    }
    final String pizzaCuatroQuesos(){
        return new PizzaCuatroQuesos().getDescripcion();
    }
    final String pizzaFugaza(){
        return new PizzaFugaza().getDescripcion();
    }
    final String pizzaJamonYMorron(){ return new PizzaJamonYMorron().getDescripcion(); }
    final String pizzaNapolitana(){
        return new PizzaNapolitana().getDescripcion();
    }

}
