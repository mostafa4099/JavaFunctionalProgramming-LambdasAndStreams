package Function.FunctionalInterface;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionalInterface.FunctionalInterface.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 2:31 PM
 */
public class Main {

    public static void main(String[] args) {
        //Using Helper class
        Function<Integer, Integer> myMath = MyMath::makeTriple; //First Integer parameter type and second one return type.
        //:: (double colon) known as Method reference operator. ClassName::MethodName;
        //Function functional interface uses for single parameter method.
        System.out.println(myMath.apply(5));
        System.out.println(myMath.apply(4)); //reusable

        //Without Helper class. Using lambda expression with 1 argument
        Function<Integer, Integer> triple = x -> x * 3;
        System.out.println(triple.apply(5));
        System.out.println(triple.apply(4));

        //Using lambda expression with 2 arguments
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 6));

        //More than 2 arguments or no arguments Function is possible using custom functional interface
        //Using lambda expression with 3 arguments (Using custom functional interface)
        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(5, 6, 2));

        //Using lambda expression with no arguments (Using custom functional interface)
        NoArgsFunction<Integer> random = () -> new Random().nextInt(50);
        System.out.println(random.apply());
    }
}