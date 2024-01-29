package com.TravelPackage.Repository;



import org.springframework.data.repository.CrudRepository;

import com.TravelPackage.Entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
    
}