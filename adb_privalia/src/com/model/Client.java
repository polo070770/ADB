package com.model;

import java.util.Set;

public class Client {

    private String email;
    private String nom;
    private String cognom;
    private String telefon;

    private float import_total;

    private Set<Dades_entrega> dades_entrega;
    private Set<Linea_factura> linea_factura;

    public Client() {

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

    public Set<Dades_entrega> getDades_entrega() {
        return dades_entrega;
    }

    public void setDades_entrega(Set<Dades_entrega> dades_entrega) {
        this.dades_entrega = dades_entrega;
    }

    public Set<Linea_factura> getLinea_factura() {
        return linea_factura;
    }

    public void setLinea_factura(Set<Linea_factura> linea_factura) {
        this.linea_factura = linea_factura;
    }

}
