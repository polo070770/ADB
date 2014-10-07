package com.model;

/**
 *
 * @author maikel
 */
public class Client {
    private String email;
    private String nom;
    private String cognom;
    private String telefon;
    private float import_total;
    
    public Client(){
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public float getImport_total() {
        return import_total;
    }

    public void setImport_total(float import_total) {
        this.import_total = import_total;
    }
    
}
