package Function.PartialApplication;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        Integer sum = 0;

        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x+y+z;
        sum = add.apply(5,6,7);
        System.out.println(sum);

        //Partial
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial = (x) -> (y,z) -> add.apply(x, y, z);
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);
        sum = add5.apply(6,7);
        System.out.println(sum);

        //Partial
        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial2 = (x, y) -> (z) -> add.apply(x, y, z);
        Function<Integer,Integer> add5And6 = addPartial2.apply(5,6);
        sum = add5And6.apply(7);
        System.out.println(sum);

        //Partial
        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial3 = x -> y -> z -> add.apply(x, y, z);
        Function<Integer,Function<Integer, Integer>> add6 = addPartial3.apply(6);
        Function<Integer, Integer> add7 = add6.apply(7);
        sum = add7.apply(8);
        System.out.println(sum);
    }
}
