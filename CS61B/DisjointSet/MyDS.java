package CS61B.DisjointSet;

public class MyDS implements DisjointSets{
    private int[] id;
    public MyDS(int n){
        id = new int[n];
        for(int i = 0; i < id.length; ++i) id[i] = -1;
    }

    private int find(int q){
        int r = q;
        while(id[r] != -1) r = id[r];
        return r;
    }

    @Override
    public void connection(int p, int q) {
        int rp = find(p);
        int rq = find(q);
        id[rq] = rp;
    }

    @Override
    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public static void main(String[] args) {
        MyDS mds = new MyDS(10);
        mds.connection(1, 3);
        mds.connection(3, 4);
        System.out.println(mds.isConnected(1, 5));
    }
}
