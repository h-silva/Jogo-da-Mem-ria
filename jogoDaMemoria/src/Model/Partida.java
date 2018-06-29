/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Heitor Augusto
 */
public class Partida {
    private int nivel;
    private int numeroLinha;
    private int quantidadeCartas;
    private int numeroColuna;   
    private Date tempo;
    private Jogador jogador; 
    private int pontuacao;




    public Partida(){
        
    }
    
    public int getNivel(){
        return this.nivel;
    }
    public void setNivel(int nivelParam)
    {
        this.nivel = nivelParam;
    }

    public int getQuantidadeCartas() {
        return quantidadeCartas;
    }

    public void setQuantidadeCartas(int quantidadeCartasParam) {
        this.quantidadeCartas = quantidadeCartasParam;
    }
    
        public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinhaParam) {
        this.numeroLinha = numeroLinhaParam;
    }

    public int getNumeroColuna() {
        return numeroColuna;
    }

    public void setNumeroColuna(int numeroColunaParam) {
        this.numeroColuna = numeroColunaParam;
    }

    public Date getTempo() {
        return tempo;
    }

    public void setTempo(Date tempoParam) {
        this.tempo = tempo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogadorParam) {
        this.jogador = jogador;
    }
    
    public void quantidadeCartas(int nivelParam){
         quantidadeCartas = 0;
        
        switch(nivelParam){
            case 1: {
                quantidadeCartas = 12;
                this.setNumeroColuna(6);
                break; 
            }
            case 2:{
                quantidadeCartas = 18;
                this.setNumeroColuna(6);
                break;
            }
            case 3:{
                quantidadeCartas = 24;
                this.setNumeroColuna(8);
                break;
            }
            default:{
                break;
            }
        }
        this.setNumeroLinha(quantidadeCartas / this.getNumeroColuna());  
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int nivel) {       
        switch(nivel){
            case 1: pontuacao = 200;
                break;
            case 2: pontuacao = 300;
                break;
            case 3: pontuacao = 500;
                break;
            default: pontuacao = 0;
                break;
        }    
    }
    
    public void atualizarPontuacao(int valor){
        pontuacao = pontuacao - valor;
    }    
}
