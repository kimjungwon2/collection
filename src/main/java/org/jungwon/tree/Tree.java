package org.jungwon.tree;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

@Slf4j
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

    public void traversal(Node root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        traversal(root.right);
    }

    public void preorder(Node root){
        if(root == null) return;

        log.info("root:{}",root);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        log.info("root:{}",root);
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root ==null) return;

        postorder(root.left);
        postorder(root.right);
        log.info("root:{}",root);
    }

}
