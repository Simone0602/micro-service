package com.example.proprietario.dto;

import java.util.ArrayList;
import java.util.List;

public class ProprietarioDto {

    private Long id;
    private String nome;
    private String cognome;
    private int eta;
    private List<AutoDto> auto = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public List<AutoDto> getAuto() {
        return auto;
    }

    public void setAuto(List<AutoDto> auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "ProprietarioDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", auto=" + auto +
                '}';
    }
}
