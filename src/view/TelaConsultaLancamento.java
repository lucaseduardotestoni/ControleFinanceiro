package view;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Conta;
import model.Despesa;
import model.Lancamento;
import model.Receita;

public class TelaConsultaLancamento extends javax.swing.JFrame {

    public TelaConsultaLancamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleReceita = new javax.swing.JLabel();
        btnSelectListLancamento = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLancamento = new javax.swing.JTable();
        txtSaldoAtual = new java.awt.Label();
        btnSaldoAtual = new javax.swing.JButton();
        btnSaldoTotal = new javax.swing.JButton();
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
        setMaximumSize(new java.awt.Dimension(2147, 2147483647));
        setResizable(false);

        lblTitleReceita.setFont(new java.awt.Font("GalanoGrotesqueDEMO-Bold", 0, 24)); // NOI18N
        lblTitleReceita.setForeground(new java.awt.Color(0, 153, 0));
        lblTitleReceita.setText("Consulta Lancamentos");

        btnSelectListLancamento.setFont(new java.awt.Font("GalanoGrotesque-Light", 0, 12)); // NOI18N
        btnSelectListLancamento.setText("Listar todos os Lançamentos");
        btnSelectListLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectListLancamentoActionPerformed(evt);
            }
        });

        tblLancamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Lançamento", "Valor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLancamento);

        txtSaldoAtual.setFont(new java.awt.Font("GalanoGrotesque-Medium", 0, 14)); // NOI18N

        btnSaldoAtual.setFont(new java.awt.Font("GalanoGrotesque-Light", 0, 12)); // NOI18N
        btnSaldoAtual.setText("Saldo Atual");
        btnSaldoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoAtualActionPerformed(evt);
            }
        });

        btnSaldoTotal.setFont(new java.awt.Font("GalanoGrotesque-Light", 0, 12)); // NOI18N
        btnSaldoTotal.setText("Saldo Total");
        btnSaldoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoTotalActionPerformed(evt);
            }
        });

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

        mnCadastroDespesa.setText("Cadastro");
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
        jMenuItem1.setEnabled(false);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTitleReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnSelectListLancamento)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldoAtual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSaldoAtual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaldoTotal)
                                .addGap(112, 112, 112)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelectListLancamento)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaldoTotal)
                    .addComponent(btnSaldoAtual))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectListLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectListLancamentoActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLancamento.getModel();
        model.setNumRows(0);

        Conta conta = new Conta();
        List<Lancamento> listarLancamentos = conta.listarLancamentos();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        String categoria = "";
        if (!listarLancamentos.isEmpty()) {
            for (Lancamento listarLancamento : listarLancamentos) {
                String[] dadosDespesa = listarLancamento.toString().split(";");

                switch (dadosDespesa[0]) {
                    case "ALIMENTACAO": {
                        categoria = "Alimentação";
                        break;
                    }
                    case "TRANSPORTE": {
                        categoria = "Transporte";
                        break;
                    }
                    case "RESIDENCIA": {
                        categoria = "Residência";
                        break;
                    }
                    case "SAUDE": {
                        categoria = "Saúde";
                        break;
                    }
                    case "EDUCACAO": {
                        categoria = "Educação";
                        break;
                    }
                    case "ENTRETENIMENTO": {
                        categoria = "Entreterimento";
                        break;
                    }
                    case "OUTRAS": {
                        categoria = "Outras";
                        break;
                    }
                    case "SALARIO": {
                        categoria = "Salário";
                        break;
                    }
                    case "DECIMO_TERCEIRO": {
                        categoria = "Transporte";
                        break;
                    }
                    case "FERIAS": {
                        categoria = "Ferias";
                        break;
                    }
                }
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    categoria, df.format(Double.parseDouble((dadosDespesa[1]))), sdf.format(new Date(dadosDespesa[2]))});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lançamento inexistente - Verifique.");
            model.setNumRows(0);
        }
    }//GEN-LAST:event_btnSelectListLancamentoActionPerformed

    private void mnCadastroReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroReceitaActionPerformed
        TelaCadastroReceita tlCadastroReceita = new TelaCadastroReceita();

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

    private void mnbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnbtnSairActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed

    }//GEN-LAST:event_mnSairActionPerformed

    private void btnSaldoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoAtualActionPerformed
        Conta conta = new Conta();
        double saldo = conta.consultarSaldoAtual();
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        txtSaldoAtual.setText("O saldo Atual é de " + df.format(saldo));

    }//GEN-LAST:event_btnSaldoAtualActionPerformed

    private void btnSaldoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoTotalActionPerformed
        Conta conta = new Conta();
        double saldo = conta.consultarSaldoTotal();
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        txtSaldoAtual.setText("O saldo Total é de " + df.format(saldo));
    }//GEN-LAST:event_btnSaldoTotalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaLancamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaldoAtual;
    private javax.swing.JButton btnSaldoTotal;
    private javax.swing.JRadioButton btnSelectListLancamento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitleReceita;
    private javax.swing.JMenuItem mnCadastroDespesa;
    private javax.swing.JMenuItem mnCadastroReceita;
    private javax.swing.JMenuItem mnConsultaDespesa;
    private javax.swing.JMenuItem mnConsultaReceita;
    private javax.swing.JMenu mnDespesa;
    private javax.swing.JMenu mnReceita;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnbtnSair;
    private javax.swing.JTable tblLancamento;
    private java.awt.Label txtSaldoAtual;
    // End of variables declaration//GEN-END:variables
}
