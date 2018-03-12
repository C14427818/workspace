package tutorial3;

import java.util.Random;
import java.util.Scanner;

public class Tutorial3 {
	
	
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int user = scanner.nextInt();
		int randomNum = new Random().nextInt(10) + 1;// + 1 = between 1 and 10
		
		while(user != randomNum){
			
		
			//if(user == randomNum){
				
				//System.out.println("Right!");
				
			//}
			//else{
				
				System.out.println("Wrong!");
				user = scanner.nextInt();
			//}
		
		}
		
		System.out.println("Right!");
		
		
		
	}//end class
	
	

}
