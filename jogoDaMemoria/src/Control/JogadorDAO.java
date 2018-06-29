/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Jogador;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Heitor Augusto
 */
public class JogadorDAO {
    private Connection connection;

    
    public JogadorDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    public void cadastrarJogador(Jogador jogadorParam){       
        String sql = "INSERT INTO login (usuario,senha,dataNascimento)"+
                "VALUES(?,?,?)";
    
        try {
            
            java.sql.Date dataSql = new java.sql.Date(jogadorParam.getDataNascimento().getTime());
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, jogadorParam.getUsuario());
            stmt.setString(2, jogadorParam.getSenha());
            stmt.setDate(3, dataSql);
            
            stmt.execute();

            stmt.close();
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }     
    }
    public Boolean verificarJogador(String usuario) throws SQLException{     
        PreparedStatement stmt = null;
        try{
            String sql = "SELECT * FROM login WHERE usuario =?";                   
            stmt = connection.prepareStatement(sql); 
            stmt.setString(1, usuario);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                return true;
            }             
        }
        catch(Exception s){
            
        }
        stmt.close();
        return false;
    }
    
    public void atualizarPontuacao(Jogador jogadorParam, int pontuacao) throws SQLException{
        PreparedStatement stmt = null;
        try{
            String sql = "UPDATE ranking SET "
                    + "pontuacao = pontuacao + ? WHERE codusuario = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1,pontuacao);
            stmt.setInt(2, jogadorParam.getCodUsuario());
            stmt.executeUpdate();
        }
        catch(Exception s){
            System.out.println(s.toString());
        }
        stmt.close();
    }
    
    public Boolean acessarJogador(Jogador jogadorParam) throws SQLException{
        
        PreparedStatement stmt = null;
            String sql = "SELECT codUsuario, usuario, senha FROM login WHERE usuario =? AND senha =?";                   
            stmt = connection.prepareStatement(sql); 
            stmt.setString(1,jogadorParam.getUsuario());
            stmt.setString(2,jogadorParam.getSenha());            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                jogadorParam.setCodUsuario(rs.getInt("codUsuario"));
                stmt.close();
                return true;
            }             
        
        stmt.close();
        return false;
    }
    
    /**
     *
     * @return
     */
    public List<Jogador> selecionarJogadores(){
         try {
            List<Jogador> jogadores = new ArrayList<Jogador>();

            PreparedStatement stmt = connection.prepareStatement("SELECT L.usuario, L.codUsuario, R.pontuacao FROM ranking R INNER JOIN "
                    + "login L ON  R.codusuario = L.codusuario ORDER BY R.pontuacao DESC");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setCodUsuario(rs.getInt("codUsuario"));
                jogador.setUsuario(rs.getString("usuario"));
                jogador.setPontuacao(rs.getInt("pontuacao"));
                jogadores.add(jogador);
            }
            rs.close();
            stmt.close();
            return jogadores;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    public void atualizarSenha(Jogador jogadorParam){
        /*Parametros que irei adicionarar para atualizar senha; */
    }
}
