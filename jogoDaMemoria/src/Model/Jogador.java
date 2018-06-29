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
public class Jogador {
    
    private int codUsuario;
    private String usuario;
    private String senha;
    private Date dataNascimento;
    private long pontuacao;


    
    
    public Jogador(){
        this.codUsuario = codUsuario;
        this.usuario = usuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    };
    
    
    
    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuarioParam) {
       this.codUsuario = codUsuarioParam;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuarioParam){
        this.usuario = usuarioParam;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senhaParam){
        this.senha = senhaParam;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimentoParam){
        this.dataNascimento = dataNascimentoParam;
    }
    
    public long getPontuacao() {
       return pontuacao;
    }

    public void setPontuacao(int pontuacaoParam) {
       this.pontuacao = pontuacaoParam;
    }
    
    
    
}
