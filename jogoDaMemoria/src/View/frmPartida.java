package View;
import Control.JogadorDAO;
import Model.BarraProgresso;
import Model.Carta;
import Model.ControleCartasSelecionadas;
import Model.Jogador;
import Model.Partida;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 *
 * @author Heitor Augusto
 */
public class frmPartida extends JFrame {
    private JPanel tabuleiro;
    Random gerador = new Random();
    
    boolean finalJogo = false;
    
   int CONTROLADOR = 0;
    JButton[]  cartas; 
    private int posicaoX = 15,posicaoY = 15;
        
    public frmPartida(int altura, int largura,int nivel,Jogador jogadorParam){ 
        
        super("Jogo da Memória UNIP");
        tabuleiro = new JPanel();
        this.add(tabuleiro);
        tabuleiro.setLayout(null);

        BarraProgresso bp = new BarraProgresso();
        bp.gerarPG(nivel);
        final JProgressBar prDuracaoPartida = new JProgressBar();
        final JProgressBar prIniciar = new JProgressBar();
        
        prDuracaoPartida.setStringPainted(true);
        prDuracaoPartida.setValue(0);
        prDuracaoPartida.setSize(new Dimension(500, 25));
        
        prDuracaoPartida.setBounds(bp.getDistanciaEsquerda(),bp.getDistanciaCima(),
                bp.getTamanhoPB(),bp.getAlturaPB());

        
        tabuleiro.add(prDuracaoPartida);
        
        prIniciar.setStringPainted(true);
        prIniciar.setValue(0);
        prIniciar.setSize(new Dimension(500, 25));

          
        this.setBounds(0,0,altura,largura);
        setLocationRelativeTo(null);
        
        Partida partida = new Partida(); 
        partida.setPontuacao(nivel);
        
        partida.quantidadeCartas(nivel);
        int index = 0;
        int  valorCarta = 1;
        String imagemFundo ="/img/default/carta_fora.png";       
      
        ControleCartasSelecionadas controle = new ControleCartasSelecionadas();
        
        Carta cartaN = new Carta(partida.getQuantidadeCartas());
               
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent fecharJanela){
                finalJogo = true;
                System.out.println("executei evento");
            }
        });
        final SwingWorker tempoInicial = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    try {
                        prIniciar.setValue(i);
                        prIniciar.setString(i + "%");
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                //JOptionPane.showMessageDialog(rootPane, "ACABOU!");
                for(int i = 0; i < partida.getQuantidadeCartas();i++){
                    cartas[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(imagemFundo)));
                }   
                return 0;
            }
        };   
        
        
        final SwingWorker tempoPartida = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    try {
                        prDuracaoPartida.setValue(i);
                        prDuracaoPartida.setString(i + "%");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                if(finalJogo == false){
                    JOptionPane.showMessageDialog(rootPane, "ACABOU!");
                    dispose();
                }
                return 0;
            }
        }; 
        tempoPartida.execute();
        cartas = new JButton[partida.getQuantidadeCartas()];
        for(int linha = 0;linha < partida.getNumeroLinha();linha++){
            for(int coluna = 0; coluna < partida.getNumeroColuna();coluna++){              
                
                cartas[index] = new JButton();
                cartas[index].setText(""+valorCarta);
                
                String Sparametro = cartas[index].getText();
                int Iparametro = Integer.parseInt(Sparametro);
                String objetoImagem="";
                objetoImagem = cartaN.getImagemCarta(Iparametro-1);
                cartas[index].setIcon(new javax.swing.ImageIcon(getClass().getResource(objetoImagem)));
                cartas[index].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                
                cartas[index].addActionListener(new ActionListener() {                    
                    @Override
                    public void actionPerformed(ActionEvent ae) {                        
                        if((((JButton)ae.getSource()).getIcon().toString().contains(imagemFundo)) && (CONTROLADOR == 0)) {
                            
                            int numeroCarta = Integer.parseInt(((JButton) ae.getSource()).getText());
                            int quantidadeCartas = partida.getQuantidadeCartas();
                            //((JButton) ae.getSource()).setEnabled(false);

                            ((JButton) ae.getSource()).setIcon(new javax.swing.ImageIcon(getClass().
                                   getResource(cartaN.getImagemCarta(numeroCarta-1))));

                            String objetoImagem = "";
                            objetoImagem = cartaN.getImagemCarta(numeroCarta-1);

                            if(controle.getCartasSelecionadas() == 0){
                                controle.setPrimeiraCarta(objetoImagem);
                                controle.setPrimeiroBotao(((JButton) ae.getSource()));
                                ((JButton) ae.getSource()).setIcon(new javax.swing.ImageIcon(getClass().
                                   getResource(controle.getPrimeiraCarta())));
                                controle.setCartasSelecionadas(1);
                                controle.setIndicePrimeiraCarta(numeroCarta-1);
                            }
                            else{
                                controle.setSegundaCarta(objetoImagem);
                                controle.setSegundoBotao(((JButton) ae.getSource()));
                                ((JButton) ae.getSource()).setIcon(new javax.swing.ImageIcon(getClass().
                                getResource(controle.getSegundaCarta())));
                                controle.setIndiceSegundaCarta(numeroCarta-1);
                                controle.setCartasSelecionadas(0);

                                if(controle.verificarSelecao() == false){
                                    System.out.println("oooieeeee");
                                    start(controle,imagemFundo);                                        
                                    partida.atualizarPontuacao(5);
                                    System.out.println(partida.getPontuacao());
                                }
                                else{
                                    controle.setQuantidadeAcertos(controle.getQuantidadeAcertos() + 1);
                                    if(controle.verificarJogo(quantidadeCartas) == true){
                                        JOptionPane.showMessageDialog(rootPane, "Parabens, Você venceu! \n Pontuação: " + partida.getPontuacao());
                                            finalJogo = true;
                                            dispose();

                                        JogadorDAO jogadordao;
                                        try {
                                            jogadordao = new JogadorDAO();
                                            jogadordao.atualizarPontuacao(jogadorParam,partida.getPontuacao());
                                        } 
                                        catch (SQLException ex) {
                                            Logger.getLogger(frmPartida.class.getName()).log(Level.SEVERE, null, ex);
                                        }                    
                                    }
                                }
                            }
                            objetoImagem = "";    
                        }
                    }
                });                
                cartas[index].setBounds(posicaoX,posicaoY,100,150);
                tabuleiro.add(cartas[index]); 
                posicaoX += 125;
                valorCarta++;
                index++;
            }
            posicaoY += 160;
            posicaoX = 15;
            tempoInicial.execute();
        }       
    } 
        // Método para dar uma pausa no tempo e retornar a carta para a imagem padrão
        private void start(ControleCartasSelecionadas controle, String imagemFundo){
            SwingWorker worker = new SwingWorker() {
             @Override
                protected Void doInBackground() throws Exception {
                    CONTROLADOR = 1;
                    Thread.sleep(600);
                    cartas[controle.getIndicePrimeiraCarta()].setIcon(new javax.swing.ImageIcon(getClass().
                         getResource(imagemFundo)));
                    cartas[controle.getIndiceSegundaCarta()].setIcon(new javax.swing.ImageIcon(getClass().
                        getResource(imagemFundo))); 
                    CONTROLADOR = 0;
                    return null;
                }
            };
            worker.execute();      
    }
}
