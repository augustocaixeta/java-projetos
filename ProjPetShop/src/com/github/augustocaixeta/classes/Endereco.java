package com.github.augustocaixeta.classes;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String CEP;
    private Propietario propietario;

    public Endereco(String rua, int numero, String bairro, String cidade, String CEP, Propietario propietario) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
        this.propietario = propietario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    @Override
    public String toString() {
        return "Rua " + rua
                + ", " + numero
                + ", " + bairro
                + " - " + cidade
                + " (" + CEP
                + ") - Propietario: " + propietario.getNome();
    }
}
