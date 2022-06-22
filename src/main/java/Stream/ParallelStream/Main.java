package Stream.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    public static void main(String[] args) {
        String[] strArr = {"functional", "programming", "in", "java", "is", "cool"};
        List<String> strList = Arrays.asList(strArr);

        // To process stream parallel need to use parallelStream() function instead of stream() function.
        List<String> processWordList = strList.parallelStream()
                .map(word -> {
                    System.out.println("Uppercasing: " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation: " + word);
                    return word+"!";
                })
                .collect(Collectors.toList());

        //Uppercasing: Java
        //Adding exclamation: JAVA
        //Uppercasing: is
        //Uppercasing: in
        //Uppercasing: cool
        //Uppercasing: functional
        //Uppercasing: programming
        //Adding exclamation: FUNCTIONAL
        //Adding exclamation: COOL
        //Adding exclamation: IN
        //Adding exclamation: IS
        //Adding exclamation: PROGRAMMING

        System.out.println(processWordList); //[FUNCTIONAL!, PROGRAMMING!, IN!, JAVA!, IS!, COOL!]
    }
}
