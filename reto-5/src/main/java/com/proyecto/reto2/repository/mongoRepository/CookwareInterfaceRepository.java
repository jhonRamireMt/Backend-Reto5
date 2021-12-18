package com.proyecto.reto2.repository.mongoRepository;

import com.proyecto.reto2.model.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CookwareInterfaceRepository extends MongoRepository<Cookware,String> {

    Optional<Cookware> findByReference(String reference);

    public List<Cookware> findByPriceLessThanEqual(double precio);

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Cookware> findByDescriptionLike(String description);
}
