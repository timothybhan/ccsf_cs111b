package week8_final_practice;

public class Location {
	  
	   private double latitude, longitude;
	  
	   public Location(double latitude, double longitude) {
	       this.latitude = latitude;
	       this.longitude = longitude;
	      
	       System.out.println("About to check for negative values...");

	       if (latitude < 0 || longitude < 0) {
	           throw new IllegalArgumentException("Negative values.");
	       }
	      
	       System.out.println("Looks good.");
	       System.out.println("Called the 2 arg constructor...");     }

	   
	   public Location(Location location) {
	       this(location.latitude, location.longitude);
	       System.out.println("Called the 1 arg constructor...");     
	   }

	   // Getters and setters here...
	   public double getLat() {
		   return latitude;
	   }
	   
	   public double getLong() {
		   return longitude;
	   }
	   
	   public void print() {
		   System.out.println("lat:"+latitude+" long:"+longitude);
	   }
	}