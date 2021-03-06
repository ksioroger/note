 package interfaces;

import controle.ControleTamanhoTexto;
 
import entidade.Senha;
import entidade.Usuário;
 
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Cassiano Rogério
 */

//Cria uma janela para inserção de nova senha no banco de dados
public class Novo extends javax.swing.JDialog {
    Usuário userLogado;
    /** Creates new form Adicionar
     * @param parent
     * @param modal
     * @param user 
     */
    public Novo(java.awt.Frame parent, boolean modal, Usuário user) {
        super(parent, modal);
        userLogado = user;
        URL url = this.getClass().getResource("/images/key 20x20.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        initComponents();
        //Setar o botão Okay como botão padrão da janela
        getRootPane().setDefaultButton(jButtonOkay);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Fundo = new javax.swing.JPanel();
        jPanelEtiquetas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelUsuário = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jPanelTextos = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldUsuário = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jPanelBotões = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonOkay = new javax.swing.JButton();
        jCheckBoxMúltiplasSenhas = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabelNome.setText("Nome");

        jLabelUsuário.setText("Usuário");

        jLabelSenha.setText("Senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelUsuário)
                    .addComponent(jLabelSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelNome)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsuário)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldNome.setDocument( new ControleTamanhoTexto(30) );
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldUsuário.setDocument( new ControleTamanhoTexto(30) );
        jTextFieldUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuárioActionPerformed(evt);
            }
        });

        jTextFieldSenha.setDocument( new ControleTamanhoTexto(30) );
        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTextosLayout = new javax.swing.GroupLayout(jPanelTextos);
        jPanelTextos.setLayout(jPanelTextosLayout);
        jPanelTextosLayout.setHorizontalGroup(
            jPanelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addComponent(jTextFieldUsuário)
            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelTextosLayout.setVerticalGroup(
            jPanelTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTextosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonCancelar.setMnemonic('c');
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonOkay.setMnemonic('k');
        jButtonOkay.setText("Okay");
        jButtonOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkayActionPerformed(evt);
            }
        });

        jCheckBoxMúltiplasSenhas.setMnemonic('p');
        jCheckBoxMúltiplasSenhas.setText("Múltiplas Senhas");
        jCheckBoxMúltiplasSenhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMúltiplasSenhasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotõesLayout = new javax.swing.GroupLayout(jPanelBotões);
        jPanelBotões.setLayout(jPanelBotõesLayout);
        jPanelBotõesLayout.setHorizontalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotõesLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jCheckBoxMúltiplasSenhas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOkay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar))
        );
        jPanelBotõesLayout.setVerticalGroup(
            jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotõesLayout.createSequentialGroup()
                .addGroup(jPanelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOkay)
                    .addComponent(jButtonCancelar)
                    .addComponent(jCheckBoxMúltiplasSenhas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.dispose();

        javax.swing.GroupLayout jPanelEtiquetasLayout = new javax.swing.GroupLayout(jPanelEtiquetas);
        jPanelEtiquetas.setLayout(jPanelEtiquetasLayout);
        jPanelEtiquetasLayout.setHorizontalGroup(
            jPanelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquetasLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTextos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEtiquetasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelEtiquetasLayout.setVerticalGroup(
            jPanelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquetasLayout.createSequentialGroup()
                .addComponent(jPanelTextos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(jPanelEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(jPanelEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(Fundo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        //Fecha a janela
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonOkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkayActionPerformed
        try {
            // TODO add your handling code here:
            //Chama a janela de inserção de dados
            botãoOkayPressionado();
        } catch (Exception ex) {
            Logger.getLogger(Novo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOkayActionPerformed

    private void jCheckBoxMúltiplasSenhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMúltiplasSenhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMúltiplasSenhasActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
        //Pula para o campo de usuário
        jTextFieldUsuário.requestFocus();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        // TODO add your handling code here:
        //Quando estiver no campo de texto da senha permite confirmar usando a tecla enter
        jButtonOkay.doClick();
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jTextFieldUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuárioActionPerformed
        // TODO add your handling code here:
        //Pula para o campo de usuário
        jTextFieldSenha.requestFocus();
    }//GEN-LAST:event_jTextFieldUsuárioActionPerformed

    //Permitir fechar a Janela com a tecla Esc
    @Override
    protected JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action actionListener;
        actionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) { 
                setVisible(false);
            } 
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", actionListener);
        return rootPane;
    }    
    
    //Checa se foi selecionada a opção para inserir mais de um cadastro de senha, e chama a janela de cadastro
    private void botãoOkayPressionado() throws Exception{
        int flag;
        //Se a caixa de cadastro de múltiplassenhas estiver desmarcada, termina a execução e encerra
        if(!jCheckBoxMúltiplasSenhas.isSelected()){
            flag = inserirSenha();
            //Caso nenhum erro tenha ocorrido, encerra a janela
            if (flag==0) {
                this.dispose();
            }
        }else{
            // Seta o foco no primeiro campo de texto(nome)
            jTextFieldNome.requestFocus();
            inserirSenha();
        }
    }
    
    //Capta os dados da tela de cadastro e insere no banco de dados
    private int inserirSenha() throws Exception {
        String mensagem_erro = null;
        //Recebe os dados digitados pelo usuário na tela de cadastro
        Senha senha = obterSenhaInformada();
        
        //Insere a senha no banco de dados
        if (senha != null){
            senha.setIdUser(userLogado.getID());
            mensagem_erro = Senha.inserirSenha(senha);
            //Para caso o usuário for continuar cadastrando ele irá limpar os campos após a confirmação de inserção de cada cadastro
            Limpar();
            return 0;
        }
        else{
            JOptionPane.showMessageDialog(this, "Por gentileza preencher todos os campos", "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return 1;
        } 
    } 
    
    //Capta os dados digitados na tela de cadastro
    private Senha obterSenhaInformada() throws Exception{
        entidade.Senha senha = null;
        //String chaveencriptacao = "F5SENHAACESSO-TI";
        String chaveencriptacao = userLogado.getChave();
        
        String Nome =  jTextFieldNome.getText();
        if (Nome.isEmpty()) return null;
        String Usuário = jTextFieldUsuário.getText();
        if (Usuário.isEmpty()) return null;
        String Senha = jTextFieldSenha.getText();
        if (Senha.isEmpty()) return null;
        
        int forca = entidade.Senha.testar_Forca_Da_Senha(Senha);
        if(forca <= 1){
            JOptionPane.showMessageDialog(this,
                    "Sua senha não possui os pré-requisitos de uma senha segura,\n recomendamos que mude-a assim que possível."
                            + "\n\nUse caracteres maiúsculos, minúsculos, números\ne caracteres especiais, por exemplo: *>F5s3nh@<*"
                            + "\n\nForça: " + forca+", INSEGURA", "Insegura", JOptionPane.WARNING_MESSAGE);
        }
        else if(forca == 2){
            JOptionPane.showMessageDialog(this, 
                    "Sua senha ainda não é tão boa,\n recomendamos que mude-a asim que possível."
                            + "\n\nUse caracteres maiúsculos, minúsculos, números\ne caracteres especiais, por exemplo: *>F5s3nh@<*"
                            + "\n\nForça: " + forca+", REGULAR", "REGULAR", JOptionPane.WARNING_MESSAGE);
        }
        else if(forca == 3){
            JOptionPane.showMessageDialog(this, 
                    "Sua senha é boa, porém ainda sim recomendamos\nque mude-a asim que possível, para uma mais forte."
                            + "\n\nUse caracteres maiúsculos, minúsculos, números\ne caracteres especiais, por exemplo: *>F5s3nh@<*"
                            + "\n\nForça: " + forca+", BOA", "Boa", JOptionPane.WARNING_MESSAGE);
        }
        else if(forca >= 4){
            JOptionPane.showMessageDialog(this, 
                    "Sua senha é forte, recomendamos usar senhas neste padrão."
                            + "\n\nSempre use caracteres maiúsculos, minúsculos, números\ne caracteres especiais, por exemplo: *>F5s3nh@<*"
                            + "\n\nForça: " + forca+", FORTE", "FORTE", JOptionPane.WARNING_MESSAGE);
        }
        /*
        *      Criptografando senha usando AES
        */
        Senha = entidade.Senha.criptografe_e_codifique(Senha, chaveencriptacao);
        
        //Retorna os dados informados pelo usuário
        return new Senha (Nome,Usuário, Senha);
    }
    
    //Limpa os campos de texto da janela de cadastro
    private void Limpar(){
        jTextFieldNome.setText("");
        jTextFieldUsuário.setText("");
        jTextFieldSenha.setText("");
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuário user = null;
                Novo dialog = new Novo(new javax.swing.JFrame(), true, user);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOkay;
    private javax.swing.JCheckBox jCheckBoxMúltiplasSenhas;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBotões;
    private javax.swing.JPanel jPanelEtiquetas;
    private javax.swing.JPanel jPanelTextos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldUsuário;
    // End of variables declaration//GEN-END:variables

}
