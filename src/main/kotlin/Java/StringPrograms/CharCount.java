package Java.StringPrograms;

import java.util.*;

public class CharCount {

    public static void main(String args[])
    {

        String name="AndroidDeveloper";

      //  occurrencesofcha_using_hashmap(name.toLowerCase());

       // occurrencesofcha_display_ordered(name.toLowerCase());

        occurrencesofcha_using_array(name.toLowerCase());
    }

    // Using Collection

    public static void occurrencesofcha_using_hashmap(String str)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c,0) + 1);
        }

        System.out.println("charcount "+charCountMap.toString());
    }


    // Using Array
    public static void occurrencesofcha_using_array(String str)
    {
        // Creating an array of size 256 (ASCII_SIZE)
        int[] count = new int[256];

        // Finds the length of the string
        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
             count[c]=count[c]+1;
        }
        // Iterate over the count array and print occurrences
        for (int i = 0; i < len; i++) {
            //if (count[str.charAt(i)] != 0) {
                System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
                // Set count to 0 to avoid printing the same character again
              //  count[str.charAt(i)] = 0;
            //}
        }
    }


    // Display it as Order
    public static void occurrencesofcha_display_ordered(String str)
    {

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already in the map, increment its count
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Create a list from the entries of the HashMap
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(charCountMap.entrySet());

        // Sort the list in descending order based on the values


        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Display the sorted character counts
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }


}
