package com.example.person_anaimal.controller;

import com.example.person_anaimal.model.Animal;
import com.example.person_anaimal.model.Person;
import com.example.person_anaimal.service.EntityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Rest {
    private EntityService entityService;

    @GetMapping("/persons")
    public List<Person> getAllPerson(){
        return entityService.getAllPerson();
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals(){
        return entityService.getAllAnimals();
    }
}
