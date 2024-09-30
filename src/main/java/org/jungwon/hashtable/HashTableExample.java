package org.jungwon.hashtable;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashTableExample {

    public void useHash(){
        Map<Integer, String> hashtable = new HashMap<Integer, String>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");

        String three = hashtable.get(3);
        log.info("three:{}", three);

        hashtable.replace(3,"삼");
        log.info("hashtable:{}", hashtable);

        hashtable.remove(2);
        log.info("hashtable:{}", hashtable);

        if (hashtable.containsKey(2)) {
            log.info("2 : {}",hashtable.get(2));
        } else {
            log.info("저장된 키가 없습니다.");
        }
    }

}
