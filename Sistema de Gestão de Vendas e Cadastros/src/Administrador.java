package com.company;

public class Administrador {
    private String loginAdmin;
    private String senha;

    public Administrador(String loginAdmin, String senha) {
        this.loginAdmin = loginAdmin;
        this.senha = senha;
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}