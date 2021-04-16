/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahti;


import entite.medicaments;
import entite.panier;

import entite.reservation_med;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import service.Medicamentservice;
import service.panierservice;
import service.reservationservice;


import utils.datasource;

/**
 *
 * @author ACER
 */
public class Sahti extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //datasource ds1= new datasource();
        //datasource ds1= datasource.getInstance();
        //datasource ds2= datasource.getInstance();
        //datasource ds3= datasource.getInstance();
   medicaments m1= new medicaments("clamoxyle","llll",3.0f,88,"mm",88);
   Medicamentservice ms =new Medicamentservice();
    
    //ms.AjouterMedicaments(m1);
   //ms.AjouterMedicaments(m2);",2,8,"mm",8);
     medicaments m2= new medicaments("doliprane","maux de tete ",2.0f, 88,"mmm",22);
     medicaments m3= new medicaments("hhhh","llll",2,8,"mm",8);
     medicaments m4= new medicaments("panadol","mmm",3.8f,1,"lll",1);
    //ms.AjouterMedicaments(m2);
     //ms.AjouterMedicaments(m4);
   //ms.AjouterMedicamentsPST(m4);
  //ms.readAll("doliprane").forEach(e->System.out.println(e));
   //ms.UpdateMedicaments(1,"mmm", "888",5.4f, 800, "jjjjj",8 );
   //ms.DeleteMedicaments(1);
   //ms.RechercherMedicaments("jhh");
   
   
    reservation_med r = new reservation_med(4,"2","doliprane","1","7");
    reservationservice rs = new reservationservice();
     //rs.ajoutreservation(r);
    //rs.deleteresrvation(1);

 // *****rs.affiche().forEach(e->System.out.println(e));
    //rs.ModifierReservaton(2, "doliprane", "maxiii", "8" ,"1");
   // rs.Rechercherresrvation("doliprane");
   
panier ps = new panier(2,"doliprane",8.0f);
 panierservice p =new panierservice();
 //p.ajoutpanier(ps);
  //p.deletepanier(1);
//**** p.showpanier().forEach(e->System.out.println(e));
  // p.updatePanier();
  
 //ms.TriMed().forEach(e->System.out.println(e));
 
 
  p.calcultotalpanier(2);
  
  
  
    }
    }
 

        
        
        
        
  
  

