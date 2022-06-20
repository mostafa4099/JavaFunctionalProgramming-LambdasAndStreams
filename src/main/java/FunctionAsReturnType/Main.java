package FunctionAsReturnType;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionAsArguments.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:28 PM
 */
public class Main {
    public static void main(String[] args) {
        NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> () -> "Hello Function!";
        NoArgsFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
