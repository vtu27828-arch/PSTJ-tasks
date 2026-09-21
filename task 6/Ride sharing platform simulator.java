import java.util.*;

class Vehicle {
    double calculateFare(int distance) {
        return 0;
    }
}

class Bike extends Vehicle {
    double calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    double calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    double calculateFare(int distance) {
        return distance * 12;
    }
}

class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;
    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    Vehicle vehicle;

    Trip(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    double fare(int distance) {
        return vehicle.calculateFare(distance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            try {
                Vehicle v;

                if (type.equals("Bike"))
                    v = new Bike();
                else if (type.equals("Auto"))
                    v = new Auto();
                else if (type.equals("Cab"))
                    v = new Cab();
                else
                    throw new Exception("Invalid booking");

                Trip trip = new Trip(v);
                System.out.println((int) trip.fare(distance));

            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }
    }
}

Input
3
Bike 10
Cab 15
Auto 8
Output
50
180
96
