package com.company;

public class Cliente {
    private String nomec;
    private String sobrenomec;
    private String dataNascimentoc;
    private String telefonec;
    private String cpfc;
    private String cidadec;
    private String estadoc;
    private String paisc;
    private String enderecoc;
    private String numeroc;
    private String dataCadastroc;

    public Cliente(String nome, String sobrenome, String dataNascimento, String telefone, String cpf, String cidade,
                   String estado, String pais, String endereco, String numero, String dataCadastro) {
        this.nomec = nome;
        this.sobrenomec = sobrenome;
        this.dataNascimentoc = dataNascimento;
        this.telefonec = telefone;
        this.cpfc = cpf;
        this.cidadec = cidade;
        this.estadoc = estado;
        this.paisc = pais;
        this.enderecoc = endereco;
        this.numeroc = numero;
        this.dataCadastroc = dataCadastro;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public String getSobrenomec() {
        return sobrenomec;
    }

    public void setSobrenomec(String sobrenomec) {
        this.sobrenomec = sobrenomec;
    }

    public String getDataNascimentoc() {
        return dataNascimentoc;
    }

    public void setDataNascimentoc(String dataNascimentoc) {
        this.dataNascimentoc = dataNascimentoc;
    }

    public String getTelefonec() {
        return telefonec;
    }

    public void setTelefonec(String telefonec) {
        this.telefonec = telefonec;
    }

    public String getCpfc() {
        return cpfc;
    }

    public void setCpfc(String cpfc) {
        this.cpfc = cpfc;
    }

    public String getCidadec() {
        return cidadec;
    }

    public void setCidadec(String cidadec) {
        this.cidadec = cidadec;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public String getPaisc() {
        return paisc;
    }

    public void setPaisc(String paisc) {
        this.paisc = paisc;
    }

    public String getEnderecoc() {
        return enderecoc;
    }

    public void setEnderecoc(String enderecoc) {
        this.enderecoc = enderecoc;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public String getDataCadastroc() {
        return dataCadastroc;
    }

    public void setDataCadastroc(String dataCadastroc) {
        this.dataCadastroc = dataCadastroc;
    }
}
