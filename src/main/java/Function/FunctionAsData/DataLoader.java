package Function.FunctionAsData;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataLoader.java: JavaFunctionalProgramming-LambdasAndStreams
 * @CreationDate 6/16/2022 5:07 PM
 */
public class DataLoader {
    public final NoArgsFunction<Person> loadPerson;

    public DataLoader(Boolean isDev) {
        //isDev==true load real person data in loadPerson
        //isDev==false load fake person data in loadPerson
        this.loadPerson = isDev ? this::loadRealPerson:this::loadFakePerson;
    }

    private Person loadRealPerson () {
        System.out.println("Loading Real Person...");
        return new Person("Mostafa", 32);
    };

    private Person loadFakePerson () {
        System.out.println("Loading Fake Person...");
        return new Person("Fake Person", 320);
    };
}
