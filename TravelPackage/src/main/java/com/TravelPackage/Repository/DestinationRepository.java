package com.TravelPackage.Repository;


import org.springframework.data.repository.CrudRepository;

import com.TravelPackage.Entity.Destination;

public interface DestinationRepository extends CrudRepository<Destination, Integer> {
    
}