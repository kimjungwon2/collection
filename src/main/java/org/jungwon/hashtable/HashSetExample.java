package org.jungwon.hashtable;


import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

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
}
