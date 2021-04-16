/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.medicaments;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.datasource;

/**
 *
 * @author ACER
 */
public class Medicamentservice {
    private Statement ste ;
    private PreparedStatement pst ;
    private  Connection connection ;
    private ResultSet rs ;
    public Medicamentservice(){
    connection=datasource.getInstance().getcnx();
    }
    public void AjouterMedicaments(medicaments  m){
  String req="insert into  medicaments (nom,description,prix,quantity,img,id_pharmacie) values('"+m.getNom()+"','"+m.getDescription()+"','"+m.getPrix()+"','"+m.getQuantity()+"','"+m.getImg()+"','"+m.getId_pharmacie()+"')";
        try {
            ste= connection.createStatement();
            ste.executeUpdate(req);
            System.out.println("ajouter avec succee");
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //public void AjouterMedicamentsPST(medicaments m){
    //String req="insert into  medicaments (nom,description,prix,quantity,img,id_pharmacie)values(?,?,?,?,?,?)";
       // try {
           // pst=connection.prepareStatement(req);
           // pst.setString(1, m.getNom());
            // pst.setString(2, m.getDescription());
             //pst.setFloat(3, m.getPrix());
              //pst.setInt(4, m.getQuantity());
              //  pst.setString(5, m.getImg());
                //pst.setInt(6, m.getId_pharmacie());
                // pst.executeUpdate();
                    //} catch (SQLException ex) {
           // Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
       // }
    //}
    public List <medicaments> readAll(String nom){
        String req="select* from medicaments WHERE nom='"+nom+"'";
        List <medicaments>List=new ArrayList<>();
        try {
            ste=connection.createStatement();
            rs=ste.executeQuery(req);
            
            while(rs.next()){
                List.add(new medicaments(rs.getInt("id"),rs.getString("nom"),rs.getString("description"),rs.getFloat("prix"),rs.getInt("quantity"),rs.getString("img"),rs.getInt("id_pharmacie")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return List;
    }
    public void UpdateMedicaments(int id, String nom, String description,Float prix, int quantity, String img, int id_pharmacie){
        try{
            String req="Update medicaments SET nom='"+nom+"', description='"+description+"',prix='"+prix+"',quantity='"+quantity+"', img='"+img+"',id_pharmacie='"+id_pharmacie+"' WHERE id="+id ;
            ste=connection.createStatement();
          int  rs=ste.executeUpdate(req);
         
            System.out.println("le medicament a ete modifier avec succee");      
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
       public  void DeleteMedicaments(int id){
           String req="DELETE from medicaments WHERE id="+id;
            try {
            ste=connection.createStatement();
          int  rs=ste.executeUpdate(req);
           
           if (rs>0){
                System.out.println("le médicament a ete supprimer");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
        } 
           
       }
        public void RechercherMedicaments(String nom){
           
            String req="SELECT* FROM medicaments WHERE nom='"+nom+"'";
            try {
            ste=connection.createStatement();
            rs= ste.executeQuery(req);
            rs.last();
            int nbRow= rs.getRow();
            if (nbRow !=0){
          System.out.println("le medicament est trouvé");
            }
            else {
                System.out.println("le medicament non trouvé");
            }
        }catch (SQLException ex) {
            Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        public List<medicaments> TriMed()
      {
       String req="SELECT * FROM medicaments\n" +
           "ORDER BY prix DESC;";
       List<medicaments> list= new ArrayList<>();
        
           try {
               ste=connection.createStatement();
               rs=ste.executeQuery(req);
               while(rs.next()){
                   list.add(new medicaments(rs.getInt("id"),rs.getString("nom"),rs.getString("description"),rs.getFloat("prix"),rs.getInt("quantity"),rs.getString("img"),rs.getInt("id_pharmacie")));
               }
           } catch (SQLException ex) {
               Logger.getLogger(Medicamentservice.class.getName()).log(Level.SEVERE, null, ex);
           } return list;
      }
}
          
   
   
   
       
    

    
    
    
    

       

    

    
    
    
    
    
    
    
    
    
    
    
    




