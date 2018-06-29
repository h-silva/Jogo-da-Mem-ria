/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Heitor Augusto
 */
public class Carta extends JButton{
    
    private int carta;
    private int cartas[];
    public int cartasCriadas = 0;
    public int quantidadeCarta;
    
    private String imagemFundo;
    private String imagemCarta[];
    private int valorCarta;
    private boolean selecionada;
    
    public Carta(){
        this.imagemCarta = new String[24];
        this.imagemCarta[0] = "/img/jogo/carta1.png";
        this.imagemCarta[1] = "/img/jogo/carta1.png";
        this.imagemCarta[2] = "/img/jogo/carta2.png";
        this.imagemCarta[3] = "/img/jogo/carta2.png";
        this.imagemCarta[4] = "/img/jogo/carta3.png";
        this.imagemCarta[5] = "/img/jogo/carta3.png";
        this.imagemCarta[6] = "/img/jogo/carta4.png";
        this.imagemCarta[7] = "/img/jogo/carta4.png";
        this.imagemCarta[8] = "/img/jogo/carta5.png";
        this.imagemCarta[9] = "/img/jogo/carta5.png";
        this.imagemCarta[10] = "/img/jogo/carta6.png";
        this.imagemCarta[11] = "/img/jogo/carta6.png";
        this.imagemCarta[12] = "/img/jogo/carta7.png";
        this.imagemCarta[13] = "/img/jogo/carta7.png";
        this.imagemCarta[14] = "/img/jogo/carta8.png";
        this.imagemCarta[15] = "/img/jogo/carta8.png";
        this.imagemCarta[16] = "/img/jogo/carta9.png";
        this.imagemCarta[17] = "/img/jogo/carta9.png";
        this.imagemCarta[18] = "/img/jogo/carta10.png";
        this.imagemCarta[19] = "/img/jogo/carta10.png";
        this.imagemCarta[20] = "/img/jogo/carta11.png";
        this.imagemCarta[21] = "/img/jogo/carta11.png";
        this.imagemCarta[22] = "/img/jogo/carta12.png";
        this.imagemCarta[23] = "/img/jogo/carta12.png";
        embaralhar(imagemCarta,24);
    }
    
    public Carta(int quantidadeCarta){           
        this.imagemCarta = new String[24];
        this.imagemCarta[0] = "/img/jogo/carta1.png";
        this.imagemCarta[1] = "/img/jogo/carta1.png";
        this.imagemCarta[2] = "/img/jogo/carta2.png";
        this.imagemCarta[3] = "/img/jogo/carta2.png";
        this.imagemCarta[4] = "/img/jogo/carta3.png";
        this.imagemCarta[5] = "/img/jogo/carta3.png";
        this.imagemCarta[6] = "/img/jogo/carta4.png";
        this.imagemCarta[7] = "/img/jogo/carta4.png";
        this.imagemCarta[8] = "/img/jogo/carta5.png";
        this.imagemCarta[9] = "/img/jogo/carta5.png";
        this.imagemCarta[10] = "/img/jogo/carta6.png";
        this.imagemCarta[11] = "/img/jogo/carta6.png";
        this.imagemCarta[12] = "/img/jogo/carta7.png";
        this.imagemCarta[13] = "/img/jogo/carta7.png";
        this.imagemCarta[14] = "/img/jogo/carta8.png";
        this.imagemCarta[15] = "/img/jogo/carta8.png";
        this.imagemCarta[16] = "/img/jogo/carta9.png";
        this.imagemCarta[17] = "/img/jogo/carta9.png";
        this.imagemCarta[18] = "/img/jogo/carta10.png";
        this.imagemCarta[19] = "/img/jogo/carta10.png";
        this.imagemCarta[20] = "/img/jogo/carta11.png";
        this.imagemCarta[21] = "/img/jogo/carta11.png";
        this.imagemCarta[22] = "/img/jogo/carta12.png";
        this.imagemCarta[23] = "/img/jogo/carta12.png"; 
        embaralhar(imagemCarta,quantidadeCarta);
    }
    
    public static void embaralhar(String [] imagemCarta, int quantidadeCarta) {
		
		Random random = new Random();
		
		for (int i=0; i < (quantidadeCarta - 1); i++) {

			//sorteia um índice
			int j = random.nextInt(quantidadeCarta); 
			
			//troca o conteúdo dos índices i e j do vetor
			String temp = imagemCarta[i];
			imagemCarta[i] = imagemCarta[j];
			imagemCarta[j] = temp;
		}		
	}
    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public String getImagemFundo() {
        return imagemFundo;
    }

    public void setImagemFundo(String imagemFundo) {
        this.imagemFundo = imagemFundo;
    }

    public String getImagemCarta(int param) {
        return this.imagemCarta[param];
    }

    public void setImagemCarta(String imagemCarta,int param) {
        this.imagemCarta[param] = imagemCarta;
    }

    public int getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    public boolean isSelecionada() {
        return selecionada;
    }

    public void setSelecionada(boolean selecionada) {
        this.selecionada = selecionada;
    }

    public int[] getCartas() {
        return cartas;
    }

    public void setCartas(int[] cartas) {
        this.cartas = cartas;
    }

    public int getCartasCriadas() {
        return cartasCriadas;
    }

    public void setCartasCriadas(int cartasCriadas) {
        this.cartasCriadas = cartasCriadas;
    }

    public int getQuantidadeCarta() {
        return quantidadeCarta;
    }

    public void setQuantidadeCarta(int quantidadeCarta) {
        this.quantidadeCarta = quantidadeCarta;
        this.cartas = new int[quantidadeCarta];
    }
    
}
