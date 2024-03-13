package classes;

import interfaces.Vehicle;

public class Truck implements Vehicle {

    @Override
    public String getVehicleType() {
        return "I am a Truck";
    }
}
