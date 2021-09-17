import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraphToMatrixTest {

	@Test
	void test1() {
		Graph g = new Graph(); 
		// empty graph should return null
		assertEquals(GraphToMatrix.graphToMatrix(g), null);
	}
	@Test
	void test2() {
		Graph g = new Graph();
		// add vertexs
		g.addVertex();
		g.addVertex();
		g.addVertex();
		// add edges
		g.addDirectededge(1, 2);
		g.addDirectededge(0, 2);
		// output 1 is expected values
		int[][] output1 = {{0,0,1},{0,0,1},{0,0,0}};
		// output 2 is values returned from graph to matrix
		int[][] output2 = GraphToMatrix.graphToMatrix(g);
		boolean test = true;
		// compare all values to check if output is correct
		for(int i = 0; i < output1.length; i++) {
			for(int j = 0; j < output1[i].length; j++) {
				if(output1[i][j] != output2[i][j]) {
					test = false;
					break;
				}
					
				
			}
		}
		
		assertEquals(test, true);
	}
	

}
