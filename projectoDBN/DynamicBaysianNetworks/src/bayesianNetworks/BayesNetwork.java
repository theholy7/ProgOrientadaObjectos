package bayesianNetworks;

//Imports
import java.util.LinkedList;


public class BayesNetwork {
	//NO-ARG CONSTRUCTOR
	public BayesNetwork(int numberOfNodes) {
		super();
		this.numberOfNodes = numberOfNodes;
		
		for(int i=0; i<numberOfNodes; i++){
			Node node = new Node();
			this.nodeList.add(node);
		}
		
		// TODO Auto-generated constructor stub
	}

	//Set of nodes that creates the bn
	//LIST OR ARRAY OF THE NODES
	LinkedList<Node> nodeList = new LinkedList<Node>();
	int numberOfNodes;
	
	
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
	
	public boolean isDAG(){
		
//		L ← Empty list where we put the sorted elements
		LinkedList<Node> sortedGraph = new LinkedList<Node>();
		
//		Q ← Set of all nodes with no incoming edges
		LinkedList<Node> noParentNodes = new LinkedList<Node>();
		
		for(Node n: this.nodeList){
			if(n.parentNode.isEmpty()==true){
				noParentNodes.add(n);
			}
		}
		
//		while Q is non-empty do
		while(noParentNodes.isEmpty() != true){
//		    remove a node n from Q
			Node testNode = noParentNodes.pop();
			
//		    insert n into L
			sortedGraph.add(testNode);
			
//		    for each node m with an edge e from n to m do
			for(Node m: sortedGraph.getLast().childNode){
				
			
//		        remove edge e from the graph
				if(m.childNode)
					
//		        if m has no other incoming edges then
//		            insert m into Q
			}
		}
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
