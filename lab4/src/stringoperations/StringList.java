package stringoperations;

public class StringList {
	/* FIELDS*/
	protected Node rootNode = null;
	protected int size = 0;
	
	/* CONSTRUCTORS */
	
	public StringList(){}
	
	public StringList(String aux){
		this();
		insertString(aux);
	}
	
	/* METHODS */
	
	public void insertString(String aux){
		if(this.size == 0){
			Node newNode = new Node(aux);
			this.rootNode = newNode;
		}
		else{
			Node newNode = new Node(aux);
			Node currentNode = this.rootNode;
			while(currentNode.nextNode != null){
				currentNode = currentNode.nextNode;
				}
			
			currentNode.nextNode = newNode;
		}
		this.size = this.size + 1;
	}
	
	public int removeString(String aux){
		return 0;
	}
	
	public int length(){
		
		return this.size;
	}
	
	public String toString(){
		Node currentNode = this.rootNode;
		String finalString = "";
		
		while(currentNode != null){
			finalString = finalString + currentNode.text + " ";
			currentNode = currentNode.nextNode;
		}
		return finalString;
		
	}

	public static void main(String[] args) {
		
		StringList lista = new StringList();
		
		// TODO add string "one" to list

		lista.insertString("one");

		// TODO add string "two" to list
		lista.insertString("two");
	
		// TODO add string "three" to list
		lista.insertString("three");
		// TODO print with toString and verify {“one”,“two”,“three”}
		System.out.println(lista);
		// TODO build second list verify "==" and "equals"

	}

}
