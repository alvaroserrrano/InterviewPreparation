import java.io.*;
import java.util.*;

//BREADTH FIRST SEARCH OF A GRAP
class BFS {
    private class Graph {
        private int V;
        private LinkedList<Integer> adj[];
    }

    Graph(int V){
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> iterator = ajd[s].listIterator;
            while(iterator.hasNext()){
                int n = iterator.next;
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}