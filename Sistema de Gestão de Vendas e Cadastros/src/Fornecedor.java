package com.company;

public class Fornecedor {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefonef;
    private String cidadef;
    private String estadof;
    private String paisf;
    private String enderecof;
    private String numerof;
    private String dataCadastrof;

    public Fornecedor(String nomeFantasia, String razaoSocial, String cnpj, String email, String telefone, String cidade,
                    String estado, String pais, String endereco, String numero, String dataCadastro){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
        this.telefonef = telefone;
        this.cidadef = cidade;
        this.estadof = estado;
        this.paisf = pais;
        this.enderecof = endereco;
        this.numerof = numero;
        this.dataCadastrof = dataCadastro;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonef() {
        return telefonef;
    }

    public void setTelefonef(String telefonef) {
        this.telefonef = telefonef;
    }

    public String getCidadef() {
        return cidadef;
    }

    public void setCidadef(String cidadef) {
        this.cidadef = cidadef;
    }

    public String getEstadof() {
        return estadof;
    }

    public void setEstadof(String estadof) {
        this.estadof = estadof;
    }

    public String getPaisf() {
        return paisf;
    }

    public void setPaisf(String paisf) {
        this.paisf = paisf;
    }

    public String getEnderecof() {
        return enderecof;
    }

    public void setEnderecof(String enderecof) {
        this.enderecof = enderecof;
    }

    public String getNumerof() {
        return numerof;
    }

    public void setNumerof(String numerof) {
        this.numerof = numerof;
    }

    public String getDataCadastrof() {
        return dataCadastrof;
    }

    public void setDataCadastrof(String dataCadastrof) {
        this.dataCadastrof = dataCadastrof;
    }
}
