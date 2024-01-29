package com.TravelPackage.Entity;

import java.util.List;

import javax.persistence.*;

import com.TravelPackage.Passengertype;



@Entity
@Table(name="passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int passengerNumber;

    @ManyToOne
    @JoinColumn(name = "travel_package_id")
    private TravelPackage travelPackage;

    @Enumerated(EnumType.STRING)
    private Passengertype passengerType;

    private double balance;

    @ManyToMany
    @JoinTable(
        name = "passenger_activity",
        joinColumns = @JoinColumn(name = "passenger_id"),
        inverseJoinColumns = @JoinColumn(name = "activity_id")
    )
    private List<Activity> signedActivities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public TravelPackage getTravelPackage() {
		return travelPackage;
	}

	public void setTravelPackage(TravelPackage travelPackage) {
		this.travelPackage = travelPackage;
	}

	public Passengertype getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(Passengertype passengerType) {
		this.passengerType = passengerType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Activity> getSignedActivities() {
		return signedActivities;
	}

	public void setSignedActivities(List<Activity> signedActivities) {
		this.signedActivities = signedActivities;
	}

    
}
