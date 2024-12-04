package com.rental.backend.repository;

import com.rental.backend.entity.HardwearItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepository extends JpaRepository<HardwearItem, Long> {
}
