package bayesianNetworks;

//Imports
import java.util.LinkedList;


public class BayesNetwork {
	//Set of nodes that creates the bn
	//LIST OR ARRAY OF THE NODES
	LinkedList<Node> nodeList = new LinkedList<Node>();
	
	//Methods to build the Network
	void addEdge(Node parentNode, Node childNode){
		//Assign a child to the parent Node
		parentNode.childNode.add(childNode);
		
		//Assign a parent to the child Node
		childNode.parentNode.add(parentNode);
	}
	
	void removeEdge(Node parentNode, Node childNode){
		
	}
	
	void flipEdge(Node parentNode, Node childNode){
		
	}
	
	boolean isDAG(BayesNetwork bn){
		return false;
	}
	
	double calculateLL(BayesNetwork bn){
		return 0;
	}
	
	double calculateMDL(BayesNetwork bn){
		return 0;
	}
	
	double calculateScore(BayesNetwork bn){
		return 0;
	}

}
