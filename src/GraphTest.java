import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class GraphTest {
	
	@Test
	void addEdges_test1() {
		System.out.println("add edge test 1");
		Graph g = new Graph();
		//vertex 0 
		g.addVertex();
		//vertex 1
		g.addVertex();
		
		// should return false when one of the Vertices does not exist in graph
		assertEquals(g.addDirectededge(0, 2), false);
	}
	@Test
	void addEdges_test2() {
		System.out.println("add edge test 2");
		Graph g = new Graph();
		//vertex 0 
		g.addVertex();
		//vertex 1
		g.addVertex();
		
		// should return true when edge added successfully
		assertEquals(g.addDirectededge(0, 1), true);
	}
	@Test
	void getEdges_test() {
		System.out.println("getEdges test 1");
		Graph g = new Graph();
		
		// should return null when vertex is not in graph
		assertEquals(null, g.getEdges(12));
	}
	@Test
	void getEdges_test2() {
		System.out.println("getEdges test 2");
		Graph g = new Graph();
		g.addVertex();
		
		// should return empty linked list when no edges are assigned to a vertex
		assertEquals(new LinkedList<Node>(), g.getEdges(0));
	}
	@Test
	void getEdges_test3() {
		System.out.println("add edge test 3");
		Graph g = new Graph();
		//vertex 0 
		g.addVertex();
		//vertex 1
		g.addVertex();
		g.addDirectededge(0, 1);
		LinkedList<Node> output = new LinkedList<>();
		output.add(new Node(1));
		// should return a linked list of edges a particular vertex has
		assertEquals(output.getFirst().getV(), g.getEdges(0).getFirst().getV());
	}

}
