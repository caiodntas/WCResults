/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcresults;

/**
 *
 * @author 822161401
 */
public class telaGerenciarAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form gerenciarTimes
     */
    
    public telaGerenciarAdministradores() {
        super ("Tela Gerenciar Times");
        initComponents();
        setLocationRelativeTo(null);
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
        confSenhaAdministradorTextField = new javax.swing.JTextField();
        cadastrarAdministradorButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        administradoresTable = new javax.swing.JTable();
        loginAdministradorTextField1 = new javax.swing.JTextField();
        senhaAdministradorTextField = new javax.swing.JTextField();
        gerenciarTimesMenuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        gerenciarTimesMenu = new javax.swing.JMenu();
        gerenciarAdmsMenu = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRAR ADMINISTRADOR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        confSenhaAdministradorTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confSenhaAdministradorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirme a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        confSenhaAdministradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confSenhaAdministradorTextFieldActionPerformed(evt);
            }
        });

        cadastrarAdministradorButton.setBackground(new java.awt.Color(153, 0, 0));
        cadastrarAdministradorButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cadastrarAdministradorButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarAdministradorButton.setText("CADASTRAR");
        cadastrarAdministradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdministradorButtonActionPerformed(evt);
            }
        });

        administradoresTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        administradoresTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        administradoresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ADMINISTRADORES CADASTRADOS", "SENHAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        administradoresTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        administradoresTable.setShowGrid(true);
        administradoresTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(administradoresTable);
        if (administradoresTable.getColumnModel().getColumnCount() > 0) {
            administradoresTable.getColumnModel().getColumn(0).setMinWidth(50);
            administradoresTable.getColumnModel().getColumn(0).setMaxWidth(50);
            administradoresTable.getColumnModel().getColumn(1).setMinWidth(200);
            administradoresTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        loginAdministradorTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginAdministradorTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        loginAdministradorTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdministradorTextField1ActionPerformed(evt);
            }
        });

        senhaAdministradorTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaAdministradorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira a senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        senhaAdministradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaAdministradorTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confSenhaAdministradorTextField)
                                    .addComponent(loginAdministradorTextField1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(senhaAdministradorTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(loginAdministradorTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(senhaAdministradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confSenhaAdministradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarAdministradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        gerenciarTimesMenuBar.setBackground(new java.awt.Color(204, 0, 0));
        gerenciarTimesMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gerenciarTimesMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarTimesMenuBar.setAutoscrolls(true);
        gerenciarTimesMenuBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarTimesMenuBar.setMaximumSize(new java.awt.Dimension(378, 400));
        gerenciarTimesMenuBar.setMinimumSize(new java.awt.Dimension(378, 50));
        gerenciarTimesMenuBar.setName(""); // NOI18N
        gerenciarTimesMenuBar.setOpaque(true);
        gerenciarTimesMenuBar.setPreferredSize(new java.awt.Dimension(378, 30));

        inicioMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        inicioMenu.setForeground(new java.awt.Color(255, 255, 255));
        inicioMenu.setText("Início");
        inicioMenu.setAlignmentX(1.0F);
        inicioMenu.setAlignmentY(1.0F);
        inicioMenu.setAutoscrolls(true);
        inicioMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inicioMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicioMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(inicioMenu);

        gerenciarTimesMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        gerenciarTimesMenu.setText("Gerenciar Times");
        gerenciarTimesMenu.setAlignmentX(1.0F);
        gerenciarTimesMenu.setAlignmentY(1.0F);
        gerenciarTimesMenu.setAutoscrolls(true);
        gerenciarTimesMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarTimesMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(gerenciarTimesMenu);

        gerenciarAdmsMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        gerenciarAdmsMenu.setText("Gerenciar Administradores");
        gerenciarAdmsMenu.setAlignmentX(1.0F);
        gerenciarAdmsMenu.setAlignmentY(1.0F);
        gerenciarAdmsMenu.setAutoscrolls(true);
        gerenciarAdmsMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarAdmsMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarAdmsMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerenciarAdmsMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(gerenciarAdmsMenu);

        loginMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        loginMenu.setText("Login Administrador");
        loginMenu.setAlignmentX(1.0F);
        loginMenu.setAlignmentY(1.0F);
        loginMenu.setAutoscrolls(true);
        loginMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(loginMenu);

        setJMenuBar(gerenciarTimesMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarAdministradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdministradorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarAdministradorButtonActionPerformed

    private void confSenhaAdministradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confSenhaAdministradorTextFieldActionPerformed

    }//GEN-LAST:event_confSenhaAdministradorTextFieldActionPerformed

    private void loginAdministradorTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdministradorTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAdministradorTextField1ActionPerformed

    private void senhaAdministradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaAdministradorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaAdministradorTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerenciarAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable administradoresTable;
    private javax.swing.JButton cadastrarAdministradorButton;
    private javax.swing.JTextField confSenhaAdministradorTextField;
    private javax.swing.JMenu gerenciarAdmsMenu;
    private javax.swing.JMenu gerenciarTimesMenu;
    private javax.swing.JMenuBar gerenciarTimesMenuBar;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField loginAdministradorTextField1;
    private javax.swing.JMenu loginMenu;
    private javax.swing.JTextField senhaAdministradorTextField;
    // End of variables declaration//GEN-END:variables
}
