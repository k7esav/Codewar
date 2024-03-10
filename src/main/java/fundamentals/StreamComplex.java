package fundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class StreamComplex {

    //This code is to let you know - Map can be considered as Set of Entries
    //And we can use Streams on it to do our operations
    public static List<String> languageSkills(Map<String, Integer> results) {

        //{"French" => 60, "Dutch" => 93, "Greek" => 71}  -->  ["Dutch", "Greek", "French"]
        return results.entrySet() //Set<Entry<String, Integer>
                .stream()
                .filter(mark -> mark.getValue() >= 60)
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
