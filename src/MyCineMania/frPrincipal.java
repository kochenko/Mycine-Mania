
package MyCineMania;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.lang.IllegalArgumentException.*;
import java.lang.String;

public final class frPrincipal extends javax.swing.JFrame {

    private JOptionPane opcao = new JOptionPane();
    private ControlePrincipal controle;
    private Funcionario funcEdit;
    private boolean conexao;
    
    public frPrincipal() {
        this.inicializacao();
    }        
            
    public frPrincipal(ControlePrincipal controle) {
        this.inicializacao();
        this.controle = controle;
    }    

    public void inicializacao(){
        initComponents();
        Image teste = Toolkit.getDefaultToolkit().getImage("icones/cinema-tv_s.png");
        this.setIconImage(teste);
        this.conexao = false; 
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jInternalFrameSobre = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuParticipante = new javax.swing.JMenu();
        jMenuItemParticipanteCadastrar = new javax.swing.JMenuItem();
        jMenuItemParticipanteEditar = new javax.swing.JMenuItem();
        jMenuItemParticipanteRemover = new javax.swing.JMenuItem();
        jMenuCinema = new javax.swing.JMenu();
        jMenuItemCinemaCadastrar = new javax.swing.JMenuItem();
        jMenuItemCinemaEditar = new javax.swing.JMenuItem();
        jMenuItemCinemaRemover = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuFerramentasAdm = new javax.swing.JMenu();
        jMenuItemFerramentasAdmValida = new javax.swing.JMenuItem();
        jMenuItemFerramentasAdmValor = new javax.swing.JMenuItem();
        jMenuFerramentasFunc = new javax.swing.JMenu();
        jMenuItemFerramentasFuncValidar = new javax.swing.JMenuItem();
        jMenuFerramentasPart = new javax.swing.JMenu();
        jMenuItemFerramentasGerar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCineMania");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelPrincipal.setFocusable(false);
        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanelPrincipal.setOpaque(false);
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanelPrincipal.setRequestFocusEnabled(false);
        jPanelPrincipal.setVerifyInputWhenFocusTarget(false);
        jPanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jInternalFrameSobre.setTitle("Sobre");
        jInternalFrameSobre.setEnabled(false);
        jInternalFrameSobre.setVisible(false);
        jInternalFrameSobre.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("MyCine Mania");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Autores:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setText("Daniel Bez");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("Rafael Maciel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel5.setText("Rafael Tremea");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, -1));

        jInternalFrameSobre.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 190));

