package tutorial4;

import java.io.File;
import java.util.Scanner;

public class tutorial4 {
	
	/** this is the main method every java program has this **/

	public static void main(String[] args) {
		
		
		/*int number = 1;
		
		do{
			System.out.println(number + " ");
			number ++;
			
			
		}while(number <= 20);*/
		
		File file = new File ("Ourfile.txt");
		
		Scanner scanner = new Scanner (System.in);
		
		char reply;
		
		System.out.println("Input a Letter");
		reply = scanner.findWithinHorizon(".", 0).charAt(0);
		
		if(reply == 'y' || reply == 'x'){
			
			file.delete();
		}else{
			
			System.out.println("Input another Letter");
		}
		
		

	}//end main

}
