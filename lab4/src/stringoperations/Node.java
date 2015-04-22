package stringoperations;

public class Node {
	/* FIELDS */
	protected String text;
	protected Node nextNode;
	
	/* Constructor */
	protected Node() {
		super();
		this.text = "";
		this.nextNode = null;
		
	}
	
	protected Node(String aux){
		this();
		this.text = aux;
		this.nextNode = null;
		
	}
	
}
