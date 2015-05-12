package lab2;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		IterableArray<String> ma = new IterableArray<String>(4);
		
		System.out.println("\n=== Trying to add 5 elemtens to an array of size 4");
		try{
			ma.add("Hello");
			ma.add("Iterable");
			ma.add("Array");
			ma.add("!");
			ma.add("Oups");
		} catch (IAException mae) {
			System.out.println("Exception: "+Arrays.toString(mae.getStackTrace()));
		}
		
		System.out.println("\n=== Printing the contents of the array");
		System.out.println(ma);
		
		/* As the Iterable interface was implemented a for-each loop can be used to iterate
		 * over the elements of IterableArray ma */
		System.out.println("\n=== Printing the contents of the array with a for-each loop");	
		for (String s: ma)
			System.out.println("Do whatever with "+s);
		
		System.out.println("\n=== Removing 2nd and 4th elements of the array");
		Iterator<String> it = (Iterator<String>) ma.iterator();
		boolean b = false;
		while(it.hasNext()){
			it.next();
			if (b) it.remove();
			b = !b;
		}
		System.out.println(ma);
		
		System.out.println("\n=== Trying to remove without making next");			
		it = (Iterator<String>) ma.iterator(); /* iterator needs to be reinitialized */
		try{
			it.remove();
		} catch (IllegalStateException mae) {
			System.out.println("Exception: "+Arrays.toString(mae.getStackTrace()));
		}
		System.out.println(ma);
		
		System.out.println("\n=== Trying two removes after two nexts");		
		try{
			it.next();
			it.next();
			it.remove();
			it.remove();
		} catch (IllegalStateException mae) {
			System.out.println("Exception: "+Arrays.toString(mae.getStackTrace()));
		}	
		System.out.println(ma);
			
		System.out.println("\n=== Trying one remove after one next");	
		it = (Iterator<String>) ma.iterator();	
		it.next();
		it.remove();
		System.out.println(ma);	

	}

}
