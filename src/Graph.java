import java.util.ArrayList;
import java.util.LinkedList;
//simple unweighted directed graph 
// can only add verices and edges
public class Graph {
	
	private ArrayList<LinkedList<Node>> graph; 
	
	//Constructor for graph Object
	public Graph(){
		graph = new ArrayList<>(0);
	}
	// add vertex to graph 
	public void addVertex() {
		graph.add(new LinkedList<Node>());
	}
	// add directed edge to graph
	public boolean addDirectededge(int v1, int v2){
		// insures inputs are within the graph 
		if(!(v1 >= 0 && v2 >= 0 && v1 < graph.size() && v2 < graph.size())) {
			return false;
		}
		graph.get(v1).add(new Node(v2));
		return true;	
	}
	// return vertexs edges
	public LinkedList<Node> getEdges(int v1){
		// makes sure vertex exists
		if(!(v1 >= 0 && v1 <= graph.size())) 
			return null;
		// returns edges
		return graph.get(v1);
		
	}
	
}

