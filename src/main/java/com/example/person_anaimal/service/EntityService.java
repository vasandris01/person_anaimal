package com.example.person_anaimal.service;

import com.example.person_anaimal.model.Animal;
import com.example.person_anaimal.model.Person;
import com.example.person_anaimal.repo.AnimalRepo;
import com.example.person_anaimal.repo.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntityService {
    private AnimalRepo animalRepo;
    private PersonRepo personRepo;

    public List<Person> getAllPerson() {
        return personRepo.findAll();
    }

    public List<Animal> getAllAnimals() {
        return animalRepo.findAll();
    }
}
