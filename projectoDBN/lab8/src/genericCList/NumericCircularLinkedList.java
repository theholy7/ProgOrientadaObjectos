package genericCList;

public class NumericCircularLinkedList<T extends Number> extends CircularLinkedList<T> {

	
	public double mean(){
		CLLNode<T> current = this.head;
		
		double sum = 0;
		while(current.next != this.head)
			sum = sum + current.next.element.doubleValue();
		
		return sum/this.count;
	}

}
