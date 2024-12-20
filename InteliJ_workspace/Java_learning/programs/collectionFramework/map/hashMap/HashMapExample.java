package collectionFramework.map.hashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        // Add key-value pairs
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Cherry");

        // Get a value using a key
        String fruit = hm.get(2);
        System.out.println("Fruit at key 2: " + fruit);

        // Check if a key exists
        boolean containsKey = hm.containsKey(4);
        System.out.println("Does the HashMap contain key 4? " + containsKey);

        // Get all keys
        System.out.println("Keys in the HashMap: " + hm.keySet());

        // Get all values
        System.out.println("Values in the HashMap: " + hm.values());

        // Remove a key-value pair
        hm.remove(1);

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + hm);
    }
}
