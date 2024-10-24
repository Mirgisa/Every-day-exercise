import java.util.*;
public class SortSet {
    public static void main(String[] args) {
        // Create a set
        //Set<Integer> set = new HashSet<>(Arrays.asList(8, 3, 5, 1, 9, 4, 6));
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(6);
        set.add(1);
        set.add(4);


        // Convert set to a list
        List<Integer> sortedList = new ArrayList<>(set);
        set.addAll(sortedList);

        // Sort the list
        Collections.sort(sortedList);

        // Print sorted list
        System.out.println("Sorted list: " + sortedList);
        System.out.println("Sorted set: " + set);
    }
}

