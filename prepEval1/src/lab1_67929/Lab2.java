package lab1_67929;

import java.util.HashSet;

public class Lab2 {
	
	HashSet<Lab1> labs1 = new HashSet<Lab1>();
	
	//METHOD
	boolean associateLab1(Lab1 aux){
		
		if(labs1.size()<10 & !labs1.contains(aux)){
			labs1.add(aux);
			return true;
		}
		else if(labs1.size()<10 & labs1.contains(aux)){
		return false;
		}
		else if(labs1.size()>=10){
			System.out.println("Trying to associate more than 10 objects!");
			System.exit(2);
		}
		return false;
	}
	

}
