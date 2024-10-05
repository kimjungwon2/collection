package org.jungwon.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
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

    public void makeHeap(){
        List<Integer> list= List.of(1,4,2,5,6,3);
        Queue<Integer> pq = new PriorityQueue<>(list);

        log.info("pq:{}",pq);
    }

    public void maxHeap(){
        Queue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void customHeap(){
        Queue<Person> pq = new PriorityQueue<>();
        pq.add(new Person("김필순",48));
        pq.add(new Person("김철수",21));
        pq.add(new Person("김영희",25));

        while(!pq.isEmpty()){
            Person person = pq.remove();
            log.info("person name:{}, age:{}", person.getName(), person.getAge());
        }
    }


}
