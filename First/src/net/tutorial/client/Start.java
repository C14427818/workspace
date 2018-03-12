package net.tutorial.client;

import java.io.File;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		
		netTutorial netTutorial = new netTutorial();
		
		netTutorial.gameFrame();
		//netTutorial.setTitleName("Frame");
		System.out.println(netTutorial.getTitleName());

	}
	
	public void createNewTextFile(){
		
		try{
			
			new File("newtextfile.txt").createNewFile();
			
		}catch(IOException e){
			
			e.printStackTrace();
			System.out.println(e);
			
		}
	}

}//end class

