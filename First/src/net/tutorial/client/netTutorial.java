package net.tutorial.client;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class netTutorial extends JFrame{
	
	private String title1 = "Title";
	
	//System.out.printf("%4.3f", VAR); to print out clean decimals

	JFrame frame = new JFrame();
	String title = "Tutorial";
	
	//public Tutorial (Constructor)
	public void gameFrame(){
		
		/*frame.setSize(1000, 700);*/
		setWindowSize(1000, 700);
		/*frame.*/setTitle(title1);
		/*frame.setVisible(true);*/
		isWindowVisible(true);
		/*frame.*/setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void isWindowVisible(boolean value){
		
		setVisible(value);
		return;
		
	}
	
	public void setWindowSize(int width, int height){
		
		setSize(width, height);
		return;
	}
	
	/*public void setTitleName(String title1){
		
		setTitle(title1);
		return;
		
	}*/
	
	public String getTitleName(){
		
		return this.title1;
		
	}

	

}
