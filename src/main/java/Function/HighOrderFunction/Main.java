package Function.HighOrderFunction;

import Function.FunctionAsReturnType.NoArgsFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:28 PM
 */
public class Main {

    public static void main(String[] args) {
        //We can define function this way. A function should complete only one task.
        //But defined function completed two task. One is zero divisor checking
        //and another is as a divider. So, we need to refactor the code.
        BiFunction<Float, Float, Float> divide = (x, y) -> {
            if (y == 0f) {
                System.out.println("Second Argument can't be zero!");
                return y;
            }
            return x / y;
        };
        System.out.println(divide.apply(6f, 2f));
        System.out.println(divide.apply(6f, 0f));

        //We can solve above problem using following high order functions.
        BiFunction<Float, Float, Float> divider = (x, y) -> x / y;
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> zeroDivisorChecker =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Second Argument can't be zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };
        BiFunction<Float, Float, Float> divideSafe = zeroDivisorChecker.apply(divide);
        System.out.println(divideSafe.apply(6f, 2f));
        System.out.println(divideSafe.apply(6f, 0f));
    }
}
