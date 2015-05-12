package lab2;

import java.util.Iterator;
import java.util.Arrays;

public class IterableArray<T> implements Iterable<T> {
	
	int array_cur;
	Object[] array;
	
	public IterableArray(int size){
		array_cur=0;
		array = new Object[size];
		Arrays.fill(array,null);
	}
	
	public void add(T t) throws IAException{
		if (array_cur<array.length) array[array_cur++]=t;
		else throw new IAException();
	}
	
	@Override
	public Iterator<T> iterator(){
		return new IAIterator<T>(this);
	}

	@Override
	public String toString() {
		return "IterableArray [array_cur=" + array_cur + ", array=" + Arrays.toString(array) + "]";
	}
	
	

}
