package org.jungwon.hashtable;

import java.util.Objects;

public class Edge {
    public int dest;
    public int weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return dest == edge.dest && weight == edge.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dest, weight);
    }
}
