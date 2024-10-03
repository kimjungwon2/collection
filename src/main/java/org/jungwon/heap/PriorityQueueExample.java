package org.jungwon.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;
import java.util.Queue;

@Slf4j
public class PriorityQueueExample {
    public void queue(){
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(5);
        pq.add(8);

        while(!pq.isEmpty()){
            Integer value = pq.remove();
            log.info("value:{}", value);
        }
    }
}
