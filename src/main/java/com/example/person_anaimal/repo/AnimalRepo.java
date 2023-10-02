package com.example.person_anaimal.repo;

import com.example.person_anaimal.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends JpaRepository<Animal,Integer> {
}
