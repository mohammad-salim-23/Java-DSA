import java.util.ArrayList;
import java.util.Queue;
import java.util.*;
public class GraphtraversalBFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt=w;
        }
    }
   static void creategraph(ArrayList<Edge>graph[]){
       for(int i=0;i<graph.length;i++){
           graph[i]=new ArrayList<>();
       }
       
       //0 - vertex
       graph[0].add(new Edge(0,1,1));
       //1->vertex
       graph[1].add(new Edge(1,2,1));
       graph[1].add(new Edge(1,0,5));
       graph[1].add(new Edge(1,3,3));
       //2->vertex
       graph[2].add(new Edge(2,1,1));
       graph[2].add(new Edge(2,4,2));
       //3->vertex
       graph[3].add(new Edge(3,1,3));
       graph[3].add(new Edge(3,2,1));
       //4->vertex
       graph[4].add(new Edge(4,2,2));
       //print 2,s neighbour
    //   for(int i=0;i<graph[2].size();i++){
    //       Edge e  = graph[2].get(i);
    //       System.out.println(e.dest);
    //   }
   }      
   public static void bfs(ArrayList<Edge>graph[]){
       Queue<Integer>q = new LinkedList<>();
       boolean vis [] = new boolean[graph.length];
       q.add(0);
       while(!q.isEmpty()){
           int curr = q.remove();
           if(!vis[curr]){
           System.out.print(curr+" ");
           vis[curr] = true;
           for(int i=0;i<graph[curr].size();i++){
               Edge e = graph[curr].get(i);
               q.add(e.dest);
           }
       }
   }
   }
    public static void main(String[] args) {
      int v=5;
      ArrayList<Edge>graph[] = new ArrayList[v];
      creategraph(graph);
      bfs(graph);
       
    }
}
