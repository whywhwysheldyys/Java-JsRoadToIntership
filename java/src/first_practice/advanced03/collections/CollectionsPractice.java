package first_practice.advanced03.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of(
                "Ivan", "Elena", "Igor", "Igor", "Oleg"
        ));

        HashSet<String> namesFilter = new HashSet<>(names);
        System.out.println(namesFilter);

        HashMap<String, Integer> workersSalary = new HashMap<>(Map.of(
                "Oleg", 1230,
                "Irina", 1450,
                "Anna", 2340
        ));

        System.out.println(workersSalary.get("Irina"));
    }
}