package com.mycompany.projetovideo;
/**
 *
 * @lf
 */
public class Formigaluna extends Pessoa {
    private String login;
    private int totAssistido;

    public Formigaluna(String nome, int idade, String sexo, String login) {
        super(idade, sexo);
        this.nome = nome;
        this.login = login;
        this.totAssistido = 0;
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Formigaluna{" + super.toString()+ "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
}
