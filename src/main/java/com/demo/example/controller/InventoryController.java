package com.demo.example.controller;

import com.demo.example.model.Fruit;
import com.demo.example.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("inventory/{name}")
    public String getFruitByName(@PathVariable String name){
        //return inventoryService.getFruitByName(name);
        return name;
    }

    @GetMapping("inventory")
    public List<Fruit> getFruitDetails(){

        return inventoryService.getAll();


    }
}
