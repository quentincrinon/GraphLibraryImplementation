package graph;

public class GraphImp implements Graph {
	private int maxVertices;
	private int maxEdges;
	private int edgeCount;
	private int vertexCount;
	private Edge[] edges;
	private Vertex[] vertices;
	private int[][] matriceAdj;
	
	public GraphImp(int maxV, int maxE) {
		this.maxVertices = maxV;
		this.maxEdges = maxE;
		this.edgeCount = 0;
		this.vertexCount = 0;
		this.edges = new Edge[this.maxEdges];
		this.vertices = new Vertex[this.maxVertices];
		this.matriceAdj = new int[this.maxVertices][this.maxVertices];
		initialiserMatrice();
	}
	
	@Override
	public void addEdge(Edge edge) {
		if (this.edgeCount >= this.maxEdges) {
			System.out.println("Already a maximum number of edges in the graph !");
			return;
		}
		else {
			int i;
			for (i = 0; i < this.edges.length; i++) {
				if (this.edges[i] == null) {
					this.edges[i] = edge;
				}
			}
			if (this.matriceAdj[edge.getV1().getIndice()][edge.getV2().getIndice()] == 0) {
				this.matriceAdj[edge.getV1().getIndice()][edge.getV2().getIndice()] = 1;
				this.edgeCount++;
			}
		}
	}

	@Override
	public void construireGrille() {
		// TODO Remove useless method
	}
	
	private void initialiserMatrice() {
		int i,j;
		for (i = 0; i < this.maxVertices; i++) {
			for (j = 0; j < this.maxVertices; j++) {
				this.matriceAdj[i][j] = 0;
			}
		}
	}

	@Override
	public void addVertex(Vertex vertex) {
		if (this.vertexCount >= this.maxVertices) {
			System.out.println("Already a maximum number of vertices in the graph !");
			return;
		}
		else {
			if (this.vertices[vertex.getIndice()] == null) {
				this.vertices[vertex.getIndice()] = vertex;
				this.vertexCount++;
			}
		}
	}

	@Override
	public boolean containsEdge(Edge edge) {
		boolean result = false;
		for (Edge e : edges) {
			if (e.equals(edge)) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public boolean containsVertex(Vertex vertex) {
		boolean result = false;
		for (Vertex v : vertices) {
			if (v.equals(vertex)) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public Vertex[] getNeighboors(Vertex vertex) {
		Vertex[] neighboors = new Vertex[maxVertices];
		int i;
		int j = 0;
		for (i = 0; i < this.matriceAdj.length; i++) {
			if (this.matriceAdj[vertex.getIndice()][i] == 1) {
				neighboors[j] = this.vertices[i];
				j++;
			}
		}
		return neighboors;
	}

	@Override
	public int getNumberOfEdges() {
		return this.edgeCount;
	}

	@Override
	public int getNumberOfVertices() {
		return this.vertexCount;
	}

	@Override
	public void removeEdge(Edge edge) {
		for (Edge e : edges) {
			if (e.equals(edge)) {
				e = null;
			}
		}
	}

	@Override
	public void removeVertex(Vertex vertex) {
		for (Vertex v : vertices) {
			if (v.equals(vertex)) {
				v = null;
			}
		}
	}
}
