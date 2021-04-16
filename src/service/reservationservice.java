/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.reservation_med;
import java.sql.Connection;
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
public class reservationservice {
    private Statement ste ; 
    private Connection connection ; 
    private ResultSet rs ; 
    public reservationservice() {
      connection=datasource.getInstance().getcnx();
}
    public void ajoutreservation(reservation_med r){
    String requete="insert into reservation_med (id_med,nom_med,id_patient,id_phar)values(id_med='"+r.getId_med()+"',nom_med='"+r.getNom_med()+"',id_patient='"+
            r.getId_patient()+"',id_phar='"+r.getId_phar()+"')";
        try {
            ste=connection.createStatement();
            ste.executeUpdate(requete);
            System.out.println("reservation ajoutee");
        } catch (SQLException ex) {
            Logger.getLogger(reservationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteresrvation(int id){
    String requete="delete from reservation_med WHERE id='"+id+"'";
        try {
            ste=connection.createStatement();
           int rs= ste.executeUpdate(requete);
           if(rs>0){
               System.out.println("resrvationsupprimer");
           }
        } catch (SQLException ex) {
            Logger.getLogger(reservationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public List<reservation_med> affiche(){
        String requete="select* from reservation_med";
          List <reservation_med >List=new ArrayList<>();
        try {
            ste=connection.createStatement();
            ste.executeQuery(requete);
              while(rs.next()){
           List.add(new reservation_med(rs.getInt("id"),rs.getString("id_med"),rs.getString("nom_med"),rs.getString("id_patient"),rs.getString("id_phar")));
              }
        } catch (SQLException ex) {
            Logger.getLogger(reservationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return List;
        }
        
   
    
           public void ModifierReservaton(int id,String id_med, String nom_med,  String id_patient,  String  id_phar){
           
            String requete="Update reservation_med SET nom_med='"+nom_med
                    +"' where id="+id ;
        try {
             ste=connection.createStatement();
            int rs=ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(reservationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
         
            System.out.println("reservation modifier avec succee");      
       
           }
           
          
           
           public void Rechercherresrvation(String nom_med){
           
            String req="SELECT* FROM reservation_med WHERE id='"+nom_med+"'";
            try {
            ste=connection.createStatement();
            rs= ste.executeQuery(req);
           
              rs.last();
            int nbRow= rs.getRow();
            if (nbRow !=0){
          System.out.println("reservationt est trouvé");
            }
            else {
                System.out.println("reservation non trouvé");
      
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(reservationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
           }

    

   
}       
          
          
          
        




        
        
        
    
    
    
    
    
    
   

