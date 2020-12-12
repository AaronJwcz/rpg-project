package sample;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.fxml.FXML;


public class Controller{
    @FXML private Label j1_pv;
    @FXML private Label j1_mana;
    @FXML private Label j2_pv;
    @FXML private Label j2_mana;
    @FXML private ImageView j1_img;
    @FXML private ImageView j2_img;
    @FXML private Personnage j1;
    @FXML private TextField idName;
    @FXML public void showCharacter(ActionEvent event)throws IOException{
        Parent choixClassesParent = FXMLLoader.load(getClass().getResource("classesScreen.fxml"));
        Scene classesScene = new Scene(choixClassesParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    @FXML public void quitter()
    {
        System.exit(0);
    }


    @FXML public void displayChasseur(ActionEvent event)throws IOException{
        j1 = new Chasseur();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayChasseur.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    @FXML public void displayGuerrier(ActionEvent event)throws IOException{
        j1 = new Guerrier();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayGuerrier.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    @FXML public void displayMage(ActionEvent event)throws IOException{
        j1 = new Mage();
        System.out.println(idName.getText());
        Parent affichagePersonnage = FXMLLoader.load(getClass().getResource("displayMage.fxml"));
        Scene classesScene = new Scene(affichagePersonnage);
        Stage window=(Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(classesScene);
        window.show();
    }
    @FXML public void lancerPartie(ActionEvent event) throws IOException {
        Parent partie = FXMLLoader.load(getClass().getResource("displayPartie.fxml"));
        Scene combat = new Scene(partie);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(combat);
        window.show();
        Partie p = new Partie(j1);
        if(j1 instanceof Guerrier)
        {
            j1_img = new ImageView("/ressources/imgguerrier.png");
        }
        else if(j1 instanceof Chasseur)
        {
            j1_img = new ImageView("/ressources/imgchasseur.png");
        }
        else
        {
            j1_img = new ImageView("/ressources/imgmage.png");
        }
    }

    @FXML public TextField getName(){
        return idName;
    }
}
