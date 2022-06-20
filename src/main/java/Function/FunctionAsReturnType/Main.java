package Function.FunctionAsReturnType;

import java.util.function.Function;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:28 PM
 */
public class Main {
    public static Function<Integer, Integer> createMultiplier(Integer y) {
        //x type will be Integer. Because within the <> bracket we define Function Interface's apply method's argument type as integer and return type also integer.
        //when we called createMultiplier method we need to pass y value and when apply method need to pass x value.
        return (x) -> x * y; // return a function
    }

    public static void main(String[] args) {
        //NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> {return () -> "Hello Function!";};
        NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> () -> "Hello Function!";
        NoArgsFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        Function<Integer, Integer> twoMultiplier = createMultiplier(2);
        System.out.println(twoMultiplier.apply(5));

        Function<Integer, Integer> threeMultiplier = createMultiplier(3);
        System.out.println(threeMultiplier.apply(5));
    }
}
