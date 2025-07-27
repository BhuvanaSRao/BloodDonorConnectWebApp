package com.example.blooddonorconnect.controller;

import com.example.blooddonorconnect.model.Donor;
import com.example.blooddonorconnect.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
public class DonorController {

    @Autowired
    private DonorRepository donorRepository;

    @PostMapping("/register")
    public Donor registerDonor(@RequestBody Donor donor) {
        donor.setVerified(false); // Set verified after email OTP
        return donorRepository.save(donor);
    }

    @GetMapping("/search")
    public List<Donor> searchDonors(@RequestParam String bloodGroup, @RequestParam String city) {
        return donorRepository.findByBloodGroupAndCity(bloodGroup, city);
    }
}
