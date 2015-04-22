package lab1_67929;

public class Lab1 {
	//Atributes
	int val1;
	static boolean val2;
	
	static{
		val2 = true;
	}

	//Constructor
	public Lab1(int val1) {
		super();
		this.val1 = val1;
	}

	@Override
	public String toString() {
		return "Lab1 with [val1=" + val1 + " and val2=" + val2+ "]";
	}
	
	
}
