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
public class panier {
    private int	id ; 
    private int idmed	;
    private String nommed ;
        private Float prixmed;


    
    
    public panier(int id, int idmed, String nommed, Float prixmed) {
        this.id = id;
        this.idmed = idmed;
        this.nommed = nommed;
        this.prixmed = prixmed;
    }

    public panier(int idmed, String nommed, Float prixmed) {
        this.idmed = idmed;
        this.nommed = nommed;
        this.prixmed = prixmed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public String getNommed() {
        return nommed;
    }

    public void setNommed(String nommed) {
        this.nommed = nommed;
    }

    public Float getPrixmed() {
        return prixmed;
    }

    public void setPrixmed(Float prixmed) {
        this.prixmed = prixmed;
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
        final panier other = (panier) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "panier{" + "id=" + id + ", idmed=" + idmed + ", nommed=" + nommed + ", prixmed=" + prixmed + '}';
    }
    
    
}

