package Lambda;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File PACKAGE_NAME.Lambda.HelloGreeting.java: LambdasAndStreams
 * @CreationDate 6/14/2022 6:04 PM
 */
public class HelloGreeting implements Greeting {
    @Override
    public void sayGreeting() {
        System.out.println("Hello World!");
    }
}
