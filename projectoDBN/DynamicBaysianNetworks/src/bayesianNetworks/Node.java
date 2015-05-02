package bayesianNetworks;

//import
import java.util.LinkedList;

class Node {
	
	//Node attributes
	LinkedList<Node> parentNode = null;
	LinkedList<Node> childNode = null;
	
	//Data attributes
	int r;
	int[] data;

}
