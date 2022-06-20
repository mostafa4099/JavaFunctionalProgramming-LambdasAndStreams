package Lambda;

import java.util.Random;
import java.util.function.IntBinaryOperator;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File PACKAGE_NAME.Lambda.Main.java: LambdasAndStreams
 * @CreationDate 6/14/2022 6:04 PM
 */
public class Main {
    public static void main(String[] args) {
        //Normal way
        Greeting greeting1 = new HelloGreeting();
        greeting1.sayGreeting();

        //Alternative
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayGreeting() {
                System.out.println("Hello World2!");
            }
        };
        greeting2.sayGreeting();

        //Using Lambda
        Greeting greeting3 = () -> System.out.println("Hello Lambda!");
        greeting3.sayGreeting();

        //Calculate Using Custom Functional Interface With Multi-line
        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int m = random.nextInt(50);
            return (x+y)*m;
        };
        System.out.println(calculator.calculate(5, 4));

        //Calculate Using Custom Functional Interface With Single-line
        Calculator calculator2 = (int x, int y) -> (x+y)* new Random().nextInt(50);
        System.out.println(calculator2.calculate(5, 4));

        //Calculate Using Build-in Functional Interface
        IntBinaryOperator calculator3 = (int x, int y) -> (x+y)* new Random().nextInt(50);
        System.out.println(calculator3.applyAsInt(5, 4));
    }
}
