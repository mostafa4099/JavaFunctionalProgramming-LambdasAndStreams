package Stream.Reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(intArr);

        //reduce() function of stream return new processed value
        //return value depend on BinaryOperator's return type.
        //It's return a single value by process the BinaryOperator function.
        //We need to define identity value as starting value of BinaryOperator function's.
        Integer sum = 0;
        BinaryOperator<Integer> sumFunc = (identityVal, currentVal) -> {
            Integer result = identityVal + currentVal;
            System.out.println("Identity Value: "+identityVal+", Current Value: "+currentVal+", Sum: "+result);
            return result;
        };
//        sum = intList.stream().reduce(0, (identityVal, currentVal) -> identityVal + currentVal);
        sum = intList.stream().reduce(0, sumFunc);
        System.out.println(sum);
    }
}
