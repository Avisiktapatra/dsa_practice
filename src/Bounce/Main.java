package Bounce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    static LowestPriceFinderServiceImpl lowestPriceFinderService = new LowestPriceFinderServiceImpl();

    public static void main(String[] args) {

        Cafeteria cafeteria = new Cafeteria("FreshFoods", "3-A, Prestige Tech Park, Bangalore");
        List<String> menu = new ArrayList<>();
        menu.add("Veg Burger");
        menu.add("French Fries");
        menu.add("Vanilla Softy");
        menu.add("Paneer Wrap");
        menu.add("Coke");
        cafeteria.setMenu(menu);

        Restaurant restaurant1 = new RestaurantBuilder(101).setName("Refresh").setProcessingPower(10).build();
        Restaurant restaurant2 =
                new RestaurantBuilder(102).setName("Hash House Bistro").setProcessingPower(12).build();

        List<Item> allItemsList = new ArrayList<>();
        List<Restaurant> restaurantList = new ArrayList<>();

        Item item1 = new ItemBuilder(1).setName("Veg Burger").setUnitCost(200).build();
        Item item2 = new ItemBuilder(2).setName("French Fries").setUnitCost(150).build();
        Item item3 = new ItemBuilder(3).setName("Vanilla Softy").setUnitCost(60).build();
        Item item4 = new ItemBuilder(4).setName("Paneer Wrap").setUnitCost(90).build();
        Item item5 = new ItemBuilder(5).setName("Coke").setUnitCost(30).build();
        allItemsList.add(item1);
        allItemsList.add(item2);
        allItemsList.add(item3);
        allItemsList.add(item4);
        allItemsList.add(item5);
        restaurant1.setItemPrice(allItemsList);
        allItemsList.clear();

        Item item11 = new ItemBuilder(1).setName("Veg Burger").setUnitCost(150).build();
        Item item21 = new ItemBuilder(2).setName("French Fries").setUnitCost(100).build();
        Item item31 = new ItemBuilder(3).setName("Vanilla Softy").setUnitCost(80).build();
        Item item41 = new ItemBuilder(4).setName("Paneer Wrap").setUnitCost(120).build();
        Item item51 = new ItemBuilder(5).setName("Coke").setUnitCost(95).build();
        allItemsList.add(item11);
        allItemsList.add(item21);
        allItemsList.add(item31);
        allItemsList.add(item41);
        allItemsList.add(item51);
        restaurant2.setItemPrice(allItemsList);
        allItemsList.clear();

        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        cafeteria.setRestaurantList(restaurantList);

        HashMap<String, Integer> itemPriceMapping = new HashMap<>();
        itemPriceMapping.put("French fries", 2);
        itemPriceMapping.put("Coke", 1);

        Order order1 = new Order(1, "Anniee", "Hanumanth Nagar - KA", "in progress", System.currentTimeMillis());
        order1.setItems(itemPriceMapping);

        //Find the restaurant that has less cost price
        lowestPriceFinderService.findIdealPrice(cafeteria, order1);

        //Placing the order in respective restaurant according to processing power
        lowestPriceFinderService.placeOrder(order1);

    }
}
