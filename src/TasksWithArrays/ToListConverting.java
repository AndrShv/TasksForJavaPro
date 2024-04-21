package TasksWithArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListConverting {
    public static void main(String[] args) {
    String [] array = {"apple", "banana", "apple", "orange", "apple", "grape", "banana"};
    List<String> list = Arrays.asList(array);
    System.out.println(list);

    }
}
