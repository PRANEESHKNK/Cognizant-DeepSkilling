package com.cognizant.springlearn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("IN", Country.class);
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean(code, Country.class);
    }
}