package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float sum = 0.0f;
        for ( var ordersOfFurnitures : this.ordersOfFurnitures.entrySet() ){
        sum += getTypeCost(ordersOfFurnitures.getKey());
        }
        return sum;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (this.ordersOfFurnitures.get(type) == null)
            return 0;
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return type.cost() * getTypeCount(type);
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int sum = 0;
        for ( var ordersOfFurnitures : this.ordersOfFurnitures.entrySet() ){
        sum += getTypeCount(ordersOfFurnitures.getKey());
        }
        return sum;
    }
}
