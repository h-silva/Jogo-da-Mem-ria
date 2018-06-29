/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Heitor Augusto
 */
public class BarraProgresso {
    private int distanciaEsquerda = 0;
    private int distanciaCima = 0;
    private int tamanhoPB = 0;
    private int alturaPB = 0;
    private int tempo = 0;

    
    public void gerarPG(int nivel){
        switch(nivel){
            case 1:
                distanciaEsquerda = 130;
                distanciaCima = 335;
                tamanhoPB = 500;
                alturaPB = 50;
                tempo = 0;
                break;
            case 2:
                distanciaEsquerda = 130;
                distanciaCima = 500;
                tamanhoPB = 500;
                alturaPB = 50;
                tempo = 0;
                break;
            case 3:
                distanciaEsquerda = 255;
                distanciaCima = 500;
                tamanhoPB = 500;
                alturaPB = 50;
                tempo = 0;
                break;
            default:              
        }
        
    }
    public int getDistanciaEsquerda() {
        return distanciaEsquerda;
    }

    public void setDistanciaEsquerda(int distanciaEsquerda) {
        this.distanciaEsquerda = distanciaEsquerda;
    }

    public int getDistanciaCima() {
        return distanciaCima;
    }

    public void setDistanciaCima(int distanciaCima) {
        this.distanciaCima = distanciaCima;
    }

    public int getTamanhoPB() {
        return tamanhoPB;
    }

    public void setTamanhoPB(int tamanhoPB) {
        this.tamanhoPB = tamanhoPB;
    }

    public int getAlturaPB() {
        return alturaPB;
    }

    public void setAlturaPB(int alturaPB) {
        this.alturaPB = alturaPB;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
}
