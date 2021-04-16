/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author ACER
 */
public class medicaments {
    private int id ; 
    private String nom;
    private String description; 
    private float prix ; 
    private int quantity; 
    private String img ;
    private int id_pharmacie;

    public medicaments(int id, String nom, String description, float prix, int quantity, String img,int id_pharmacie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantity = quantity;
        this.img = img;
        this.id_pharmacie = id_pharmacie;
    }
       public medicaments( String nom, String description, float prix, int quantity, String img, int idpharmacie) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantity = quantity;
        this.img = img;
        this.id_pharmacie = id_pharmacie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId_pharmacie() {
        return id_pharmacie;
    }

    public void setIdpharmacie(int id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final medicaments other = (medicaments) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "medicaments{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", quantity=" + quantity + ", img=" + img + ", id_pharmacie=" + id_pharmacie+ '}';
    }
    
}
