package org.jungwon.heap;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueExampleTest {

    PriorityQueueExample priorityQueueExample = new PriorityQueueExample();


    @Test
    void 우선순위커스텀(){
         priorityQueueExample.customHeap();
    }
}