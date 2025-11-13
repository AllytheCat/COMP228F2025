package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		BorderPane pane = new BorderPane();
	    // Place nodes in the pane
	    try {
			pane.setTop(new CustomHorizontalTop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    
	    
	    
	    
	    pane.setRight(new CustomPane("Right"));
	    pane.setBottom(new CustomPane("Date: " + java.time.LocalDate.now()));
	    pane.setLeft(new CustomPane("Left"));
	    
	    GridPane form = new GridPane(); //center form
        form.setPadding(new Insets(20));
        form.setHgap(10);
        form.setVgap(10);
        
	    pane.setCenter(form); // show the employment form

	    /*
	     *  pane.setCenter(Embed the code for the Grid pane - employment form.   );
	     */
	   
        
      //form fields
        TextField firstName = new TextField();
        TextField lastName = new TextField();
        TextField email = new TextField();
        TextField website = new TextField();
        TextField position = new TextField();
        TextField salary = new TextField();
        DatePicker startDate = new DatePicker();
        TextField phone = new TextField();
        TextField fax = new TextField();
        TextField lastCompany = new TextField();
        TextArea comments = new TextArea();
        
      //relocation options
        ToggleGroup relocateGroup = new ToggleGroup();
        RadioButton relocateYes = new RadioButton("Yes");
        RadioButton relocateNo = new RadioButton("No");
        RadioButton relocateUnsure = new RadioButton("Not sure");
        relocateYes.setToggleGroup(relocateGroup);
        relocateNo.setToggleGroup(relocateGroup);
        relocateUnsure.setToggleGroup(relocateGroup);
	    
      //add fields to grid
        form.add(new Label("First Name *"), 0, 0); form.add(firstName, 1, 0);
        form.add(new Label("Last Name *"), 0, 1); form.add(lastName, 1, 1);
        form.add(new Label("Email *"), 0, 2); form.add(email, 1, 2);
        form.add(new Label("Portfolio Website"), 0, 3); form.add(website, 1, 3);
        form.add(new Label("Position you are applying for *"), 0, 4); form.add(position, 1, 4);
        form.add(new Label("Salary Requirements"), 0, 5); form.add(salary, 1, 5);
        form.add(new Label("When can you start?"), 0, 6); form.add(startDate, 1, 6);
        form.add(new Label("Phone *"), 0, 7); form.add(phone, 1, 7);
        form.add(new Label("Fax"), 0, 8); form.add(fax, 1, 8);
        form.add(new Label("Are you willing to relocate?"), 0, 9);
        HBox relocateBox = new HBox(10, relocateYes, relocateNo, relocateUnsure);
        form.add(relocateBox, 1, 9);
        form.add(new Label("Last company you worked for"), 0, 10); form.add(lastCompany, 1, 10);
        form.add(new Label("Reference / Comments / Questions"), 0, 11); form.add(comments, 1, 11);

        //submit button
        Button submit = new Button("Send Application");
        submit.setOnAction(e -> System.out.println("Application Sent")); //console message
        form.add(submit, 1, 12);

	    
	 // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("ShowBorderPane"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage

	    
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
