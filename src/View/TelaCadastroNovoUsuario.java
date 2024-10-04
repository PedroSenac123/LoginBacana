package View;

import Controller.CadastroUsuariosController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import View.TelaOpCadastroUsuarios;

/**
 *
 * @author Aluno
 */
public class TelaCadastroNovoUsuario extends javax.swing.JFrame {


    public TelaCadastroNovoUsuario() {
        initComponents();
        rbtnUser.setSelected(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas a janela
//        addWindowListener(new WindowAdapter(){
//        public void windowClosed(WindowEvent e){
//        }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitutlo = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlDadosUsuario = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        txtPerfilUser = new javax.swing.JPanel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnUser = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlTop.setPreferredSize(new java.awt.Dimension(550, 60));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastroUsuario.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblTitutlo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitutlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitutlo.setText("Cadastro de Novo Usu�rio");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addComponent(lblTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitutlo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBase.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setPreferredSize(new java.awt.Dimension(15, 103));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        pnlBase.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(550, 40));

        pnlButtons.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCancelar);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSalvar);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlRight.setPreferredSize(new java.awt.Dimension(15, 103));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        pnlBase.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usu�rio"));

        pnlDadosUsuario.setLayout(new java.awt.GridLayout(8, 1, 5, 5));

        lblNome.setText("Nome Completo:");
        lblNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblNome);
        pnlDadosUsuario.add(txtNomeCompleto);

        lblEmail.setText("Email:");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblEmail);
        pnlDadosUsuario.add(txtEmail);

        lblLogin.setText("Login:");
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblLogin);
        pnlDadosUsuario.add(txtLogin);

        lblPerfil.setText("Selecione o Perfil de Usu�rio:");
        pnlDadosUsuario.add(lblPerfil);

        txtPerfilUser.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        rbtnAdmin.setText("ADMIN");
        rbtnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtnAdmin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnAdminItemStateChanged(evt);
            }
        });
        txtPerfilUser.add(rbtnAdmin);

        rbtnUser.setText("USER");
        rbtnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtnUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnUserItemStateChanged(evt);
            }
        });
        txtPerfilUser.add(rbtnUser);

        pnlDadosUsuario.add(txtPerfilUser);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        // Verica��o se as senhas s�o reaalmente identicas
        // Estrat�gias para for�ar o usu�rio a preencher todos os campos.
        String username = txtNomeCompleto.getText();
        String email = txtEmail.getText();
        String login = txtLogin.getText();
        String password = "123456";
        String perfil = null;

        if (rbtnAdmin.isSelected()) {
            perfil = "admin";
        } else {
            perfil = "colaborador";
        }

        // Verifico o preenchimento de todos os campos.
        if (username.isEmpty()) {
            String mensagem = "Preencha o campo de nome de usuario!";
            JOptionPane.showMessageDialog(null, mensagem);
            txtNomeCompleto.grabFocus();
        } else if (email.isEmpty()) {
            String mensagem = "Preencha o campo de email de usuario!";
            JOptionPane.showMessageDialog(null, mensagem);
            txtEmail.grabFocus();
        } else if (login.isEmpty()) {
            String mensagem = "Preencha o campo de login de usuario!";
            JOptionPane.showMessageDialog(null, mensagem);
            txtLogin.grabFocus();
        } else {

            CadastroUsuariosController novoUsuario = new CadastroUsuariosController();
            novoUsuario.criarUsuariosController(username, email, login, password, perfil);
            //Limpar Campos
            txtNomeCompleto.setText(null);
            txtEmail.setText(null);
            txtLogin.setText(null);

            //Fecha a tela
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rbtnAdminItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnAdminItemStateChanged
        rbtnUser.setSelected(false);
    }//GEN-LAST:event_rbtnAdminItemStateChanged

    private void rbtnUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnUserItemStateChanged
        rbtnAdmin.setSelected(false);
    }//GEN-LAST:event_rbtnUserItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Limpar Campos
        txtNomeCompleto.setText(null);
        txtEmail.setText(null);
        txtLogin.setText(null);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroNovoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDadosUsuario;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPanel txtPerfilUser;
    // End of variables declaration//GEN-END:variables
}
