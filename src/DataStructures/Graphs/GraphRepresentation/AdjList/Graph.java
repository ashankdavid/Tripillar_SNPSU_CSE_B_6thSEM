package DataStructures.Graphs.GraphRepresentation.AdjList;

import java.util.ArrayList;

public class Graph {
    // Adjacency List
    ArrayList<ArrayList<Integer>> adjList;

    Graph(int vertices){
        adjList = new ArrayList<>();
        for(int i=0; i<vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void printAdjList(){
        for(int i=0; i<adjList.size(); i++){
            System.out.print(i + "->");
            for(int neighbour : adjList.get(i)){
                System.out.print(neighbour + ", ");
            }
            System.out.println();
        }
    }
}

class Driver{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5,0);
        g.addEdge(5,4);
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(1,4);
        g.addEdge(4,3);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.printAdjList();
    }
}