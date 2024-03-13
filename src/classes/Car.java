package classes;

import interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public String getVehicleType() {
        return "I am a Car";
    }

}
