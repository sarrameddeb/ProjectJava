/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahti;


import entite.medicaments;
import entite.panier;

import entite.reservation_med;
import java.io.IOException;
import java.sql.SQLException;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
   private Stage primaryStage ;
   private Parent parentPage ; 
   

    @Override
    public void start(Stage primaryStage) throws IOException {
       this.primaryStage= primaryStage;
       this.primaryStage.setTitle("Acceuil");
 
        parentPage= FXMLLoader.load(getClass().getResource("/views/Acceuilview.fxml"));
         Scene scene = new Scene(parentPage);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
                }
          

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        launch(args);
        //datasource ds1= new datasource();
        //datasource ds1= datasource.getInstance();
        //datasource ds2= datasource.getInstance();
        //datasource ds3= datasource.getInstance();
   medicaments m1= new medicaments("clamoxyle","llll",3.0f,88,"mm","88");
   Medicamentservice ms =new Medicamentservice();

    //ms.AjouterMedicaments(m1);
   //ms.AjouterMedicaments(m2);",2,8,"mm",8);
     medicaments m2= new medicaments("Pétadine","babba ",2.0f, 88,"mmm","1234");
     medicaments m3= new medicaments("hhhh","llll",2,8, "mm" ,"8");
     medicaments m4= new medicaments("panadol","mmm",3.8f,1,"lll","1");
     //ms.AjouterMedicaments(m2);
     //ms.AjouterMedicaments(m4);
  // ms.AjouterMedicamentsPST(m2);
  //ms.readAll().forEach(e->System.out.println(e));
   //ms.UpdateMedicaments(15,"CYCLADOLE", "888",5.4f, 800, "jjjjj",8 );
   //ms.DeleteMedicaments(8);
   //ms.RechercherMedicaments("doliprane");
  // ms.TriMed().forEach(e->System.out.println(e));
   
    //reservation_med r = new reservation_med("2","doliprane","1","7");
    
    reservation_med r1 = new reservation_med("1234","maxilase","2","3");
    reservationservice rs = new reservationservice();
     //rs.ajoutreservation(r1);
    //rs.deleteresrvation(1);

  //rs.affiche("2").forEach(e->System.out.println(e));
    //rs.ModifierReservaton(1, "doliprane2" );
   // rs.Rechercherresrvation("doliprane");
   
panier ps = new panier(2,"doliprane",10.0f,"2");
panier ps1 = new panier(123,"Maxilase",8.0f,"2");


 panierservice p =new panierservice();
 // p.ajoutpanier(ps,3);
  //p.ajoutpanier(ps1,1);
   //p.deletepanier(1);
 //p.showpanier(20).forEach(e->System.out.println(e));
  //p.updatePanier(3,"sarar");
  //p.calcultotalpanier(20);
  
  
  
    }
    }
 

        
        
        
        
  
  

