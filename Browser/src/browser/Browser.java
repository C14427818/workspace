package browser;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;



public class Browser extends JFrame{

	private TextField field = new TextField();
	private JEditorPane display = new JEditorPane();
	private JScrollPane scroll = new JScrollPane(display);

	public static void main(String args[]){

		Browser file = new Browser();
		file.frameHandler();
	}

	private void frameHandler() {
		setTitle("Search Engine");
		setSize(1280, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		addComponentsToFrame(getContentPane());

	}

	public void addComponentsToFrame(Container pane){

		Insets insets = getInsets();//location of edges of frame

		pane.add(field);
		pane.add(scroll);

		Font font = new Font("Menlo", Font.ITALIC, 12);
		field.setFont(font);

		field.setBounds(8 - insets.left, 30 - insets.top, 1268, 20);
		scroll.setBounds(8 - insets.left, 52 - insets.top, 1268, 830);

		actionListenerCalls();

	}


	private void actionListenerCalls(){

		field.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				loadData("http://" + e.getActionCommand());
			}
		});

		display.addHyperlinkListener(new HyperlinkListener() {

			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {

				if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){

					loadData(e.getURL().toString());
				}

			}
		});



	}

	private void loadData(String text){

		try{

			display.setPage(text);
			display.setPage(text);

		}catch(Exception e){

			System.out.println("Nope");
		}
	}


	/**
	* Default empty Browser constructor
	*/
	public Browser() {
		super();
	}

	/**
	* Default Browser constructor
	*/
	public Browser(TextField field, JEditorPane display, JScrollPane scroll, void addComponentsToFrame, void actionListenerCalls, void actionPerformed, void loadData) {
		super();
		this.field = field;
		this.display = display;
		this.scroll = scroll;
		this.addComponentsToFrame = addComponentsToFrame;
		this.actionListenerCalls = actionListenerCalls;
		this.actionPerformed = actionPerformed;
		this.loadData = loadData;
	}

	/**
	* Returns value of field
	* @return
	*/
	public TextField getField() {
		return field;
	}

	/**
	* Sets new value of field
	* @param
	*/
	public void setField(TextField field) {
		this.field = field;
	}

	/**
	* Returns value of display
	* @return
	*/
	public JEditorPane getDisplay() {
		return display;
	}

	/**
	* Sets new value of display
	* @param
	*/
	public void setDisplay(JEditorPane display) {
		this.display = display;
	}

	/**
	* Returns value of scroll
	* @return
	*/
	public JScrollPane getScroll() {
		return scroll;
	}

	/**
	* Sets new value of scroll
	* @param
	*/
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	/**
	* Returns value of main
	* @return
	*/
	public static void getMain() {
		return main;
	}

	/**
	* Sets new value of main
	* @param
	*/
	public static void setMain(void main) {
		Browser.main = main;
	}

	/**
	* Returns value of addComponentsToFrame
	* @return
	*/
	public void getAddComponentsToFrame() {
		return addComponentsToFrame;
	}

	/**
	* Sets new value of addComponentsToFrame
	* @param
	*/
	public void setAddComponentsToFrame(void addComponentsToFrame) {
		this.addComponentsToFrame = addComponentsToFrame;
	}

	/**
	* Returns value of actionListenerCalls
	* @return
	*/
	public void getActionListenerCalls() {
		return actionListenerCalls;
	}

	/**
	* Sets new value of actionListenerCalls
	* @param
	*/
	public void setActionListenerCalls(void actionListenerCalls) {
		this.actionListenerCalls = actionListenerCalls;
	}

	/**
	* Returns value of actionPerformed
	* @return
	*/
	public void getActionPerformed() {
		return actionPerformed;
	}

	/**
	* Sets new value of actionPerformed
	* @param
	*/
	public void setActionPerformed(void actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	/**
	* Returns value of loadData
	* @return
	*/
	public void getLoadData() {
		return loadData;
	}

	/**
	* Sets new value of loadData
	* @param
	*/
	public void setLoadData(void loadData) {
		this.loadData = loadData;
	}

	/**
	* Create string representation of Browser for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Browser [field=" + field + ", display=" + display + ", scroll=" + scroll + ", addComponentsToFrame=" + addComponentsToFrame + ", actionListenerCalls=" + actionListenerCalls + ", actionPerformed=" + actionPerformed + ", loadData=" + loadData + "]";
	}

	public static class Builder {
		 private static TextField field;
		 private static JEditorPane display;
		 private static JScrollPane scroll;
		 private static void addComponentsToFrame;
		 private static void actionListenerCalls;
		 private static void actionPerformed;
		 private static void loadData;

		 public static Builder field(TextField field) {
			 this.field = field;
			 return this;
		}

		 public static Builder display(JEditorPane display) {
			 this.display = display;
			 return this;
		}

		 public static Builder scroll(JScrollPane scroll) {
			 this.scroll = scroll;
			 return this;
		}

		 public static Builder addComponentsToFrame(void addComponentsToFrame) {
			 this.addComponentsToFrame = addComponentsToFrame;
			 return this;
		}

		 public static Builder actionListenerCalls(void actionListenerCalls) {
			 this.actionListenerCalls = actionListenerCalls;
			 return this;
		}

		 public static Builder actionPerformed(void actionPerformed) {
			 this.actionPerformed = actionPerformed;
			 return this;
		}

		 public static Builder loadData(void loadData) {
			 this.loadData = loadData;
			 return this;
		}

		public Browser create() {

		}
	}

	/**
	* Returns value of field
	* @return
	*/
	public TextField getField() {
		return field;
	}

	/**
	* Sets new value of field
	* @param
	*/
	public void setField(TextField field) {
		this.field = field;
	}

	/**
	* Returns value of display
	* @return
	*/
	public JEditorPane getDisplay() {
		return display;
	}

	/**
	* Sets new value of display
	* @param
	*/
	public void setDisplay(JEditorPane display) {
		this.display = display;
	}

	/**
	* Returns value of scroll
	* @return
	*/
	public JScrollPane getScroll() {
		return scroll;
	}

	/**
	* Sets new value of scroll
	* @param
	*/
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	/**
	* Returns value of main
	* @return
	*/
	public static void getMain() {
		return main;
	}

	/**
	* Sets new value of main
	* @param
	*/
	public static void setMain(void main) {
		Browser.main = main;
	}

	/**
	* Returns value of addComponentsToFrame
	* @return
	*/
	public void getAddComponentsToFrame() {
		return addComponentsToFrame;
	}

	/**
	* Sets new value of addComponentsToFrame
	* @param
	*/
	public void setAddComponentsToFrame(void addComponentsToFrame) {
		this.addComponentsToFrame = addComponentsToFrame;
	}

	/**
	* Returns value of actionListenerCalls
	* @return
	*/
	public void getActionListenerCalls() {
		return actionListenerCalls;
	}

	/**
	* Sets new value of actionListenerCalls
	* @param
	*/
	public void setActionListenerCalls(void actionListenerCalls) {
		this.actionListenerCalls = actionListenerCalls;
	}

	/**
	* Returns value of actionPerformed
	* @return
	*/
	public void getActionPerformed() {
		return actionPerformed;
	}

	/**
	* Sets new value of actionPerformed
	* @param
	*/
	public void setActionPerformed(void actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	/**
	* Returns value of loadData
	* @return
	*/
	public void getLoadData() {
		return loadData;
	}

	/**
	* Sets new value of loadData
	* @param
	*/
	public void setLoadData(void loadData) {
		this.loadData = loadData;
	}

	/**
	* Returns value of field
	* @return
	*/
	public static TextField getField() {
		return field;
	}

	/**
	* Sets new value of field
	* @param
	*/
	public static void setField(TextField field) {
		Browser.field = field;
	}

	/**
	* Returns value of display
	* @return
	*/
	public static JEditorPane getDisplay() {
		return display;
	}

	/**
	* Sets new value of display
	* @param
	*/
	public static void setDisplay(JEditorPane display) {
		Browser.display = display;
	}

	/**
	* Returns value of scroll
	* @return
	*/
	public static JScrollPane getScroll() {
		return scroll;
	}

	/**
	* Sets new value of scroll
	* @param
	*/
	public static void setScroll(JScrollPane scroll) {
		Browser.scroll = scroll;
	}

	/**
	* Returns value of addComponentsToFrame
	* @return
	*/
	public static void getAddComponentsToFrame() {
		return addComponentsToFrame;
	}

	/**
	* Sets new value of addComponentsToFrame
	* @param
	*/
	public static void setAddComponentsToFrame(void addComponentsToFrame) {
		Browser.addComponentsToFrame = addComponentsToFrame;
	}

	/**
	* Returns value of actionListenerCalls
	* @return
	*/
	public static void getActionListenerCalls() {
		return actionListenerCalls;
	}

	/**
	* Sets new value of actionListenerCalls
	* @param
	*/
	public static void setActionListenerCalls(void actionListenerCalls) {
		Browser.actionListenerCalls = actionListenerCalls;
	}

	/**
	* Returns value of actionPerformed
	* @return
	*/
	public static void getActionPerformed() {
		return actionPerformed;
	}

	/**
	* Sets new value of actionPerformed
	* @param
	*/
	public static void setActionPerformed(void actionPerformed) {
		Browser.actionPerformed = actionPerformed;
	}

	/**
	* Returns value of loadData
	* @return
	*/
	public static void getLoadData() {
		return loadData;
	}

	/**
	* Sets new value of loadData
	* @param
	*/
	public static void setLoadData(void loadData) {
		Browser.loadData = loadData;
	}
}//end class
