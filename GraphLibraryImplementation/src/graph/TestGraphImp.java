package graph;

public class TestGraphImp {

	public static void main(String[] args) {
		System.out.println("Starting the test !\n");
		GraphImp unOrientedGraph = new GraphImp(10,5, false);
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		unOrientedGraph.addVertex(v1);
		unOrientedGraph.addVertex(v2);
		unOrientedGraph.addVertex(v3);
		unOrientedGraph.addVertex(v4);
		unOrientedGraph.addVertex(v5);
		unOrientedGraph.addVertex(v6);
		unOrientedGraph.addEdge(new DirectedEdge());
		unOrientedGraph.addEdge(new UndirectedEdge(v1, v3));
		unOrientedGraph.addEdge(new UndirectedEdge(v3, v6));
		unOrientedGraph.addEdge(new UndirectedEdge(v1, v5));
		unOrientedGraph.addEdge(new UndirectedEdge(v4, v6));
		unOrientedGraph.addEdge(new UndirectedEdge(v1, v2));
		unOrientedGraph.addEdge(new UndirectedEdge(v4, v5));
		Vertex[] neighboors = unOrientedGraph.getNeighboors(v1);
		System.out.println("This graph contains " + unOrientedGraph.getNumberOfVertices() + " vertices and " + unOrientedGraph.getNumberOfEdges() + " edges !\n");
		System.out.println("The neighboors of the vertex v1 are :\n");
		for (Vertex v : neighboors) {
			if (v != null) {
				System.out.println("v" + v.getIndice() + "\n");
			}
		}
		System.out.println("Succesful end of the test !\n");
		
		System.out.println("Actualy not able to run tests on an oriented graph because we can't create DirectedEdge objects properly (missing arguments) !\n");
	}
}
