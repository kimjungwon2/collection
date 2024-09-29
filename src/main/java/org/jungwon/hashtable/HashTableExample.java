package org.jungwon.hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

    public void useHash(){
        Map<Integer, String> hashtable = new HashMap<Integer, String>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");

        String three = hashtable.get(3);

        hashtable.replace(3,"삼");

    }

}
