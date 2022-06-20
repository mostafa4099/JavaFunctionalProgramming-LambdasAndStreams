package FunctionAsArguments;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionAsArguments.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/17/2022 6:28 PM
 */
public class Main {
    public static void main(String[] args) {
        //passing add() function to add 2 and 3
        System.out.println(MyMath.combine2and3(MyMath::add));
        //passing subtract() function to subtract 3 from 2
        System.out.println(MyMath.combine2and3(MyMath::subtract));
        //passing lambda function to multiply 2 and 3
        System.out.println(MyMath.combine2and3((x, y) -> x * y));
    }
}
