package Function.Composition;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.EmployeeSalary.Employee.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/23/2022 11:42 AM
 */
public class Employee {
    public final String name;
    public final Integer age;
    public final String jobTitle;
    public final Float salary;

    public Employee(String name, Integer age, String jobTitle, Float salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
