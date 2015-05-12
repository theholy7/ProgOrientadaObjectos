package mainApp;

import java.io.*;

import bayesianNetworks.BayesNetwork;


public class BayesNetworkApp {
	
	
	public static void main(String[] args) {
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		//GET USER INPUT FROM COMMAND LINE
		//TRAIN, TEST, SCORE, RANDTEST, VAR
		
//		//CHECK VALIDITY OF INPUT
//
//		//Verification of the number of args
//		if(args.length!=4){// na verdade sao 4 argumentos, mas ha um oitavo opcional
//			System.out.println("Input errado! TA MALE/n");
//		}
//		//Verification of the train extension in file input
//		String extension = "";
//		String fileName=args[0];//posiçao do train file
//		int y = fileName.lastIndexOf('.');//procura pela posiçao onde está o ponto
//		if (y > 0) {
//			extension = fileName.substring(y+1);// enfia todos os caracteres do i+1 para a frente no extension
//		}
//		int result = extension.compareTo("csv");//result será 0 se forem iguais
//		if(result!=0){
//			System.out.println("Formato do train TA MALE/n");
//		}
//		//Verification of the test extension in file input
//		String fileName2=args[1];//posiçao do test file
//		int j = fileName2.lastIndexOf('.');//procura pela posiçao onde está o ponto
//		if (j > 0){
//			extension = fileName2.substring(j+1);// enfia todos os caracteres do i+1 para a frente no extension
//		}
//		int result2 = extension.compareTo("csv");//result será 0 se forem iguais
//		if(result2!=0){
//			System.out.println("Formato do test TA MALE/n");
//		}		
//		//END CHECK VALIDITY INPUT
		
		
		
		
		//READ FILE
		String fileName = "train-data.csv";
		
		try {
			String readFile = readFile(fileName);
			//System.out.println(readFile);
			
			String[] linesOfFile = readFile.split("\n");
			System.out.println(linesOfFile.length);
			
			String[][] collumnsOfLine = new String[linesOfFile.length][];
			
			for(int i=0; i<linesOfFile.length; i++){
				if(i==0){
					collumnsOfLine[i] = linesOfFile[i].split(",");
					System.out.println(collumnsOfLine[0].length);
				}
				else{
					collumnsOfLine[i] = linesOfFile[i].split(",", -1);
				}
			}
			
			//IF INDEX OF COLLUMNS IS OUT OF BOUNDS NO MORE VALUES ARE AVAILABLE
			//System.out.println(collumnsOfLine[3][189]);
			
			//PASS FILE TO BN
			//Calc number of nodes
			int numberOfNodes = 3;
			
			BayesNetwork bn = new BayesNetwork(numberOfNodes);
			
			//RANDOMIZE NETWORK
			
			//IS DAG?
			bn.isDAG();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
	
	static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}

}
