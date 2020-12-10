package sample;


import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;
import javafx.fxml.FXML;


public class Controller{
    @FXML
    private TextField idName;
    @FXML
    public void showCharacter(ActionEvent event)throws IOException{

        Parent choixClassesParent = FXMLLoader.load(getClass().getResource("classesScreen.fxml"));
        Scene classesScene = new Scene(choixClassesParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void quitter()
    {
        System.exit(0);
    }


    public void displayChasseur(ActionEvent event)throws IOException{
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayChasseur.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void displayGuerrier(ActionEvent event)throws IOException{
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayGuerrier.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void displayMage(ActionEvent event)throws IOException{
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayMage.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }

    public void getName(){
        idName.getText();
    }
}
