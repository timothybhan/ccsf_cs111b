package week8_final_practice;

public class SmartBackpack {

protected double speed;

protected Location location;

public SmartBackpack(){

speed = 0;

location = new Location(0,0);

}

public SmartBackpack(double speedInput, Location locationInput){

Location copyLocation = new Location(locationInput);

speed = speedInput;

location = copyLocation;

}

public SmartBackpack(SmartBackpack backpackInput){

this(backpackInput.speed, backpackInput.location);

}

public double getSpeed() {

return speed;

}

public Location getLocation() {

return location;

}

public void lockdown() {

speed = 0;

}




}