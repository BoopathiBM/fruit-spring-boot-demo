package com.demo.example.service;


import com.demo.example.model.Fruit;
import com.demo.example.repository.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private  final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Fruit getFruitByName(String name) {
        return inventoryRepository.getFruitByName(name);

    }
}
