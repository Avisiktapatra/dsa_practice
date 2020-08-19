package Bounce;

import java.util.*;

public class LowestPriceFinderServiceImpl implements LowestPriceFinderService {
    int total = 0;

    public Restaurant findIdealPrice(Cafeteria cafeteria, Order order) {

        HashMap<String, Integer> itemPriceMapping = order.getItems();
        double totalPrice = 0;
        double minPrice = Integer.MAX_VALUE;
        Restaurant leastPriceRestaurant = null;

        //get order size to check the processing power of restaurants
        int orderSize = order.getItems().size();
        List<Restaurant> restaurantList = cafeteria.getRestaurantList();

        List<Restaurant> eligibleRestaurants = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            int restaurantProcessingPower = restaurant.getProcessingPower();
            if (restaurantProcessingPower >= orderSize) {
                eligibleRestaurants.add(restaurant);  //Added those restaurants that have enough PP for an order
            }
        }
        //iterate list of eligible restaurants to check that they have all items available
        List<Restaurant> itemsPresentInResoList = new ArrayList<>();
          for(Map.Entry<String,Integer> entry : itemPriceMapping.entrySet()) {
              for (int i = 0; i < eligibleRestaurants.size(); i++) {
                  List<Item> itemList = eligibleRestaurants.get(i).getItemList();
                  int ct = 0;
                  for (int j = 0; j < itemList.size(); j++) {
                      if (!entry.getKey().equalsIgnoreCase(itemList.get(j).getName())) break;
                      else ct++;
                  }if(ct == itemPriceMapping.size())
                      itemsPresentInResoList.add(eligibleRestaurants.get(i));

              }
          }
            //Map all items and their price in a new hashmap for easy comparison with orders map
            for(Restaurant restaurant: itemsPresentInResoList){
                Map<Item, Double> itemPrice = restaurant.getItemPrice();
                Map<String, Double> priceMap = new HashMap<>();
                for (Item item : itemPrice.keySet()) {
                    priceMap.putIfAbsent(item.getName().toLowerCase(), item.getUnitCost());
                }
                //check whether rest has all items

                for (Map.Entry<String, Integer> item : itemPriceMapping.entrySet()) {
                    if (priceMap.containsKey(item.getKey().toLowerCase())) {
                        totalPrice += (priceMap.get(item.getKey().toLowerCase()) * item.getValue());
                    }
                }
                if (totalPrice < minPrice) {
                    minPrice = totalPrice;
                    leastPriceRestaurant = restaurant;
                }
            }
            order.setTotalPrice(minPrice);
            order.setChosenRestro(leastPriceRestaurant);

            return leastPriceRestaurant;
        }

    public void placeOrder(Order order){
        int count = 0;
        Restaurant restaurant = order.getChosenRestro();
        if(restaurant != null){
            PriorityQueue<Order> queue = restaurant.getProcessingQueue();
            queue.offer(order);
            int orderSize = order.getItems().size();
            total += orderSize;
            if(total <= restaurant.getProcessingPower()){
                count = restaurant.getCount();
                restaurant.setCount(count++);
            }
            else
                processOrder(order, restaurant, queue, orderSize);

        }
    }

    public void processOrder(Order order, Restaurant restaurant, PriorityQueue<Order> queue, int orderSize){

        int queueRemainingSize = queue.size() - restaurant.getCount();
        while(!queue.isEmpty()){
            if(queue.size() > queueRemainingSize && restaurant.getProcessingPower() >= orderSize && order.getOrderStatus().equalsIgnoreCase(
                    "In progress")){
                Order polledOrder = queue.poll();
                restaurant.setProcessingPower(restaurant.getProcessingPower() - orderSize);
                if(polledOrder.getOrderStatus().equalsIgnoreCase("Processed")){
                    //Restoring the processing power once the order is processed
                    restaurant.setProcessingPower(restaurant.getProcessingPower() + polledOrder.getItems().size());
                }
                else
                    placeOrder(order);
            }
        }
    }

}
