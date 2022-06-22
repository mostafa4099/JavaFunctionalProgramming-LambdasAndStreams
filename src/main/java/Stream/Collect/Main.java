package Stream.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        String[] strArr = {"functional", "programming", "in", "Java", "is", "cool"};
        List<String> strList = Arrays.asList(strArr);

        // collect() function of stream is much similar with reduce() function.
        // reduce() return only single value with same input BinaryOperator type
        // But collect() can return any type data.
        // collect can return new processed single value to list also.
        // Collectors.toList() is used to convert stream to list as argument function of collect() function.
        List<String> filteredList = strList.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
        System.out.println(filteredList); //[functional, programming]

        // Collectors.toSet() is used to convert stream to set as argument function of collect() function.
        Set<String> filteredSet = strList.stream().filter(x -> x.length() > 5).collect(Collectors.toSet());
        System.out.println(filteredSet); //[functional, programming]

        // Collectors.joining() is used to join stream element to a String with delimiter or without delimiter as argument function of collect() function.
        String filteredJoinedStr = strList.stream().filter(x -> x.length() > 5).collect(Collectors.joining(","));
        System.out.println(filteredJoinedStr); //functional,programming

        // Collectors.counting() is used to count number of element of stream. Need to pass as argument function of collect() function.
        Long ctrWord = strList.stream().filter(x -> x.length() > 5).collect(Collectors.counting());
        System.out.println(ctrWord); //2

        // Collectors.groupingBy() is used to group stream elements which return a map object with key value
        // returned map's value will be a list of original list data type
        // In groupingBy() need to pass a function which will generate the key of the returned map.
        Map<Integer, List<String>> groupedWord = strList.stream().collect(Collectors.groupingBy(item -> item.length()));
        System.out.println(groupedWord); //{2=[in, is], 4=[Java, cool], 10=[functional], 11=[programming]}

        // Collectors.partitioningBy() is very similar to groupBy() function.
        // It uses to divide stream elements in two group based on specified predicate function.
        // It returns a map object with key value which contains two data.
        // returned map's value will be a list of original list data type
        // In partitioningBy() need to pass a function which will generate the key of the returned map, either true or false.
        Map<Boolean, List<String>> partitionWord = strList.stream().collect(Collectors.partitioningBy(item -> item.length() > 5));
        System.out.println(partitionWord); //{false=[in, Java, is, cool], true=[functional, programming]}
    }
}
