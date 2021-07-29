/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Corine
 */
public class Panneau {
    int numPanneau;
    String panneau;
    String typePanneau;
    String dim;
    String sitePanneau;
    String ville;
//    Double PU;
    String dureeLocation;

    public Panneau() {
    }

    public Panneau(int numPanneau, String nomPanneau, String typePanneau, String dim, String sitePanneau, String ville, String date) {
        this.numPanneau = numPanneau;
        this.panneau = nomPanneau;
        this.typePanneau = typePanneau;
        this.dim = dim;
        this.sitePanneau = sitePanneau;
        this.ville = ville;
//        this.PU = PU;
        this.dureeLocation = date;
    }

    public int getNumPanneau() {
        return numPanneau;
    }

    public String getNomPanneau() {
        return panneau;
    }

    public String getTypePanneau() {
        return typePanneau;
    }

    public String getDim() {
        return dim;
    }

    public String getSitePanneau() {
        return sitePanneau;
    }

    public String getVille() {
        return ville;
    }

//    public Double getPU() {
//        return PU;
//    }

    public String getDateLocation() {
        return dureeLocation;
    }

    public void setNumPanneau(int numPanneau) {
        this.numPanneau = numPanneau;
    }

    public void setNomPanneau(String nomPanneau) {
        this.panneau = nomPanneau;
    }

    public void setTypePanneau(String typePanneau) {
        this.typePanneau = typePanneau;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public void setSitePanneau(String sitePanneau) {
        this.sitePanneau = sitePanneau;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

//    public void setPU(Double PU) {
//        this.PU = PU;
//    }

    public void setDateLocation(String date) {
        this.dureeLocation = date;
    }
    
    
}
