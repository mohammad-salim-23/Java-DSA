import java.util.*;
public class ConnectedComponents {
     static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
         this.src= s;
         this.dest = d;
        }
     }
     public static void creategraph(ArrayList<Edge>[]graph){
       for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
       }
       graph[0].add(new Edge(0,1));
       
       graph[1].add(new Edge(1,0));
       graph[1].add(new Edge(1,2));

       graph[2].add(new Edge(2,1));

       graph[3].add(new Edge(3,4));
       graph[4].add(new Edge(4,3));
     }
     public static void Dfs(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }
        }

       
     }
      public static void dfsUtil(ArrayList<Edge>[]graph,int curr,boolean vis[]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e =graph[curr].get(i);
                    if(!vis[e.dest]){
                        dfsUtil(graph,e.dest,vis);
                    }
                }
        }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>graph[] = new ArrayList[v];
        creategraph(graph);
            Dfs(graph);
        
    }
}
