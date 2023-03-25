package Builder;

import java.util.ArrayList;

public class PizzaBuilder {

    private String pizza_chain_name;
    private String size;
    private ArrayList<String> toppings;

    public PizzaBuilder(){
    }

    public PizzaBuilder setPizzaChainName(String pizza_chain_name){
        this.pizza_chain_name = pizza_chain_name;
        return this;
    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setToppings(ArrayList<String> toppings){
        this.toppings = toppings;
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(pizza_chain_name, size, toppings);
    }

}