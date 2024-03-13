import classes.Car;
import classes.Punto;
import classes.Truck;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Truck truck = new Truck();
        Punto punto = new Punto();

        System.out.println(car.getVehicleType());
        System.out.println(truck.getVehicleType());
        System.out.println(punto.getVehicleType());


    }
}