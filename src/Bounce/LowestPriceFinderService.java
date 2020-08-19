package Bounce;

import java.util.PriorityQueue;

public interface LowestPriceFinderService {
    Restaurant findIdealPrice(Cafeteria cafeteria, Order order);
    void placeOrder(Order order);
    void processOrder(Order order, Restaurant restaurant, PriorityQueue<Order> queue, int size);
}
