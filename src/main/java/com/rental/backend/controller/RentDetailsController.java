package com.rental.backend.controller;

import com.rental.backend.entity.RentalDetail;
import com.rental.backend.service.RentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentdetails")
@CrossOrigin(origins = "http://localhost:4200")
public class RentDetailsController {

    @Autowired
    private RentDetailsService rentDetailsService;

    @GetMapping
    public List<RentalDetail> getAllRentDetails() {
        return rentDetailsService.getAllRentDetails();
    }

    @PostMapping
    public RentalDetail createRentDetails(@RequestBody RentalDetail rentDetails) {
        return rentDetailsService.createRentDetails(rentDetails);
    }

    @GetMapping("/{id}")
    public RentalDetail getRentDetailsById(@PathVariable Long id) {
        return rentDetailsService.getRentDetailsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRentDetails(@PathVariable Long id) {
        rentDetailsService.deleteRentDetails(id);
    }
}
