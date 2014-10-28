package com.model;

import java.util.Set;

public class Familia {

    private int id_familia;
    private String nom;

    private Set<Subfamilia> subfamilies;

    public Familia() {

    }

    public int getId_familia() {
        return id_familia;
    }

    public void setId_familia(int id_familia) {
        this.id_familia = id_familia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Subfamilia> getSubfamilies() {
        return subfamilies;
    }

    public void setSubfamilies(Set<Subfamilia> subfamilies) {
        this.subfamilies = subfamilies;
    }

}
