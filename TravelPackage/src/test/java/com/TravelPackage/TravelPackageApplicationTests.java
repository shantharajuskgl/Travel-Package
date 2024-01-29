package com.TravelPackage;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.TravelPackage.Entity.Activity;
import com.TravelPackage.Entity.Destination;
import com.TravelPackage.Entity.Passenger;
import com.TravelPackage.Entity.TravelPackage;
import com.TravelPackage.Repository.ActivityRepository;
import com.TravelPackage.Repository.DestinationRepository;
import com.TravelPackage.Repository.PassengerRepository;
import com.TravelPackage.Repository.TravelPackageRepository;

@SpringBootTest
class TravelPackageApplicationTests {
	
	@Autowired
	private TravelPackageRepository travelPackageRepo;
	
	
	@Autowired
	private DestinationRepository destinationRepo;
	
	@Autowired
	private ActivityRepository activityRepo;
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	
	
	
		

	//  print the TravelPackage name 
	
	@Test
	public void GetTravelPackageByname() {
		 Optional<TravelPackage> findById = travelPackageRepo.findById(1);
		 
		if(findById.isPresent()) {
			TravelPackage travelPackage = findById.get();
			System.out.println(travelPackage.getName());
			}else {
				
				System.out.println("No record");
			}
	}
	
	
	
	
	
	//print all Destination
		@Test
		public void getAllRecords1() {
			Iterable<Destination> findAll = destinationRepo.findAll();
			for(Destination destination: findAll) {
				System.out.println(destination.getId());
				System.out.println(destination.getName());
				
	}
		}
		
		
		
		
			
			//print each Destination with activities
			@Test
			public void getallRecords2() {
			 Iterable<Activity> findAll = activityRepo.findAll();
		for(Activity activity:findAll) {
			System.out.println(activity.getId());
			System.out.println(activity.getName());
			System.out.println(activity.getCost());
			System.out.println(activity.getCapacity());
			System.out.println(activity.getDescription());
		}

}
			
			
			//Print the passenger list of the travel package including: 
			
			// a. print package name 
			// b. passenger capacity
			@Test
			public void getallRecords3() {
				Optional<TravelPackage> findById = travelPackageRepo.findById(1);
				if(findById.isPresent()) {
					TravelPackage travelPackage = findById.get();
					System.out.println(travelPackage.getName());
					System.out.println(travelPackage.getPassengerCapacity());
				}
				else {
					System.out.println("No record found");
				}
			}
			
			
			
			// print number of passengers currently enrolled 
			
				@Test
				public void getByPassengerId() {
					 Iterable<Passenger> findAll = passengerRepo.findAll();
					 for(Passenger passenger: findAll) {
						 System.out.println(passenger.getPassengerNumber());
					 }
				}
					
				
				
				// print name and number of each passenger
				 @Test
				 public void getAllRecords4() {
					 Iterable<Passenger> findAll1 = passengerRepo.findAll();
						for(Passenger passenger:findAll1) {
						System.out.println(passenger.getId());	
						System.out.println(passenger.getName());	
						System.out.println(passenger.getPassengerNumber());
						
						}
					 
				}
			
			// Print the details of an individual passenger including their name, passenger number, balance.
			@Test
			public void getallRecords5() {
				Iterable<Passenger> findAll = passengerRepo.findAll();
				for(Passenger passenger : findAll) {
					System.out.println(passenger.getName());
					System.out.println(passenger.getPassengerNumber());
					System.out.println(passenger.getBalance());
				}
				
				}
			
			
			
			//list of each activity they have signed up for, including the destination the at which the activity is taking place and the price the passenger paid for the activity.
			@Test
			public void getallRecords6() {
			Iterable<Activity> findAll = activityRepo.findAll();
		for(Activity activity:findAll) {
			System.out.println(activity.getId());
			System.out.println(activity.getName());
			System.out.println(activity.getCost());
			System.out.println(activity.getCapacity());
			System.out.println(activity.getDescription());
		}
			}

			
            @Test
			public void getallRecords7() {
			Iterable<Destination> findAll = destinationRepo.findAll();
			for(Destination destination :findAll) {
				System.out.println(destination.getId());
				System.out.println(destination.getName());
				
			}
			
			
}
            @Test
			public void getallRecords8() {
		 Iterable<Activity> findAll = activityRepo.findAll();
		 for(Activity activity:findAll) {
			 System.out.println(activity.getCost());
		 }
			
				
}
            
            
            
            
            
            
            
            
           //Print the details of all the activities that still have spaces available, including how many spaces are available.
            
           @Test
           public void getAllRecords9() {
        	   Iterable<Activity> findAll = activityRepo.findAll();
      		 for(Activity activity:findAll) {
      			System.out.println(activity.getId());
      			System.out.println(activity.getName());
      			System.out.println(activity.getCost());
      			System.out.println(activity.getCapacity());
      			System.out.println(activity.getDescription());
      			
      		 }
      		 
      			 
        	   
           }
}
			
			
			
	

