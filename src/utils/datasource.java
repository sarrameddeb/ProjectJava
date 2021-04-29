/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entite.medicaments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import service.Medicamentservice;

/**
 *
 * @author ACER
 * 
 */
public class datasource {
       private String url="jdbc:mysql://127.0.0.1/based2"; 
    private String login="root"; 
    private String pwd=""; 
    private Connection cnx; 
    private static datasource instance ; 
    

   private datasource(){
        
           try {
               cnx=DriverManager.getConnection(url, login, pwd);
               System.out.println("Connexion etablie");
           } catch (SQLException ex) {
               Logger.getLogger(datasource.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
   
   
   public static datasource getInstance(){
       if (instance==null)
           instance= new datasource();
       return instance ; 
  }
   public  Connection getcnx(){
       return cnx;
   }

  
}
