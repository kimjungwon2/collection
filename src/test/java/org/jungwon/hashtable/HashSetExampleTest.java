package org.jungwon.hashtable;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HashSetExampleTest {

    HashSetExample hashSetExample = new HashSetExample();

    @Test
    void hasDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 3};

        hashSetExample.hasDuplicates(arr);
    }

    @Test
    void findAnagram(){
        String[] words = {"listen", "silent", "enlist", "google", "gogole", "cat", "act", "tac"};


        Set<Set<String>> anagramGroups = hashSetExample.findAnagramGroups(words);


        for (Set<String> group : anagramGroups) {
            System.out.println("Anagram Group: " + group);
        }
    }
    
    @Test
    void processDuplicate(){
        List<String> events = List.of(
                "Login Event",
                "Purchase Event",
                "Login Event",
                "Logout Event"
        );

        hashSetExample.processUniqueEvents(events);
    }
}