package com.capgemini.sample;

/*sample class Vehicle which has certain methods which calculate the speed of vehicle, direction of vehicle*/
public class Vehicle {
	
	private double currentSpeed;
	private double currentDegree;
	private String driverName;
	private static int highestVehicleId;
	private int vehicleId;
	
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public double getCurrentDegree() {
		return currentDegree;
	}
	
	public void setCurrentDegree(double currentDegree) {
		this.currentDegree = currentDegree;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public int getVehicleId() {
		return vehicleId;
	}
	
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public Vehicle(String driverName) {
		
		this.driverName = driverName;
		
	}
	
	public Vehicle() {
		// no argument c'tor
	}
	
	public void changeSpeed(double chgSpeed) {
		
		currentSpeed = chgSpeed;
	}
	
	public void stop() {
		
		currentSpeed = 0.0;
	}
	
	public static int getHighestIdentificationNumber() {
		
		return highestVehicleId;
	}
	
	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDegree=" + currentDegree + ", driverName="
				+ driverName + ", vehicleId=" + vehicleId + "]";
	}	
}
