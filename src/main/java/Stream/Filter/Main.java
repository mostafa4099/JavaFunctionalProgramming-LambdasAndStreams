package Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        List<Integer> intList = Arrays.asList(intArr);

        //Normal way to double a list
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 == 0) {
                evenList.add(intList.get(i));
            }
        }
        System.out.println(evenList);

        //filter function of stream also return new processed stream
        //filter() used for find out elements based on some criteria.
        //within filter() we need to pass a function which return type will be Predicate<T>
        //Predicate accept a value and always return a boolean value.
        //based on boolean value element will add or not in return stream.
        List<Integer> oddList = new ArrayList<>();
        Predicate<Integer> isOdd = x -> x % 2 != 0;
//        oddList = intList.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        oddList = intList.stream().filter(isOdd).collect(Collectors.toList());
        System.out.println(oddList);

        String[] strArr = {"functional", "programming", "is", "cool"};
        List<String> strList = Arrays.asList(strArr);

        List<String> filteredStrList = new ArrayList<>();

        Predicate<String> isLengthGreater5 = str -> str.length() > 5;
//        filteredStrList = strList.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
        filteredStrList = strList.stream().filter(isLengthGreater5).collect(Collectors.toList());
        System.out.println(filteredStrList);

        //High order function
        //Function as return function
        Function<Integer, Predicate<String>> createLengthChecker = minLength -> str -> str.length()>minLength;

        Predicate<String> isLongerThan5 = createLengthChecker.apply(5);
        Predicate<String> isLongerThan3 = createLengthChecker.apply(3);

        filteredStrList = strList.stream().filter(isLongerThan5).collect(Collectors.toList());
        System.out.println(filteredStrList);

        filteredStrList = strList.stream().filter(isLongerThan3).collect(Collectors.toList());
        System.out.println(filteredStrList);
    }
}