        jPanelPrincipal.add(jInternalFrameSobre, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        jMenuArquivo.setText("Arquivo");

        jMenuItemLogin.setText("Login");
        jMenuArquivo.add(jMenuItemLogin);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemSairMousePressed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuEditar.setText("Editar");

        jMenuParticipante.setText("Participante");

        jMenuItemParticipanteCadastrar.setText("Cadastrar");
        jMenuParticipante.add(jMenuItemParticipanteCadastrar);

        jMenuItemParticipanteEditar.setText("Editar");
        jMenuParticipante.add(jMenuItemParticipanteEditar);

        jMenuItemParticipanteRemover.setText("Remover");
        jMenuParticipante.add(jMenuItemParticipanteRemover);

        jMenuEditar.add(jMenuParticipante);

        jMenuCinema.setText("Cinema");
        jMenuCinema.setActionCommand("Cinema");

        jMenuItemCinemaCadastrar.setText("Cadastrar");
        jMenuCinema.add(jMenuItemCinemaCadastrar);

        jMenuItemCinemaEditar.setText("Editar");
        jMenuCinema.add(jMenuItemCinemaEditar);

        jMenuItemCinemaRemover.setText("Remover");
        jMenuCinema.add(jMenuItemCinemaRemover);

        jMenuEditar.add(jMenuCinema);

        jMenuBar1.add(jMenuEditar);

        jMenuFerramentas.setText("Ferramentas");

        jMenuFerramentasAdm.setText("Administrador");

        jMenuItemFerramentasAdmValida.setText("Validar Cadastro");
        jMenuFerramentasAdm.add(jMenuItemFerramentasAdmValida);

        jMenuItemFerramentasAdmValor.setText("Alterar Valor Adesão");
        jMenuFerramentasAdm.add(jMenuItemFerramentasAdmValor);

        jMenuFerramentas.add(jMenuFerramentasAdm);

        jMenuFerramentasFunc.setText("Funcionário");

        jMenuItemFerramentasFuncValidar.setText("Validar Voucher");
        jMenuFerramentasFunc.add(jMenuItemFerramentasFuncValidar);

        jMenuFerramentas.add(jMenuFerramentasFunc);

        jMenuFerramentasPart.setText("Participante");

        jMenuItemFerramentasGerar.setText("Gerar Voucher");
        jMenuFerramentasPart.add(jMenuItemFerramentasGerar);

        jMenuFerramentas.add(jMenuFerramentasPart);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSobre.setText("Sobre");

        jMenuItemSobre.setText("Sistema");
        jMenuItemSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemSobreMousePressed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSobre);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    public void conexaoEstabelecida(){
        this.conexao = true;
    }
   
    
    private void jMenuItemSobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSobreMousePressed
       this.abilitaFrame(this.jInternalFrameSobre);     
    }//GEN-LAST:event_jMenuItemSobreMousePressed

    private void jMenuItemSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMousePressed
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(!this.conexao){
             Icon erro = new ImageIcon( "icones/icong_08.gif" );
             this.opcao.showMessageDialog(null,"Conexão com o banco falhou","Erro!",1,erro);
             this.dispose();            
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
          this.desabilitaFrame(jInternalFrameSobre);
    }//GEN-LAST:event_jButton1MousePressed
  

    
     private void confirmaOperacao(JInternalFrame frame, String texto, String label){
        frame.setVisible(false);
        frame.disable();
        Icon certo = new ImageIcon( "icones/icong_07.gif" );
        this.opcao.showMessageDialog(null,texto,label,1,certo);
        this.abilitaMenu();
     } 
     
     public void erro(JInternalFrame frame, String texto, String label){
        Icon erro = new ImageIcon( "icones/warning.gif" );
        this.opcao.showMessageDialog(null,texto,label,1,erro);
     }
    
    private void abilitaFrame(JInternalFrame frame){
         this.desabilitaMenu();
         frame.setVisible(true);
         frame.enable();
     } 
          
     private void desabilitaFrame(JInternalFrame frame){
         frame.setVisible(false);
         frame.disable();
         this.abilitaMenu();
     }     
    
     private void abilitaMenu(){
        this.jMenuArquivo.enable();
        this.jMenuEditar.enable();
        this.jMenuFerramentas.enable();
        this.jMenuSobre.enable();
    }
    
    private void desabilitaMenu(){
        this.jMenuArquivo.disable();
        this.jMenuEditar.disable();
        this.jMenuFerramentas.disable();
        this.jMenuSobre.disable();
    }
    
 
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrameSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCinema;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuFerramentasAdm;
    private javax.swing.JMenu jMenuFerramentasFunc;
    private javax.swing.JMenu jMenuFerramentasPart;
    private javax.swing.JMenuItem jMenuItemCinemaCadastrar;
    private javax.swing.JMenuItem jMenuItemCinemaEditar;
    private javax.swing.JMenuItem jMenuItemCinemaRemover;
    private javax.swing.JMenuItem jMenuItemFerramentasAdmValida;
    private javax.swing.JMenuItem jMenuItemFerramentasAdmValor;
    private javax.swing.JMenuItem jMenuItemFerramentasFuncValidar;
    private javax.swing.JMenuItem jMenuItemFerramentasGerar;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemParticipanteCadastrar;
    private javax.swing.JMenuItem jMenuItemParticipanteEditar;
    private javax.swing.JMenuItem jMenuItemParticipanteRemover;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuParticipante;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
    
}
