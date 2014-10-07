package com.model;

public class Subfamilia {
    private int id_subfamilia;
    private String nom;
    private Familia familia;
    
    public Subfamilia(){
        
    }

    public int getId_subfamilia() {
        return id_subfamilia;
    }

    public void setId_subfamilia(int id_subfamilia) {
        this.id_subfamilia = id_subfamilia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    
}
