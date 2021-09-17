
public class main {
	public static void main(String[] args) {
		// Create a graph
		Graph g = new Graph();
		// add vertexs
		g.addVertex();
		g.addVertex();
		g.addVertex();
		g.addVertex();
		// add edges
		g.addDirectededge(1, 2);
		g.addDirectededge(0, 2);
		g.addDirectededge(3, 1);
		g.addDirectededge(0, 3);
		// 
		int[][] matrix = GraphToMatrix.graphToMatrix(g);
		for(int i = 0; i < matrix.length; i++) {
			System.out.printf("[ ");
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf(" %d ", matrix[i][j] );
			}
			System.out.printf(" ]\n");
		}
		
	}

}
