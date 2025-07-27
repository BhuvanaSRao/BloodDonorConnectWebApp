package com.example.blooddonorconnect.repository;

import com.example.blooddonorconnect.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroupAndCity(String bloodGroup, String city);
}
