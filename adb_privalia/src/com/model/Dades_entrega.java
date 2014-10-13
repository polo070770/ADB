package com.model;

public class Dades_entrega {

    private int id_dades_entrega;
    private String carrer;
    private String ciutat;
    private String comunitat;
    private String codi_postal;
    private String pais;

    private Client client;

    public Dades_entrega() {

    }

    public int getId_dades_entrega() {
        return id_dades_entrega;
    }

    public void setId_dades_entrega(int id_dades_entrega) {
        this.id_dades_entrega = id_dades_entrega;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public String getComunitat() {
        return comunitat;
    }

    public void setComunitat(String comunitat) {
        this.comunitat = comunitat;
    }

    public String getCodi_postal() {
        return codi_postal;
    }

    public void setCodi_postal(String codi_postal) {
        this.codi_postal = codi_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
