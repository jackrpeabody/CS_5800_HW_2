package Builder;

import java.util.Arrays;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args){

        System.out.println("Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings to your liking and eat() all of them.\n");

        Pizza small_pizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setSize("Small").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms"))).createPizza();
        small_pizza.eat();

        Pizza medium_pizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setSize("Medium").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"))).createPizza();
        medium_pizza.eat();

        Pizza large_pizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setSize("Large").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken", "Olives"))).createPizza();
        large_pizza.eat();

        System.out.println("\nCreate the following pizzas and eat() all of them:\n");

        Pizza large_pizza_hut_pizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setSize("Large").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms"))).createPizza();
        large_pizza_hut_pizza.eat();

        Pizza small_pizza_hut_pizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setSize("Small").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage"))).createPizza();
        small_pizza_hut_pizza.eat();

        Pizza medium_little_caesars_pizza = new PizzaBuilder().setPizzaChainName("Little Caesars").setSize("Medium").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken"))).createPizza();
        medium_little_caesars_pizza.eat();

        Pizza small_little_caesars_pizza = new PizzaBuilder().setPizzaChainName("Little Caesars").setSize("Small").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"))).createPizza();
        small_little_caesars_pizza.eat();

        Pizza small_dominos_pizza = new PizzaBuilder().setPizzaChainName("Dominos").setSize("Small").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni"))).createPizza();
        small_dominos_pizza.eat();

        Pizza large_dominos_pizza = new PizzaBuilder().setPizzaChainName("Dominos").setSize("Large").setToppings(new ArrayList<String>(Arrays.asList("Pepperoni", "Sausage", "Mushrooms"))).createPizza();
        large_dominos_pizza.eat();

    }

}