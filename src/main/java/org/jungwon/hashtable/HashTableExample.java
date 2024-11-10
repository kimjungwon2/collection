package org.jungwon.hashtable;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class HashTableExample {

    public void useHash(){
        Map<Integer, String> hashtable = new HashMap<>();
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

    public void customHashMap() {
        Map<Integer, Edge> graph = new HashMap<Integer, Edge>() {{
            put(1, new Edge(3, 5));
            put(2, new Edge(1, 1));
        }};
    }

    public void sortHashMap(){
        Map<String, Integer> map =new HashMap<>();
        List<String> keyList = new ArrayList<>(map.keySet());

        map.put("일",1);
        map.put("이",2);
        map.put("삼",3);
        map.put("사",4);

        for(String key:keyList){
            Integer value = map.get(key);
            log.info("value:{}",value);
        }
    }

    public void useHashSet(){
        Set<String> hashset = new HashSet<>();
        hashset.add("김정원");
        hashset.add("노희원");
        log.info("hashset:{}", hashset);
        hashset.remove("김정원");
        log.info("hashset:{}", hashset);

        boolean hasSet1 = hashset.contains("노희원");
        boolean hasSet2 = hashset.contains("김정원");

        log.info("hasSet1:{}, hashSet2:{}",hasSet1, hasSet2);
    }

    public void computeIfAbsentExample(){
        Map<String, Integer> map = new HashMap<>();

        map.computeIfAbsent("count", key -> 1);
        System.out.println(map.get("count"));


        map.computeIfAbsent("count", key -> 2);
        System.out.println(map.get("count"));
    }

}
