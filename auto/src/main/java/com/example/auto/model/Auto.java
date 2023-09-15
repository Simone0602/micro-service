package com.example.auto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Auto {

    @Id
    private Long id;
    private String marca;
    private String modello;
    private String targa;
    private Long proprietario_id;

    public Auto(Long id, String marca, String modello, String targa, Long proprietario_id) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.proprietario_id = proprietario_id;
    }

    public Auto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public Long getProprietario_id() {
        return proprietario_id;
    }

    public void setProprietario_id(Long proprietario_id) {
        this.proprietario_id = proprietario_id;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", proprietario_id=" + proprietario_id +
                '}';
    }
}
