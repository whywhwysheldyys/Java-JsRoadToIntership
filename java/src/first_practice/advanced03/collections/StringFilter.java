package first_practice.advanced03.collections;

import java.util.*;

public class StringFilter {
    public static void main(String[] args) {
//        String [] fruits = {"apple", "banana", "orange", "apple", "banana","cherry"};
//        List<String> listFruits = new ArrayList<>(Arrays.asList(fruits));
//
//        Set<String> setFruits = new HashSet<>(listFruits);
//
//        boolean containDuplicates;
//        containDuplicates = setFruits.retainAll(listFruits) != setFruits.isEmpty();
//
//        System.out.println(containDuplicates);

        //оптимизированный способ решения

        String[] fruits = {"apple", "banana", "orange", "apple", "banana","cherry"};
        List<String> listFruits = Arrays.asList(fruits);

        Set<String> setFruits = new HashSet<>(listFruits);

        boolean containDuplicates = setFruits.size() < listFruits.size();

        System.out.println("Есть дубликаты? " + containDuplicates);
    }
}