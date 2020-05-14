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

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;


public class FXMLDocumentController implements Initializable 
{
    ObservableList movieList = FXCollections.observableArrayList();
    
    @FXML
    private ListView<?> movieListBox;
    @FXML
    private Label directorLabel;
    @FXML
    private Label releaseYearLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
      addMovies();
    } 
    
    private void addMovies()
    {
        String movie1 = "Gone with the Wind";
        String movie2 = "Casablanca";
        String movie3 = "Citizen Kane";
        String movie4 = "Some Like it Hot";
        String movie5 = "Psycho";
        String movie6 = "The Godfather";
        movieList.addAll(movie1, movie2, movie3, movie4, movie5, movie6);
        movieListBox.getItems().addAll(movieList);
    }

    @FXML
    private void displayInfo(MouseEvent event) 
    {
        String movie = (String) movieListBox.getSelectionModel().getSelectedItem();
        
        switch (movie) {
            case "Gone with the Wind":
                directorLabel.setText("Victor Fleming");
                releaseYearLabel.setText("1939");
                break;
            case "Casablanca":
                directorLabel.setText("Michael Curtiz");
                releaseYearLabel.setText("1942");
                break;
            case "Citizen Kane":
                directorLabel.setText("Orsen Welles");
                releaseYearLabel.setText("1941");
                break;
            case "Some Like it Hot":
                directorLabel.setText("Billy Wilder");
                releaseYearLabel.setText("1959");
                break;
            case "Psycho":
                directorLabel.setText("Alfred Hitchcock");
                releaseYearLabel.setText("1960");
                break;
            case "The Godfather":
                directorLabel.setText("Francis Ford Coppola");
                releaseYearLabel.setText("1972");
                break;
            default:
                break;    
        }

    }

    
}
