package com.rental.backend.repository;

import com.rental.backend.entity.RentalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDetailsRepository extends JpaRepository<RentalDetail, Long> {
}
