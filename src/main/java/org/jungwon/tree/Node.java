package org.jungwon.tree;

import lombok.Data;

@Data
public class Node {
    // 노드의 값
    int value;

    // 왼쪽 자식 노드
    Node left;

    // 오른쪽 자식 노드
    Node right;


}