package com.rental.backend.service;

import com.rental.backend.entity.HardwearItem;
import com.rental.backend.repository.HardwareItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareItemService {

    @Autowired
    private HardwareItemRepository hardwareItemRepository;

    public List<HardwearItem> getAllHardwareItems() {
        return hardwareItemRepository.findAll();
    }

    public HardwearItem createHardwareItem(HardwearItem hardwareItem) {
        return hardwareItemRepository.save(hardwareItem);
    }

    public HardwearItem getHardwareItemById(Long id) {
        return hardwareItemRepository.findById(id).orElse(null);
    }

    public void deleteHardwareItem(Long id) {
        hardwareItemRepository.deleteById(id);
    }
}
