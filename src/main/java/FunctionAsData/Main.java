package FunctionAsData;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionAsData.Main.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 5:18 PM
 */
public class Main {
    public static void main(String[] args) {
        final Boolean isDev = false;
        DataLoader loader = new DataLoader(isDev);

        System.out.println(loader.loadPerson.apply());
    }
}
