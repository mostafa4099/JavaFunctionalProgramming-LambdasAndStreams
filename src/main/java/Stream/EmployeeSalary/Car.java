package Stream.EmployeeSalary;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.EmployeeSalary.Car.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/23/2022 11:41 AM
 */
public class Car {
    public final String make;
    public final String color;
    public final Float price;

    public Car(String make, String color, Float price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return make+" "+color+" "+price;
    }
}
