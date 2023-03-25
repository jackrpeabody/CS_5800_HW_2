package Builder;

import java.util.ArrayList;

public class Pizza {

    private String pizza_chain_name;
    private String size;
    private ArrayList<String> toppings;

    public Pizza(String pizza_chain_name, String size, ArrayList<String> toppings){
        this.pizza_chain_name = pizza_chain_name;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat(){
        System.out.println(String.format("%s pizza from %s with %s.", 
        this.size, this.pizza_chain_name, this.toppings));
    }
    
}