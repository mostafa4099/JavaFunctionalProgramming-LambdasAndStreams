package Function.PartialApplication;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File TriFunction.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 4:04 PM
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
