package org.jungwon.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashSetExampleTest {

    HashSetExample hashSetExample = new HashSetExample();

    @Test
    void hasDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 3};

        hashSetExample.hasDuplicates(arr);
    }
}