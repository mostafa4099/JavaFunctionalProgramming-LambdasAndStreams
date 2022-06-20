package Function.Closure;

import Function.FunctionAsReturnType.NoArgsFunction;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:28 PM
 */
public class Main {

    public static void main(String[] args) {
        //Closure
        NoArgsFunction<NoArgsFunction<String>> createClosureGreeter = () -> {
            //name variable accessible from return function but not outside of createClosureGreeter and return function which known as Closure
            String name = "Mostafa";
            return () -> "Hello " + name;
        };
        NoArgsFunction<String> closureGreeter = createClosureGreeter.apply();
        System.out.println(closureGreeter.apply());
    }
}
