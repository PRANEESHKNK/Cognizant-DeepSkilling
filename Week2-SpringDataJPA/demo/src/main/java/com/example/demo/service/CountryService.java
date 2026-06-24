package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {

        return countryRepository.findAll();

    }
    public Country getCountry(String code) {

    return countryRepository
            .findById(code)
            .orElse(null);
}

public Country getCountryByName(String name) {

    return countryRepository.findByName(name);

    }
}