package graph;

public class TestGraphImp {

	public static void main(String[] args) {
		System.out.println("Starting the test !");
		GraphImp graph = new GraphImp(10,5);
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);
		graph.addVertex(v5);
		graph.addVertex(v6);
		graph.addEdge(new UndirectedEdge(v1, v3));
		graph.addEdge(new UndirectedEdge(v3, v6));
		graph.addEdge(new UndirectedEdge(v1, v5));
		graph.addEdge(new UndirectedEdge(v4, v6));
		graph.addEdge(new UndirectedEdge(v1, v2));
		graph.addEdge(new UndirectedEdge(v4, v5));
		Vertex[] neighboors = graph.getNeighboors(v1);
		System.out.println("This graph contains " + graph.getNumberOfVertices() + " vertices and " + graph.getNumberOfEdges() + " edges !\n");
		System.out.println("The neighboors of the vertex v1 are :\n");
		for (Vertex v : neighboors) {
			if (v != null) {
				System.out.println("v" + v.getIndice() + "\n");
			}
		}
		System.out.println("Succesful end of test !");
	}
}
