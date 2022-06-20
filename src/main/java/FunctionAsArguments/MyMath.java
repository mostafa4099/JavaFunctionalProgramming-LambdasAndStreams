package FunctionAsArguments;

import java.util.function.BiFunction;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionAsArguments.MyMath.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:29 PM
 */
public class MyMath {
    public static Integer add (Integer x, Integer y) {
        return x+y;
    }

    public static Integer subtract (Integer x, Integer y) {
        return x-y;
    }

    public static Integer combine2and3 (BiFunction<Integer, Integer, Integer> combineFunc) {
        return combineFunc.apply(2,3);
    }
}
