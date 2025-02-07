import java.util.ArrayList;
import java.util.List;

class Car {
    private final String make;
    private final String model;
    private final String licensePlate;
    private boolean isRented;

    public Car(String make, String model, String licensePlate) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.isRented = false;
    }

    public void rentCar() {
        if (!isRented) {
            isRented = true;
        }
    }

    public void returnCar() {
        isRented = false;
    }

    public boolean isRented() {
        return isRented;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}

class Customer {
    private final String name;
    private final String id;
    private final String phoneNumber;

    public Customer(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

class RentalAgency {
    private final List<Car> cars = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(String licensePlate, String customerId) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && !car.isRented()) {
                car.rentCar();
                System.out.println("Car rented successfully to customer ID: " + customerId);
                return;
            }
        }
        System.out.println("Car not available for rent.");
    }

    public void returnCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                car.returnCar();
                System.out.println("Car returned successfully.");
                return;
            }
        }
        System.out.println("Car with license plate " + licensePlate + " not found.");
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

public class Main {
    public static void main(String[] args) {
        RentalAgency rentalAgency = new RentalAgency();

        rentalAgency.addCar(new Car("Toyota", "Corolla", "KDA123"));
        rentalAgency.addCar(new Car("Honda", "Civic", "KDB789"));

        rentalAgency.addCustomer(new Customer("Abiud Gaisha", "K417", "0712345678"));
        rentalAgency.addCustomer(new Customer("Dylan Ondiek", "K802", "0787654321"));

        System.out.println("\n--- Rent a Car ---");
        rentalAgency.rentCar("KDA123", "K417");

        rentalAgency.rentCar("KDA123", "K802");

        System.out.println("\n--- Return a Car ---");
        rentalAgency.returnCar("KDA123");

        rentalAgency.rentCar("KDA123", "K802");

        System.out.println("\n--- All Cars ---");
        for (Car car : rentalAgency.getCars()) {
            System.out.println(car);
        }

        System.out.println("\n--- All Customers ---");
        for (Customer customer : rentalAgency.getCustomers()) {
            System.out.println(customer);
        }
    }
}
