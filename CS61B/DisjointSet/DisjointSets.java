package CS61B.DisjointSet;

public interface DisjointSets {
    void connection(int p, int q);

    boolean isConnected(int p, int q);
}
