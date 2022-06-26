package Function.Recursion;

import Function.PartialApplication.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Map.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/21/2022 2:41 PM
 */
public class Main {
    static void countDown (Integer x) {
        if(x < 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x-1);
    }

    static void countUp (Integer x, Integer end) {
        if(x > end) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x+1, end);
    }

    public static void main(String[] args) {
        countDown(10);
        countUp(0, 10);
    }
}
