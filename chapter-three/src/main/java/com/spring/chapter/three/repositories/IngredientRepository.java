package com.spring.chapter.three.repositories;

import com.spring.chapter.three.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
    Optional<Ingredient> findById(String id);
}
