package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.swing.text.html.parser.Entity;


@Table(name="ECHEANCES")
public class Echeances {
    
    @Column(name="assurance")
    private Assurance assurance;
    
    @Column(name="prix")
    private double prix;
    
    @Column(name="dateEcheance")
    private Date dateEcheance;
    
    @Column(name="dateFacture")
    private Date dateFacture;
    
    private List<Echeances> ech = new ArrayList<>();
    
    public void imprimeEcheance(){
    
        System.out.println("Les six suivantes echeances seront :");
    
    }

    /**
     * @return the assurance
     */
    public Assurance getAssurance() {
        return assurance;
    }

    /**
     * @param assurance the assurance to set
     */
    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the dateEcheance
     */
    public Date getDateEcheance() {
        return dateEcheance;
    }

    /**
     * @param dateEcheance the dateEcheance to set
     */
    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    /**
     * @return the dateFacture
     */
    public Date getDateFacture() {
        return dateFacture;
    }

    /**
     * @param dateFacture the dateFacture to set
     */
    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
