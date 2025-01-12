package com.demo.example.controller;

import com.demo.example.model.Fruit;
import com.demo.example.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("fruit/name")
    public Fruit getFruitByName(@RequestParam String name){
        return inventoryService.getFruitByName(name);
    }
}
