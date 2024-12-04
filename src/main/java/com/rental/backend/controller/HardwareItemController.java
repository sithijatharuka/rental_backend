package com.rental.backend.controller;

import com.rental.backend.entity.HardwearItem;
import com.rental.backend.service.HardwareItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hardwareitem")
@CrossOrigin(origins = "http://localhost:4200")
public class HardwareItemController {

    @Autowired
    private HardwareItemService hardwareItemService;

    @GetMapping
    public List<HardwearItem> getAllHardwareItems() {
        return hardwareItemService.getAllHardwareItems();
    }

    @PostMapping
    public HardwearItem createHardwareItem(@RequestBody HardwearItem hardwareItem) {
        return hardwareItemService.createHardwareItem(hardwareItem);
    }

    @GetMapping("/{id}")
    public HardwearItem getHardwareItemById(@PathVariable Long id) {
        return hardwareItemService.getHardwareItemById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteHardwareItem(@PathVariable Long id) {
        hardwareItemService.deleteHardwareItem(id);
    }
}
