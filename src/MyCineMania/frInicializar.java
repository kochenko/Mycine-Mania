
package MyCineMania;

import javax.swing.*;
import java.awt.*;
import java.lang.IllegalArgumentException.*;


public class frInicializar extends javax.swing.JFrame {
    
    
    private ControlePrincipal controle;
    private boolean conexao;
    private JOptionPane opcao = new JOptionPane();
    
    public frInicializar() {
        initComponents();
        this.conexao = false;
        Image teste = Toolkit.getDefaultToolkit().getImage("icones/cinema-tv_s.png");
        this.setIconImage(teste);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jButtonConfirma = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCineMania");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelUsuario.setText("Código usuário: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 20, 0, 0);
        jPanel1.add(jLabelUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 11, 0, 0);
        jPanel1.add(jTextFieldUsuario, gridBagConstraints);

        jLabelLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLogin.setText("LOGIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 8, 0, 0);
        jPanel1.add(jLabelLogin, gridBagConstraints);

        jButtonConfirma.setText("Confirma");
        jButtonConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 8, 22, 0);
        jPanel1.add(jButtonConfirma, gridBagConstraints);

        jButtonCancela.setText("Cancela");
        jButtonCancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 21, 22, 2);
        jPanel1.add(jButtonCancela, gridBagConstraints);

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSenha.setText("Senha: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        jPanel1.add(jLabelSenha, gridBagConstraints);

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 0, 0);
        jPanel1.add(jPasswordFieldSenha, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(!this.conexao){
             Icon erro = new ImageIcon( "icones/icong_08.gif" );
             this.opcao.showMessageDialog(null,"Conexão com o banco falhou","Erro!",1,erro);
             this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelaMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelaMouseClicked

    private void jButtonConfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmaMouseClicked
        LocalizadorAdministrador locAdmin = new LocalizadorAdministrador();
        Administrador admin = locAdmin.buscaAdministrador(Integer.parseInt(jTextFieldUsuario.getText())); //try catch
        if(admin.getSenha().equals(jPasswordFieldSenha.getText())){
            frAdministrador frAdmin = new frAdministrador();
            this.setVisible(false);
            frAdmin.setVisible(true);         
        }
        else{
            JOptionPane.showMessageDialog(null, "Senha incorreta");
            jTextFieldUsuario.setText(null);
            jPasswordFieldSenha.setText(null);
        }
            
    }//GEN-LAST:event_jButtonConfirmaMouseClicked
    
    public void setControle(ControlePrincipal controle1){
        this.controle = controle1;
    }
    
    public void conexaoEstabelecida(){
        this.conexao = true;
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frInicializar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
    
}
