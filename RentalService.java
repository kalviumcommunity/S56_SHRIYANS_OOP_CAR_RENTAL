public class RentalService {
    public static void rentCar(Car car) {
        if (car.isAvailable()) {
            car.setAvailability(false);
            System.out.println("Car rented successfully: " + car.getDetails());
        } else {
            System.out.println("Car is already rented: " + car.getDetails());
        }
    }

    public static void returnCar(Car car) {
        car.setAvailability(true);
        System.out.println("Car returned successfully: " + car.getDetails());
    }
}
