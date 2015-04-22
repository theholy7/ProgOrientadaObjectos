package lab1_67929;

public class Lab3 extends Lab2 {
	
	public Lab3(Lab1 rLab1) {
		super(rLab1);
	}

	@Override
	public String toString() {
		return "Lab3 [rLab1=" + rLab1 + "]";
	}

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if(n < 5 && n%2 == 0){
			Lab1[] arrayLab1 = new Lab1[n+1];
			
			for(int i=0; i<=n; i++){
				arrayLab1[i] = new Lab1(i);
				System.out.println(arrayLab1[i]);
			}
			
			
		}
		else{
			System.out.println("Integer not smaller than 5 or even.");
			System.exit(1);
		}
		
	}
}
