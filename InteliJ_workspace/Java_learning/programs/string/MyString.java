package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class MyString {
    public static void main(String[] args) {
        String str = "Vikram kumar";
        out.println(str);

        /* StringRemoveSpecificCharacterOccurrence */
        String str1 = str.replace("a", "");
        out.println(str1);

        /* charCounts of string */
        str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " : " + value));

        /* first repeating/unique character in string */
        str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                //.filter(entry -> entry.getValue() == 1)
                .skip(0)
                .findFirst().ifPresent(entry -> System.out.println(entry.getKey()));

        //OR
        char[] chars = str.toCharArray();
        Map<Character, Integer> charsMap = new HashMap<>();
        for (char ch : chars) {
            if (!charsMap.containsKey(ch)) {
                charsMap.put(ch, 1);
            } else {
                charsMap.put(ch, charsMap.get(ch) + 1);
            }
        }
        out.println(charsMap); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
        //charsMap.forEach((key, value) -> out.println(key + " : " + value));

        /* first vowel in string */
        str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(ch -> "AEIOUaeiou".indexOf(ch.getKey()) >= 0)
                .skip(0)
                .findFirst().ifPresent(entry -> System.out.println(entry.getKey()));

    }
}
