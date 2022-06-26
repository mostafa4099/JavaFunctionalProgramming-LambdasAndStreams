package Function.Composition;

import Stream.EmployeeSalary.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> timesTwo = x -> x * 2;
        System.out.println("10 * 2 = " + timesTwo.apply(10));

        Function<Integer, Integer> minusOne = x -> x - 1;
        System.out.println("10 - 1 = " + minusOne.apply(10));

        //Composition
        Function<Integer, Integer> timesTwoMinusOne = minusOne.compose(timesTwo);
        System.out.println("10 * 2 - 1 = " + timesTwoMinusOne.apply(10)); //19

        //Composition
        Function<Integer, Integer> minusOneTimesTwo = timesTwo.compose(minusOne);
        System.out.println("(10 - 1) * 2 = " + minusOneTimesTwo.apply(10)); //18

        //Composition
        Function<Integer, Integer> timesTwoAndThenMinusOne = timesTwo.andThen(minusOne);
        System.out.println("10 * 2 - 1 = " + timesTwoAndThenMinusOne.apply(10)); //19

        //Composition
        Function<Integer, Integer> minusOneAndThenTimesTwo = minusOne.andThen(timesTwo);
        System.out.println("(10 - 1) * 2 = " + minusOneAndThenTimesTwo.apply(10)); //18

        Employee[] employeesArr = {
                new Stream.EmployeeSalary.Employee("John", 34, "developer", 80000f),
                new Stream.EmployeeSalary.Employee("Hannah", 24, "developer", 95000f),
                new Stream.EmployeeSalary.Employee("Bart", 50, "sales executive", 100000f),
                new Stream.EmployeeSalary.Employee("Sophie", 49, "construction worker", 40000f),
                new Stream.EmployeeSalary.Employee("Darren", 38, "writer", 50000f),
                new Stream.EmployeeSalary.Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Function<Employee, String> getName = employee -> employee.name;
        Function<String, String> getReversString = str -> new StringBuilder(str).reverse().toString();
//        Function<String, String> getUpperCaseString = str -> str.toUpperCase();
        Function<String, String> getUpperCaseString = String::toUpperCase;
        Function<Employee, String> getReversUpperCaseName = getName.andThen(getReversString).andThen(getUpperCaseString);

        List<String> reverseNameList = employees.stream()
                .map(getReversUpperCaseName)
                .collect(Collectors.toList());
        System.out.println(reverseNameList); //[NHOJ, HANNAH, TRAB, EIHPOS, NERRAD, YCNAN]
    }
}
