/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Heitor Augusto
 */
public class ControleCartasSelecionadas {
    private int cartasSelecionadas;
    private int indicePrimeiraCarta;
    private int indiceSegundaCarta;
    private String primeiraCarta;
    private String segundaCarta;
    private JButton primeiroBotao;
    private JButton segundoBotao;
    private int quantidadeAcertos;
    
        
    public ControleCartasSelecionadas(){
       this.cartasSelecionadas = 0;
       this.quantidadeAcertos = 0;
    }
    
    public boolean  verificarSelecao(){
        if(primeiraCarta == segundaCarta){
            quantidadeAcertos ++;
            return true;
        }
        else{
            cartasSelecionadas = 0;
            return false;
        }
    }
    public boolean isCartaSelecionada(){
        if(cartasSelecionadas > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean verificarJogo(int quantidadeCartas){
        if (quantidadeAcertos == (quantidadeCartas)){
            return true;
        }
        return false;
    }

    public int getCartasSelecionadas() {
        return cartasSelecionadas;
    }

    public void setCartasSelecionadas(int cartasSelecionadas) {
        this.cartasSelecionadas = cartasSelecionadas;
    }

    public String getPrimeiraCarta() {
        return primeiraCarta;
    }

    public void setPrimeiraCarta(String primeiraCarta) {
        this.primeiraCarta = primeiraCarta;
    }

    public String getSegundaCarta() {
        return segundaCarta;
    }

    public void setSegundaCarta(String segundaCarta) {
        this.segundaCarta = segundaCarta;
    }   

    public JButton getPrimeiroBotao() {
        return primeiroBotao;
    }

    public void setPrimeiroBotao(JButton primeiroBotao) {
        this.primeiroBotao = primeiroBotao;
    }

    public JButton getSegundoBotao() {
        return segundoBotao;
    }

    public void setSegundoBotao(JButton segundoBotao) {
        this.segundoBotao = segundoBotao;
    }

    public int getIndicePrimeiraCarta() {
        return indicePrimeiraCarta;
    }

    public void setIndicePrimeiraCarta(int indicePrimeiraCarta) {
        this.indicePrimeiraCarta = indicePrimeiraCarta;
    }

    public int getIndiceSegundaCarta() {
        return indiceSegundaCarta;
    }

    public void setIndiceSegundaCarta(int indiceSegundaCarta) {
        this.indiceSegundaCarta = indiceSegundaCarta;
    }

    public int getQuantidadeAcertos() {
        return quantidadeAcertos;
    }

    public void setQuantidadeAcertos(int quantidadeAcertos) {
        this.quantidadeAcertos = quantidadeAcertos;
    }
    
    
    
}
