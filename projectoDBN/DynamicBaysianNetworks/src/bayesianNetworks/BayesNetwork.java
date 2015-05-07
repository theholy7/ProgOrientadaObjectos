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
//		L ← Empty list where we put the sorted elements
//		Q ← Set of all nodes with no incoming edges
//		while Q is non-empty do
//		    remove a node n from Q
//		    insert n into L
//		    for each node m with an edge e from n to m do
//		        remove edge e from the graph
//		        if m has no other incoming edges then
//		            insert m into Q
//		if graph has edges then
//		    output error message (graph has a cycle)
//		else 
//		    output message (proposed topologically sorted order: L
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
