package Stream.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

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
            // Identity Value: 0, Current Value: 1, Sum: 1
            // Identity Value: 1, Current Value: 2, Sum: 3
            // Identity Value: 3, Current Value: 3, Sum: 6
            // Identity Value: 6, Current Value: 4, Sum: 10
            // Identity Value: 10, Current Value: 5, Sum: 15
            return result;
        };
//        sum = intList.stream().reduce(0, (identityVal, currentVal) -> identityVal + currentVal);
        sum = intList.stream().reduce(0, sumFunc);
        System.out.println(sum); //15
    }
}
