class Vehicle {

    int fuelUp(int liters) {
        System.out.println("Vehicle is fueled up with " + liters + " liters of fuel");
        return liters;
    }

    String fuelUp(String type) {
        System.out.println("Vehicle is fueled up with " + type + " fuel");
        return type;
    }

    String fuelup(int Liters, boolean isFullTank) {
        if (isFullTank) {
            return "Vehicle is fueled up with " + Liters + " liters of fuel for a full tank";
        } else {
            return "Vehicle is fueled up with " + Liters + " liters of fuel for a partial tank";
        }
    }

    void movement() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void movement() {
        System.out.println("Car is moving on road with 4 wheels");
    }
}

class Motorcycle extends Vehicle {
    void movement() {
        System.out.println("Motorcycle is moving on road with 2 wheels");
    }
}

class Truck extends Vehicle {
    void movement() {
        System.out.println("Truck is moving on road with 6 wheels");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle[] garages = { new Car(), new Motorcycle(), new Truck() };
        for (Vehicle v : garages) {
            v.movement();
        }

        Vehicle vehicle = new Vehicle();
        vehicle.fuelUp("Diesel");
    }
}