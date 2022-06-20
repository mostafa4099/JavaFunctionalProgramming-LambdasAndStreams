package Function.FunctionAsData;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 5:18 PM
 */
public class Main {
    public static void main(String[] args) {
        final Boolean isDev = true;
        DataLoader loader = new DataLoader(isDev);

        System.out.println(loader.loadPerson.apply());
    }
}
