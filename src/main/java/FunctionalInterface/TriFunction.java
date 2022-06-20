package FunctionalInterface;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File FunctionalInterface.TriFunction.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 4:04 PM
 */
@java.lang.FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
