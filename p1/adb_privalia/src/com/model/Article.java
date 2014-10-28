package com.model;

import java.util.Set;

public class Article {

    private int id_article;
    private double talla;
    private String color;
    private double preu;

    private Campanya campanya;
    private Producte producte;
    private Subfamilia subfamilia;

    private Set<Linea_factura> linea_factura;

    public Article() {

    }

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public Campanya getCampanya() {
        return campanya;
    }

    public void setCampanya(Campanya campanya) {
        this.campanya = campanya;
    }

    public Subfamilia getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(Subfamilia subfamilia) {
        this.subfamilia = subfamilia;
    }

    public Set<Linea_factura> getLinea_factura() {
        return linea_factura;
    }

    public void setLinea_factura(Set<Linea_factura> linea_factura) {
        this.linea_factura = linea_factura;
    }

}
