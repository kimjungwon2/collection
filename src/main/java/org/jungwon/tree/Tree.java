package org.jungwon.tree;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Tree {

    public Set<Integer> levelOrder(Node root){
        if(root == null) return null;

        Set<Integer> visited = new HashSet<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curNode = q.remove();
            visited.add(curNode.value);

            if(curNode.left != null) q.add(curNode.left);

            if(curNode.right != null) q.add(curNode.right);

        }

        return visited;
    }

    void traversal(Node root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        traversal(root.right);
    }


}
