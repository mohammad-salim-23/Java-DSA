import java.util.*;
public class FindCycleUgraph{
    static int n=5;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
            rank[i]=0;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
       graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int x,int y){
        int parA = find(x);
        int parB = find(y);
        if(rank[parA]==rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    public static boolean findCycle(ArrayList<Edge>graph[],int E){
        init();
        for(ArrayList<Edge>edges: graph){
            for(Edge e:edges){
                int x = find(e.src);
                int y = find(e.dest);
                if(x==y){
                    return true;
                }
                union(x,y);
            }
        }
        return false;

    }
    public static void main(String args[]){
       int v=5;
       int E = 7;
       ArrayList<Edge>graph[] = new ArrayList[v];
       createGraph(graph);
        System.out.println(findCycle(graph,E));
    }
}