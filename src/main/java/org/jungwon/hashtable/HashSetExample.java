package org.jungwon.hashtable;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
public class HashSetExample {
    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            boolean isNotDuplicate = set.add(num);

            log.info("isDuplicate:{}", isNotDuplicate);
            if (!isNotDuplicate) {
                return true;
            }
        }
        return false;
    }

    public Set<Set<String>> findAnagramGroups(String[] words) {
        Set<Set<String>> anagramGroups = new HashSet<>();

        for (String word : words) {
            String sortedWord = sortString(word);
            Set<String> anagramGroup = new HashSet<>();
            anagramGroup.add(word);

            boolean isAdded = false;
            for (Set<String> group : anagramGroups) {
                if (group.stream().anyMatch(w -> sortString(w).equals(sortedWord))) {
                    group.add(word);
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                anagramGroups.add(anagramGroup);
            }
        }
        return anagramGroups;
    }

    public void processUniqueEvents(List<String> events) {
        Set<String> uniqueEvents = new HashSet<>();

        events.stream()
                .filter(uniqueEvents::add)
                .forEach(event -> System.out.println("Processing unique event: " + event));
    }


    private String sortString(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
