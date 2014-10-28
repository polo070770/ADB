package com.model;

import java.util.Date;
import java.util.Set;

public class Campanya {

    private int id_campanya;
    private String nom_campanya;
    private String marca;
    private int num_articles;
    private float total_facturat;
    private Date data_inici;
    private Date data_fi;

    private Set<Article> articles;

    public Campanya() {

    }

    public int getId_campanya() {
        return id_campanya;
    }

    public void setId_campanya(int id_campanya) {
        this.id_campanya = id_campanya;
    }

    public String getNom() {
        return nom_campanya;
    }

    public void setNom(String nom_campanya) {
        this.nom_campanya = nom_campanya;
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

    public float getTotal_facturat() {
        return total_facturat;
    }

    public void setTotal_facturat(float total_facturat) {
        this.total_facturat = total_facturat;
    }

    public Date getData_inici() {
        return data_inici;
    }

    public void setData_inici(Date data_inici) {
        this.data_inici = data_inici;
    }

    public Date getData_fi() {
        return data_fi;
    }

    public void setData_fi(Date data_fi) {
        this.data_fi = data_fi;
    }

    public String getNom_campanya() {
        return nom_campanya;
    }

    public void setNom_campanya(String nom_campanya) {
        this.nom_campanya = nom_campanya;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

}
