package com.techB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GroceryItem {
    private String name;
    private double price;

    public GroceryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private Map<GroceryItem, Integer> items = new HashMap<>();

    public void addItem(GroceryItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<GroceryItem, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<GroceryItem, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

public class OnlineGroceryApp {
    public static void main(String[] args) {
        // Create some sample grocery items
        GroceryItem apple = new GroceryItem("Apple", 1.0);
        GroceryItem banana = new GroceryItem("Banana", 0.5);
        GroceryItem milk = new GroceryItem("Milk", 2.0);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Simulate user adding items to the cart
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(milk, 1);

        // Display the shopping cart
        cart.displayCart();
    }
}
