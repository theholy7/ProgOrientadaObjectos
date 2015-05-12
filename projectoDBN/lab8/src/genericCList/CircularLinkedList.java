package genericCList;

public class CircularLinkedList<T> {
	
	CLLNode<T> head = null;
	int count = 0;
	
	public CircularLinkedList() {
		super();
	}
	
	public CircularLinkedList(T element) {
		this();
		add(element);
		
	}
	
	public void add(T element){
		if(count == 0){
			this.head = new CLLNode<T>(element, this.head);
			++this.count;
		}
		else{
			CLLNode<T> current = this.head;
			while(current.next != this.head)
				current = current.next;
				
			current.next = new CLLNode<T>(element, this.head);
			++this.count;
		}	
	}
	
	public void remove(T element){
		
		CLLNode<T> current = this.head;
		CLLNode<T> previous = null;
		
		while(current.next != this.head){
			previous = current;
			
			if(element.equals(current.element)){
				previous.next = current.next;
				
			}
			current = current.next;
		}
	}
	
}