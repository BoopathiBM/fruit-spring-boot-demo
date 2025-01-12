package com.demo.example.repository;

import com.demo.example.model.Fruit;

import java.util.ArrayList;
import java.util.List;


public class InventoryRepository {

    ArrayList<Fruit> fruits;

    public void createFruitArrayList() {
        fruits = new ArrayList<>();
        Fruit apple = new Fruit("apple", 15, 50);
        Fruit lemon = new Fruit("lemon", 20, 5);
        Fruit orange = new Fruit("orange", 50, 70);

        fruits.add(apple);
        fruits.add(lemon);
        fruits.add(orange);


    }

    public Fruit getFruitByName(String name) {

        for (Fruit item : fruits) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    public void updateFruitDetails(Fruit fruit){

        for( Fruit item : fruits){
            if(item.getName().equalsIgnoreCase(fruit.getName())){
                item.setName(fruit.getName());
                item.setPrice(fruit.getPrice());
                item.setQuantity(fruit.getQuantity());
            }

        }
    }


}
