package FunctionAsData;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionAsData.Person.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 5:06 PM
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+name +" and age: "+age;
    }
}
