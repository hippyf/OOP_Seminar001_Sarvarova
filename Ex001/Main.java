package Ex001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(
            new Product("Snikers", 25.5),
            new Product("Mars", 20.5)));

        VendingMachine machine = new VendingMachine(list);
        String key = "Mars";
        System.out.println("БАТОНЧИКИ\n");
        System.out.println(machine.getProductByName(key));

        List<Product> listBottle = new ArrayList<Product>(Arrays.asList(
            new Bottle("Coca Cola", 25.5,0.5),
            new Bottle("Sprite", 20.5,1.0)));
        
        VendingMachine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println("НАПИТКИ В БУТЫЛКАХ\n");
        System.out.println(bottleMachine.getProductByName(keyBottle));

        List<Product> listHotDrinks = new ArrayList<Product>(Arrays.asList(
            new HW_HotDrinks("Tea", 120.0,0.3,100),
            new HW_HotDrinks("Coffee", 150.0,0.3,100)));
        
        VendingMachine hotDrinksMachine = new HW_HotDrinksMachine(listHotDrinks);
        String keyHotDrink = "Coffee";
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ: ГОРЯЧИЕ НАПИТКИ\n");
        System.out.println(hotDrinksMachine.getProductByName(keyHotDrink));

    }
}
