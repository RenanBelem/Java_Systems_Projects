package com.company;

public class Vendedor {
    private String nomev;
    private String sobrenomev;
    private String dataNascimentov;
    private String telefonev;
    private String cpfv;
    private String cidadev;
    private String estadov;
    private String paisv;
    private String enderecov;
    private String dataCadastrov;
    private String login;
    private String senha;

    public Vendedor(String nome, String sobrenome, String dataNascimento, String telefone, String cpf, String cidade,
                    String estado, String pais, String endereco, String dataCadastro, String login, String senha){
        this.nomev = nome;
        this.sobrenomev = sobrenome;
        this.dataNascimentov = dataNascimento;
        this.telefonev = telefone;
        this.cpfv = cpf;
        this.cidadev = cidade;
        this.estadov = estado;
        this.paisv = pais;
        this.enderecov = endereco;
        this.dataCadastrov = dataCadastro;
        this.login = login;
        this.senha = senha;
    }

    public String getNomev() {
        return nomev;
    }

    public void setNomev(String nomev) {
        this.nomev = nomev;
    }

    public String getSobrenomev() {
        return sobrenomev;
    }

    public void setSobrenomev(String sobrenomev) {
        this.sobrenomev = sobrenomev;
    }

    public String getDataNascimentov() {
        return dataNascimentov;
    }

    public void setDataNascimentov(String dataNascimentov) {
        this.dataNascimentov = dataNascimentov;
    }

    public String getTelefonev() {
        return telefonev;
    }

    public void setTelefonev(String telefonev) {
        this.telefonev = telefonev;
    }

    public String getCpfv() {
        return cpfv;
    }

    public void setCpfv(String cpfv) {
        this.cpfv = cpfv;
    }

    public String getCidadev() {
        return cidadev;
    }

    public void setCidadev(String cidadev) {
        this.cidadev = cidadev;
    }

    public String getEstadov() {
        return estadov;
    }

    public void setEstadov(String estadov) {
        this.estadov = estadov;
    }

    public String getPaisv() {
        return paisv;
    }

    public void setPaisv(String paisv) {
        this.paisv = paisv;
    }

    public String getEnderecov() {
        return enderecov;
    }

    public void setEnderecov(String enderecov) {
        this.enderecov = enderecov;
    }

    public String getDataCadastrov() {
        return dataCadastrov;
    }

    public void setDataCadastrov(String dataCadastrov) {
        this.dataCadastrov = dataCadastrov;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
