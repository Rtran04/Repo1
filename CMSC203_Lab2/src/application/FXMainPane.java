package application;



import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	VBox vbox1 = new VBox();
	Button but1;
	Button but2;
	Button but3;
	Button but4;
	Button but5;
	Label label1;
	TextField tField1;
	
	//  declare two HBoxes
	HBox hbox1;
	HBox hbox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager manager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		but1 = new Button("Hello");
		but2 = new Button("Howdy");
		but3 = new Button("Chinese");
		but4 = new Button("Clear");
		but5 = new Button("Exit");
		label1 = new Label("Feedback");
		tField1 = new TextField();
		//  instantiate the HBoxes
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		manager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(but1, getInsets());
		hbox1.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hbox2.getChildren().addAll(label1, tField1);
		//  add the buttons to the other HBox
		hbox1.getChildren().addAll(but1, but2, but3, but4, but5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hbox1, hbox2);
		
		but1.setOnAction(new ButtonHandler());
		but2.setOnAction(new ButtonHandler());
		but3.setOnAction(new ButtonHandler());
		but4.setOnAction(new ButtonHandler());
		but5.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			String response;
			Object source = event.getSource();
			
			if (source == but1) {
				response = manager.getHello();
				tField1.setText(response);
			} else if (source == but2) {
				response = manager.getHowdy();
				tField1.setText(response);
			} else if (source == but3) {
				response = manager.getChinese();
				tField1.setText(response);
			} else if (source == but4) {
				tField1.setText(" ");
			} else if (source == but5) {
				Platform.exit();
				System.exit(0);
			}
			
		}
	
	}
	
}
	
