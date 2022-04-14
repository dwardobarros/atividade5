/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author 666
 */
public class GUICadastrarConta extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadastrarConta
     */
    public GUICadastrarConta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblNomeDeUsuario = new javax.swing.JLabel();
        jlblEmail = new javax.swing.JLabel();
        jlblEmailConfirmacao = new javax.swing.JLabel();
        jlblSenha = new javax.swing.JLabel();
        jlblSenhaConfirmacao = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfEmailConfirmacao = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jpfSenhaConfirmacao = new javax.swing.JPasswordField();
        jlblRegrasDeSenha = new javax.swing.JLabel();
        jbtnCadastrarConta = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jlblPerguntaSeguranca = new javax.swing.JLabel();
        jlblRespostaPerguntaSeguranca = new javax.swing.JLabel();
        jcbxPerguntaSeguranca = new javax.swing.JComboBox<>();
        jtfRespostaPerguntaSeguranca = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(965, 727));

        jPanel1.setBackground(new java.awt.Color(7, 67, 152));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Que bom que você decidiu ter controle de sua vida financeira! <3");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Vamos começar!");

        jlblNomeDeUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblNomeDeUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jlblNomeDeUsuario.setText("Informe um nome de usuário:");

        jlblEmail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblEmail.setForeground(new java.awt.Color(204, 204, 204));
        jlblEmail.setText("Informe seu email:");

        jlblEmailConfirmacao.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblEmailConfirmacao.setForeground(new java.awt.Color(204, 204, 204));
        jlblEmailConfirmacao.setText("Confirme seu email:");

        jlblSenha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblSenha.setForeground(new java.awt.Color(204, 204, 204));
        jlblSenha.setText("Informe uma senha:");

        jlblSenhaConfirmacao.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblSenhaConfirmacao.setForeground(new java.awt.Color(204, 204, 204));
        jlblSenhaConfirmacao.setText("Confirme sua senha:");

        jlblRegrasDeSenha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlblRegrasDeSenha.setForeground(new java.awt.Color(204, 204, 204));
        jlblRegrasDeSenha.setText("* A senha deve conter ao menos 8 caracteres, uma letra maiúscula e um caractere especial.");

        jbtnCadastrarConta.setText("Cadastrar");

        jbtnCancelar.setText("Cancelar");

        jlblPerguntaSeguranca.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblPerguntaSeguranca.setForeground(new java.awt.Color(204, 204, 204));
        jlblPerguntaSeguranca.setText("Selecione uma pergunta de segurança:");

        jlblRespostaPerguntaSeguranca.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblRespostaPerguntaSeguranca.setForeground(new java.awt.Color(204, 204, 204));
        jlblRespostaPerguntaSeguranca.setText("Informe a resposta da pergunta:");

        jcbxPerguntaSeguranca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome do primeiro animal de estimação", "Nome da mãe", "Apelido de infância", "Primeira viagem de avião", "Nome da primeira escola" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblRegrasDeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlblNomeDeUsuario)
                                                .addComponent(jlblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlblSenha)
                                                    .addComponent(jlblEmailConfirmacao)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jlblPerguntaSeguranca)
                                                    .addComponent(jlblSenhaConfirmacao)
                                                    .addComponent(jlblRespostaPerguntaSeguranca))
                                                .addGap(3, 3, 3)))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jbtnCadastrarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEmailConfirmacao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jpfSenhaConfirmacao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbxPerguntaSeguranca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfRespostaPerguntaSeguranca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNomeDeUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEmailConfirmacao)
                    .addComponent(jtfEmailConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSenha)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSenhaConfirmacao)
                    .addComponent(jpfSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPerguntaSeguranca)
                    .addComponent(jcbxPerguntaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRespostaPerguntaSeguranca)
                    .addComponent(jtfRespostaPerguntaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnCadastrarConta))
                .addGap(39, 39, 39)
                .addComponent(jlblRegrasDeSenha)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCadastrarConta;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox<String> jcbxPerguntaSeguranca;
    private javax.swing.JLabel jlblEmail;
    private javax.swing.JLabel jlblEmailConfirmacao;
    private javax.swing.JLabel jlblNomeDeUsuario;
    private javax.swing.JLabel jlblPerguntaSeguranca;
    private javax.swing.JLabel jlblRegrasDeSenha;
    private javax.swing.JLabel jlblRespostaPerguntaSeguranca;
    private javax.swing.JLabel jlblSenha;
    private javax.swing.JLabel jlblSenhaConfirmacao;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JPasswordField jpfSenhaConfirmacao;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEmailConfirmacao;
    private javax.swing.JTextField jtfRespostaPerguntaSeguranca;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}