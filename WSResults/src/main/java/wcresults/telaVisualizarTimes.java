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
public class telaVisualizarTimes extends javax.swing.JFrame {

    /**
     * Creates new form gerenciarTimes
     */
    
    public telaVisualizarTimes() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        timesTable = new javax.swing.JTable();
        gerenciarTimesMenuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        gerenciarTimesMenu = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WC Results");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        timesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timesTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME DO TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        timesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(timesTable);
        if (timesTable.getColumnModel().getColumnCount() > 0) {
            timesTable.getColumnModel().getColumn(0).setMinWidth(50);
            timesTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        gerenciarTimesMenuBar.setBackground(new java.awt.Color(204, 0, 0));
        gerenciarTimesMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gerenciarTimesMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarTimesMenuBar.setAutoscrolls(true);
        gerenciarTimesMenuBar.setMaximumSize(new java.awt.Dimension(378, 400));
        gerenciarTimesMenuBar.setMinimumSize(new java.awt.Dimension(378, 50));
        gerenciarTimesMenuBar.setName(""); // NOI18N
        gerenciarTimesMenuBar.setOpaque(true);
        gerenciarTimesMenuBar.setPreferredSize(new java.awt.Dimension(500, 30));

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
        gerenciarTimesMenu.setText("Visualizar Times");
        gerenciarTimesMenu.setAlignmentX(1.0F);
        gerenciarTimesMenu.setAlignmentY(1.0F);
        gerenciarTimesMenu.setAutoscrolls(true);
        gerenciarTimesMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerenciarTimesMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerenciarTimesMenu.setMargin(new java.awt.Insets(6, 6, 6, 6));
        gerenciarTimesMenuBar.add(gerenciarTimesMenu);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(telaVisualizarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaVisualizarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaVisualizarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaVisualizarTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaVisualizarTimes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu gerenciarTimesMenu;
    private javax.swing.JMenuBar gerenciarTimesMenuBar;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu loginMenu;
    private javax.swing.JTable timesTable;
    // End of variables declaration//GEN-END:variables
}