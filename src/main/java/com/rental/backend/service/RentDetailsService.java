package com.rental.backend.service;

import com.rental.backend.entity.RentalDetail;
import com.rental.backend.repository.RentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentDetailsService {

    @Autowired
    private RentDetailsRepository rentDetailsRepository;

    public List<RentalDetail> getAllRentDetails() {
        return rentDetailsRepository.findAll();
    }

    public RentalDetail createRentDetails(RentalDetail rentDetails) {
        return rentDetailsRepository.save(rentDetails);
    }

    public RentalDetail getRentDetailsById(Long id) {
        return rentDetailsRepository.findById(id).orElse(null);
    }

    public void deleteRentDetails(Long id) {
        rentDetailsRepository.deleteById(id);
    }
}
