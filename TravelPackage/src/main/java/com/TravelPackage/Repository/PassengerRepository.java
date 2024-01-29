package com.TravelPackage.Repository;



import org.springframework.data.repository.CrudRepository;

import com.TravelPackage.Entity.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
   
}