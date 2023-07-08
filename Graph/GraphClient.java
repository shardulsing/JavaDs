package Graph;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
//		graph.addEdge("A", "B", 2);
//		graph.addEdge("A", "D", 10);
//		graph.addEdge("B", "C", 3);
//		graph.addEdge("C", "D", 1);
//		graph.addEdge("D", "E", 8);
//		graph.addEdge("E", "F", 5);
//		graph.addEdge("E", "G", 6);
//		graph.addEdge("F", "G", 4);
		graph.addEdge("A", "B", 8);
		graph.addEdge("A", "C", 4);
		graph.addEdge("A", "D", 5);
		graph.addEdge("C", "D", -3);
		graph.addEdge("D", "E", 4);
		graph.addEdge("B", "E", 2);
		graph.addEdge("E", "B", 1);
		
//		graph.display();
//		System.out.println(graph.numEdges());
//		System.out.println(graph.numVertex());
//		System.out.println(graph.containsEdges("A", "C"));
//		System.out.println(graph.containsEdges("E", "F"));
//		graph.removeEdge("D", "E");
//		graph.display();
//		graph.removeVertex("F");
//		graph.display();
//		
//		graph.addVertex("F");
//		 graph.display();
//		
//		 graph.addEdge("A", "F", 10);
//		 graph.display();
		
//		System.out.println(graph.hasPath("A", "F",new HashMap<>()));
//		System.out.println(graph.bfs("A", "F"));
//		System.out.println(graph.dfs("A", "F"));
//		graph.bft();
//		graph.dft();
//		graph.removeEdge("B", "C");
//		graph.removeEdge("F", "G");
//		graph.removeEdge("D", "E");
//		System.out.println(graph.isCyclic());
//		System.out.println(graph.isConnected());
//		System.out.println(graph.isTree());
//		System.out.println(graph.getCC());
//		graph.prims().display();
//		System.out.println(graph.dijkstra("A"));
//		graph.kruskal();
		System.out.println(graph.bellmanFord("A"));

	}

}
