
public class Vehicle implements IVehicle {
    private Boolean isDriving;

    public void drive() {
        System.out.println("The vehicle is driving");
        isDriving = true;
    }

    public Boolean brake() {
        isDriving = false;
        System.out.println("The vehicle is stopped");
        return isDriving; 
    }

    @Override
    public void turn() {
        System.out.println("Tokyo drift. Skeet skeet.");
    }

    @Override
    public void honk() {
        System.out.println("Honk Honk");
    }

    @Override
    public void hold(Object item) {
        System.out.println("The car is holding x");
    }

    @Override
    public void shield() {
        System.out.println("hero blocked attack by hiding behind a vehicle.");

    }

    @Override
    public void crash() {
        System.out.println("Oh no you crashed, save 15% or more on car insurance if you switch to Geico.");
    }

}

