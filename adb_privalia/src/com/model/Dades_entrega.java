package com.model;

public class Dades_entrega {

    private String carrer;
    private String poblacio;
    private String provincia;
    private String codi_postal;
    private String pais;

    private Client client;

    public Dades_entrega() {

    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
