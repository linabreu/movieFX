/*
Lina Breunlin
Module 7 Programming Assignment
This program allows the user to click a movie title in a list box and then display the director and release date in a label down below

When I was working on this project I referenced a youtube video on creating list boxes at
youtube.com/watch?v=gvBGu3mw7YU
And oracle docs at
https://docs.oracle.com/javase/8/javafx/api/javafx/collections/ObservableList.html
 */
package moviesfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author linab
 */
public class MoviesFX extends Application 
{
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
