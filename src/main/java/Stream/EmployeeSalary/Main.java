package Stream.EmployeeSalary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.EmployeeSalary.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/23/2022 11:39 AM
 */
public class Main {

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        //Find out list of person
        List<String> peopleNames = people
                .stream()
                .map((person) -> person.name)
                .collect(Collectors.toList());

        System.out.println(peopleNames); //[Brandon, Hank, Jenna, Veronica, Jack]

        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Find out list of blue car
        List<Car> blueCars = cars
                .stream()
                .filter((car) -> car.color.equals("blue"))
                .collect(Collectors.toList());

        System.out.println(blueCars); //[Ford blue 23000.0, Lamborghini blue 150000.0, Renault blue 150000.0]

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        //Sum of employee salaries
        Float sumOfSalaries = employees
                .stream()
                .map((employee) -> employee.salary)
                .reduce(0f, Float::sum);
        //.reduce(0f, (acc, x) -> acc + x);

        System.out.println(sumOfSalaries); //440000.0

        //Sum of developer salaries
        Float sumOfDevSalaries = employees
                .stream()
                .filter(employee -> employee.jobTitle.equals("developer"))
                .map(developer -> developer.salary)
                //.reduce(0f, (acc, x) -> acc + x);
                .reduce(0f, Float::sum);

        System.out.println(sumOfDevSalaries); //250000.0

        //Number of Developer
        Long numberOfDev = employees
                .stream()
                .filter(employee -> employee.jobTitle.equals("developer")).count();
        //.collect(Collectors.counting());

        System.out.println(numberOfDev); //3

        //Number of Developer
        Float avgOfDevSalaries = sumOfDevSalaries / numberOfDev;
        System.out.println(avgOfDevSalaries); //83333.336

        //Average salary of employee by category
        Map<String, Float> avgSalEmpCat = employees
                .stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.jobTitle
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()
                                .stream()
                                .map(employee -> employee.salary)
                                .reduce(0f, Float::sum) / entry.getValue().size()
                ));

        System.out.println(avgSalEmpCat); //{construction worker=40000.0, developer=83333.336, writer=50000.0, sales executive=100000.0}
    }
}
