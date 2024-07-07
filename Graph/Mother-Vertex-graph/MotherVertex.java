import java.util.*;
public class MotherVertex{
    public static int findMotherVertex(int V,ArrayList<ArrayList<Integer>>graph){
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        int mother = -1;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
                mother = i;
            }
        }
        Arrays.fill(visited,false);
        dfs(mother,graph,visited);
        for(int i=0;i<V;i++){
            if(!visited[i]){
                return -1;
            }
        }
        return mother;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>>graph,boolean[]visited){
        visited[node] = true;
        for(int i: graph.get(node)){
            if(!visited[i]){
                dfs(i,graph,visited);
            }
        } 
    }
    public static void main(String args[]){
       int v = 7;
       ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
       for(int i=0;i<v;i++){
         graph.add(new ArrayList<>());
       }
    //    Adding edges to the graph
    graph.get(0).add(1);
    graph.get(0).add(2);
    graph.get(1).add(3);
    graph.get(4).add(1);
    graph.get(6).add(4);
    graph.get(5).add(6);
    graph.get(5).add(2);
    graph.get(6).add(0);

    int mothervertex = findMotherVertex(v,graph);
    System.out.println(mothervertex);
    }
}