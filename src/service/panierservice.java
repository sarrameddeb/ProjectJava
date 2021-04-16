/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.panier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.datasource;

/**
 *
 * @author ACER
 */
public class panierservice {
    private Statement ste ; 
    private Connection connection ; 
    private ResultSet rs ; 
    public panierservice(){
    connection= datasource.getInstance().getcnx();}
    
    
    public void ajoutpanier(panier p) {
   String req="insert into panier (id,idmed,nommed,prixmed) values(id='"+p.getId()+"',idmed='"+p.getIdmed()+"',nommed='"+p.getNommed()+"',prixmed='"+p.getPrixmed()+"')";
        try {
            ste= connection.createStatement();
             ste.executeUpdate(req);
             System.out.println("panier remplis");
    
        } catch (SQLException ex) {
            Logger.getLogger(panierservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public List<panier> showpanier(){
        String requete="select* from panier";
          List <panier>List=new ArrayList<>();
      try {ste=connection.createStatement();
           ste.executeQuery(requete);
         
           while(rs.next()){
           List.add(new panier(rs.getInt("id"),rs.getInt("idmed"),rs.getString("nommed"),rs.getFloat("prixmed") ));
          }     
        } catch (SQLException ex) {
            Logger.getLogger(panierservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return List;
}
      
     public void deletepanier(int id){
    String requete="delete from panier WHERE id='"+id+"'";
        try {
            ste=connection.createStatement();
              ste.executeUpdate(requete);
              System.out.println("medicaùent supprimer du panier");
        } catch (SQLException ex) {
            Logger.getLogger(panierservice.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
       public void updatePanier() {
       try {
            String requete = "UPDATE panier SET nommed='aspique',prixmed='8.0' WHERE id=1";
            PreparedStatement pst = connection.prepareStatement(requete);
            pst.executeUpdate();
            System.out.println("Panier modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public void calcultotalpanier(int id ){
           String  req="Select ('prixmed'+('prixmed'*0.19)))* 'quantity' from panier WHERE id='"+id+"'";
        try {
            ste= connection.createStatement();
            ste.executeQuery(req); {
            while(rs.next());
          System.out.println(rs.getFloat("(prixmed`+(prixmed`*0.19))*quantity"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(panierservice.class.getName()).log(Level.SEVERE, null, ex);
        }  
            
        }
        
        

}
