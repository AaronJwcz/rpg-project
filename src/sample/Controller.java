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
    private Personnage j1;
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
        j1 = new Chasseur();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayChasseur.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void displayGuerrier(ActionEvent event)throws IOException{
        j1 = new Guerrier();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayGuerrier.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void displayMage(ActionEvent event)throws IOException{
        j1 = new Mage();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayMage.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    public void charger_personnage(){}
    public void lancerPartie(ActionEvent event) throws IOException {
        Parent partie = FXMLLoader.load(getClass().getResource("displayPartie.fxml"));
        Scene combat = new Scene(partie);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(combat);
        window.show();
        Partie p = new Partie(j1);
    }

    public TextField getName(){
        return idName;
    }
}
