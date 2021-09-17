import java.util.LinkedList;

public class GraphToMatrix {
	// converts graph to matrix representation  of graph 
	public static int[][] graphToMatrix(Graph g){
		// if size of graph is 0 return null
		if(g.getSize() == 0)
			return null;
		// init output matrix
		int[][] output = new int[g.getSize()][g.getSize()];
		// iterate through graph and format output
		for(int i = 0; i < g.getSize(); i++) {
			LinkedList<Node> cur = g.getEdges(i);
			while(cur.size()!=0) {
				Node curNode = cur.removeFirst();
				output[i][curNode.getV()] = 1;
				
			}
		}
		return output;
		
	}

}
