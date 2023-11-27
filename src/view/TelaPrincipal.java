package view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnReceita = new javax.swing.JMenu();
        mnCadastroReceita = new javax.swing.JMenuItem();
        mnConsultaReceita = new javax.swing.JMenuItem();
        mnDespesa = new javax.swing.JMenu();
        mnCadastroDespesa = new javax.swing.JMenuItem();
        mnConsultaDespesa = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnbtnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jMenu1.setText("Lançamentos");

        jMenuItem1.setText("Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed

    }//GEN-LAST:event_mnSairActionPerformed

    private void mnbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnbtnSairActionPerformed

    private void mnConsultaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaReceitaActionPerformed
        TelaConsultaReceita tlConsultaReceita = new TelaConsultaReceita();

        dispose();
        tlConsultaReceita.setVisible(true);
    }//GEN-LAST:event_mnConsultaReceitaActionPerformed

    private void mnCadastroReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroReceitaActionPerformed
        TelaCadastroReceita tlCadastroReceita = new TelaCadastroReceita();

        dispose();
        tlCadastroReceita.setVisible(true);

    }//GEN-LAST:event_mnCadastroReceitaActionPerformed

    private void mnCadastroDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroDespesaActionPerformed
        TelaCadastroDespesa tlCadastroDespesa = new TelaCadastroDespesa();

        dispose();
        tlCadastroDespesa.setVisible(true);
    }//GEN-LAST:event_mnCadastroDespesaActionPerformed

    private void mnConsultaDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaDespesaActionPerformed
        TelaConsultaDespesa tlConsultaDespesa = new TelaConsultaDespesa();

        dispose();
        tlConsultaDespesa.setVisible(true);
    }//GEN-LAST:event_mnConsultaDespesaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaConsultaLancamento tlConsultaLancamento = new TelaConsultaLancamento();

        dispose();
        tlConsultaLancamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnCadastroDespesa;
    private javax.swing.JMenuItem mnCadastroReceita;
    private javax.swing.JMenuItem mnConsultaDespesa;
    private javax.swing.JMenuItem mnConsultaReceita;
    private javax.swing.JMenu mnDespesa;
    private javax.swing.JMenu mnReceita;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnbtnSair;
    // End of variables declaration//GEN-END:variables
}
