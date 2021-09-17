
public class Node {
	private String colour;
	private int distance;
	private String pi; 
	private int v;
	
	
	public Node(int v) {
		colour = "white";
		distance = Integer.MAX_VALUE;
		pi = null;
		this.v = v; 
			
	}
	public void setColour(String colour) {this.colour = colour;} 
	public String getColour() {return colour;}
	public void setDistance(int distance) {this.distance = distance;}
	public int getDistance() {return distance;}
	public void setPi() {this.pi = pi;}
	public String getPi() {return pi;}
	public int getV() {return v;}
	

}
