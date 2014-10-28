package com.model;

import java.util.Set;

public class Subfamilia {

    private int id_subfamilia;
    private String nom;

    private Familia familia;

    private Set<Article> articles;

    public Subfamilia() {

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

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

}
