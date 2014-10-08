package com.model;

public abstract class Producte {

    private int id_producte;
    private String nom;
    private String marca;
    private int num_articles;

    public Producte() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNum_articles() {
        return num_articles;
    }

    public void setNum_articles(int num_articles) {
        this.num_articles = num_articles;
    }

    public int getId() {
        return id_producte;
    }

    public void setId(int id) {
        this.id_producte = id;
    }

}
