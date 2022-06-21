package Stream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Stream.Stream.Main.java: LambdasAndStreams
 * @CreationDate 6/15/2022 1:09 PM
 */
public class Main {
    public static void main(String[] args) {

        //Define new Stream
        Stream<String> lettersStream = Stream.of("a", "b", "c");

        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};

        //Array to Stream
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        //List to Stream
        Stream<String> shoppingListStream = shoppingList.stream();

        //Sorting, changing, filtering and accessing stream elements
        shoppingListStream
                .sorted() //intermediate function. Can't change original list. Can be place anywhere before forEach.
                .map(item -> item.toUpperCase()) //intermediate function. Can't change original list. Can be place anywhere before forEach.
                .filter(item -> !item.startsWith("C")) //intermediate function. Can't change original list. Can be place anywhere before forEach.
                .forEach(item -> System.out.println(item)); //Terminate function. Should be placed always end.

        //Stream is accessible or usable only one time
        //shoppingListStream.forEach(item -> System.out.println(item)); //Will generate exception.

        //Convert stream into list
        List<String> modifiedShoppingList = shoppingList.stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> !item.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(shoppingList);
        System.out.println(modifiedShoppingList);

        //Convert stream into array
        Integer [] modifiedScores = scoresStream.sorted().toArray(size -> new Integer[size]);
    }
}