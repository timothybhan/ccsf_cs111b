package week8_final_practice;

public class JetPack extends SmartBackpack {

double altitude;

public JetPack(double inputSpeed, Location inputLocation, double inputAltitude){

super(inputSpeed, inputLocation);

altitude = inputAltitude;

}

public JetPack(JetPack inputJP){

super(inputJP.getSpeed(), inputJP.getLocation());

altitude = inputJP.altitude;

}

public double getAltitude() {

return altitude;

}

public void land() {

super.lockdown();

altitude = 0;

}

public boolean isHigherAndFaster(JetPack inputJP){

return speed > inputJP.speed && altitude > inputJP.altitude;

}

}