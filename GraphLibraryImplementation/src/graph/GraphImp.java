package graph;

public class GraphImp implements Graph {
	private Edge[] edges;
	private Vertex[] vertices;
	private int[][] matriceAdj;
	
	public GraphImp() {
		this.edges = new Edge[50];
		this.vertices = new Vertex[100];
		this.matriceAdj = new int[100][100];
		initialiserMatrice();
	}
	
	@Override
	public void addEdge(Edge edge) {	
		int i;
		for (i = 0; i < this.edges.length; i++) {
			if (this.edges[i] == null) {
				this.edges[i] = edge;
				return;
			}
		}
		if (edge instanceof UndirectedEdge) {
			this.matriceAdj[((UndirectedEdge) edge).getV1().getIndice()][((UndirectedEdge) edge).getV2().getIndice()] = 1;
		}
		else {
			//TODO Cannot put the edge in the matrix because we can't access the vertices associated
		}
	}

	@Override
	public void addVertex() {
		//TODO Cannot add vertex BECAUSE WE DON'T FUCKING HAVE A VERTEX IN PARMATERS !!!!!
	}

	@Override
	public void construireGrille() {
		// TODO Remove useless method
	}
	
	private void initialiserMatrice() {
		int i,j;
		for (i = 0; i < 100; i++) {
			for (j = 0; j < 100; j++) {
				this.matriceAdj[i][j] = 0;
			}
		}
	}
}
