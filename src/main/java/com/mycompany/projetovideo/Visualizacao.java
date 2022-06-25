package com.mycompany.projetovideo;
/**
 *
 * @lf
 */
public class Visualizacao {
    private Formigaluna espectador;
    private Video filme;

    public Visualizacao(Formigaluna espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setView(this.filme.getView()+1);
        
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
        
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
       
    } 
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3; 
        }else if (porc <=50){    
            tot = 5; 
        }else if (porc <= 90){
            tot = 8;
        }else  {   
            tot = 10; 
        }    
        this.filme.setAvaliacao(tot);
    }      
        
    public Formigaluna getEspectador() {
        return espectador;
    }

    public void setEspectador(Formigaluna espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
       
}
