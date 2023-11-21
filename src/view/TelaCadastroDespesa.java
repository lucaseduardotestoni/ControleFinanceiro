/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Lucas.Testoni
 */
public class TelaCadastroDespesa extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDespesa
     */
    public TelaCadastroDespesa() {
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

        btnLimparDespesa = new javax.swing.JButton();
        btnCadastrarDespesa = new javax.swing.JButton();
        txtValorDespesa = new javax.swing.JTextField();
        lblValorDespesa = new javax.swing.JLabel();
        lblTitleDespesa = new javax.swing.JLabel();
        lblDataDespesa = new javax.swing.JLabel();
        txtDataDespesa = new javax.swing.JTextField();
        lblTipoDespesa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoDespesa = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnReceita = new javax.swing.JMenu();
        mnCadastroReceita = new javax.swing.JMenuItem();
        mnConsultaReceita = new javax.swing.JMenuItem();
        mnDespesa = new javax.swing.JMenu();
        mnCadastroDespesa = new javax.swing.JMenuItem();
        mnConsultaDespesa = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnbtnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimparDespesa.setBackground(new java.awt.Color(102, 102, 102));
        btnLimparDespesa.setFont(new java.awt.Font("GalanoGrotesque-Medium", 0, 12)); // NOI18N
        btnLimparDespesa.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparDespesa.setText("Limpar");
        btnLimparDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDespesaActionPerformed(evt);
            }
        });

        btnCadastrarDespesa.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrarDespesa.setFont(new java.awt.Font("GalanoGrotesque-Medium", 0, 12)); // NOI18N
        btnCadastrarDespesa.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarDespesa.setText("Cadastrar");
        btnCadastrarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDespesaActionPerformed(evt);
            }
        });

        txtValorDespesa.setText("0,00");

        lblValorDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblValorDespesa.setText("Valor:");

        lblTitleDespesa.setFont(new java.awt.Font("GalanoGrotesqueDEMO-Bold", 0, 24)); // NOI18N
        lblTitleDespesa.setForeground(new java.awt.Color(204, 0, 0));
        lblTitleDespesa.setText("Cadastro de Despesa");

        lblDataDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblDataDespesa.setText("Data");

        txtDataDespesa.setText("10/10/2000");
        txtDataDespesa.setToolTipText("10/10/2000");
        txtDataDespesa.setFocusable(false);

        lblTipoDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblTipoDespesa.setText("Tipo de Receita:");

        tblTipoDespesa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tblTipoDespesa);

        mnReceita.setText("Receita");

        mnCadastroReceita.setText("Cadastro");
        mnCadastroReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastroReceitaActionPerformed(evt);
            }
        });
        mnReceita.add(mnCadastroReceita);

        mnConsultaReceita.setText("Consulta");
        mnConsultaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaReceitaActionPerformed(evt);
            }
        });
        mnReceita.add(mnConsultaReceita);

        jMenuBar1.add(mnReceita);

        mnDespesa.setText("Despesa");

        mnCadastroDespesa.setText("Casdastro");
        mnCadastroDespesa.setEnabled(false);
        mnCadastroDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastroDespesaActionPerformed(evt);
            }
        });
        mnDespesa.add(mnCadastroDespesa);

        mnConsultaDespesa.setText("Consulta");
        mnConsultaDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaDespesaActionPerformed(evt);
            }
        });
        mnDespesa.add(mnConsultaDespesa);

        jMenuBar1.add(mnDespesa);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        mnbtnSair.setText("Sair");
        mnbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbtnSairActionPerformed(evt);
            }
        });
        mnSair.add(mnbtnSair);

        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitleDespesa)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimparDespesa)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarDespesa)
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorDespesa)
                    .addComponent(lblDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDespesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitleDespesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDespesa)
                    .addComponent(txtValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTipoDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDespesa)
                    .addComponent(txtDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparDespesa)
                    .addComponent(btnCadastrarDespesa))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDespesaActionPerformed
        txtDataDespesa.setText("");
        txtValorDespesa.setText("");
        tblTipoDespesa.clearSelection();
    }//GEN-LAST:event_btnLimparDespesaActionPerformed

    private void btnCadastrarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarDespesaActionPerformed

    private void mnCadastroReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroReceitaActionPerformed
        TelaCadastroReceita tlCadastroReceita = new TelaCadastroReceita();
        //Fecha a tela Atual
        dispose();
        tlCadastroReceita.setVisible(true);

    }//GEN-LAST:event_mnCadastroReceitaActionPerformed

    private void mnConsultaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaReceitaActionPerformed
        TelaConsultaReceita tlConsultaReceita = new TelaConsultaReceita();
        dispose();
        tlConsultaReceita.setVisible(true);
    }//GEN-LAST:event_mnConsultaReceitaActionPerformed

    private void mnCadastroDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroDespesaActionPerformed
        TelaCadastroDespesa tlCadastroDespesa = new TelaCadastroDespesa();
        //Fecha a tela Atual
        dispose();
        tlCadastroDespesa.setVisible(true);
    }//GEN-LAST:event_mnCadastroDespesaActionPerformed

    private void mnConsultaDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaDespesaActionPerformed
        TelaConsultaDespesa tlConsultaDespesa = new TelaConsultaDespesa();
        //Fecha a tela Atual
        dispose();
        tlConsultaDespesa.setVisible(true);
    }//GEN-LAST:event_mnConsultaDespesaActionPerformed

    private void mnbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnbtnSairActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed

    }//GEN-LAST:event_mnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDespesa;
    private javax.swing.JButton btnLimparDespesa;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataDespesa;
    private javax.swing.JLabel lblTipoDespesa;
    private javax.swing.JLabel lblTitleDespesa;
    private javax.swing.JLabel lblValorDespesa;
    private javax.swing.JMenuItem mnCadastroDespesa;
    private javax.swing.JMenuItem mnCadastroReceita;
    private javax.swing.JMenuItem mnConsultaDespesa;
    private javax.swing.JMenuItem mnConsultaReceita;
    private javax.swing.JMenu mnDespesa;
    private javax.swing.JMenu mnReceita;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnbtnSair;
    private javax.swing.JList<String> tblTipoDespesa;
    private javax.swing.JTextField txtDataDespesa;
    private javax.swing.JTextField txtValorDespesa;
    // End of variables declaration//GEN-END:variables
}
