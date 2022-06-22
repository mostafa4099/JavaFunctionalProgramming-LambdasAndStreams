package Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        //Normal way to double a list
        List<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            doubleList.add(intList.get(i) * 2);
        }
        System.out.println(doubleList); //[2, 4, 6, 8, 10]

        //We can convert list to stream
        //map() function of stream return new processed stream
        //map() and others stream functions don't mute original list
        //the functions return modified stream only but not modify the original data
        //returned stream or any stream can convert to list using collect function
        List<Integer> tripleList = new ArrayList<>();
        Function<Integer, Integer> tripleFunc = x -> x * 3;
//        tripleList = intList.stream().map(x -> x * 3).collect(Collectors.toList());
        tripleList = intList.stream().map(tripleFunc).collect(Collectors.toList());
        System.out.println(tripleList); //[3, 6, 9, 12, 15]
    }
}
