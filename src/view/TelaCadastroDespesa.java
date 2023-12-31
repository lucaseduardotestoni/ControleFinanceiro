package view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Enums.CategoriaDespesa;
import model.Conta;
import model.Despesa;

public class TelaCadastroDespesa extends javax.swing.JFrame {

    private LocalDate dataAtual = LocalDate.now();

    Conta conta = new Conta();

    public TelaCadastroDespesa() {

        initComponents();
        for (CategoriaDespesa categoria : CategoriaDespesa.values()) {
            tipoDespesa.addItem(categoria.name());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimparDespesa = new javax.swing.JButton();
        btnCadastrarDespesa = new javax.swing.JButton();
        valorDespesa = new javax.swing.JTextField();
        lblValorDespesa = new javax.swing.JLabel();
        lblTitleDespesa = new javax.swing.JLabel();
        lblDataDespesa = new javax.swing.JLabel();
        lblTipoDespesa = new javax.swing.JLabel();
        tipoDespesa = new javax.swing.JComboBox<>();
        dataDespesa = new javax.swing.JTextField();
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
        btnCadastrarDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarDespesaMouseClicked(evt);
            }
        });
        btnCadastrarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDespesaActionPerformed(evt);
            }
        });

        lblValorDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblValorDespesa.setText("Valor:");

        lblTitleDespesa.setFont(new java.awt.Font("GalanoGrotesqueDEMO-Bold", 0, 24)); // NOI18N
        lblTitleDespesa.setForeground(new java.awt.Color(204, 0, 0));
        lblTitleDespesa.setText("Cadastro de Despesa");

        lblDataDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblDataDespesa.setText("Data");

        lblTipoDespesa.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblTipoDespesa.setText("Tipo de Receita:");

        tipoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDespesaActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblValorDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitleDespesa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparDespesa)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarDespesa))
                    .addComponent(lblDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDespesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorDespesa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valorDespesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDespesa)
                    .addComponent(tipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDespesa)
                    .addComponent(dataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarDespesa)
                    .addComponent(btnLimparDespesa))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDespesaActionPerformed
        dataDespesa.setText("");
        valorDespesa.setText("");
    }//GEN-LAST:event_btnLimparDespesaActionPerformed

    private void btnCadastrarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDespesaActionPerformed

    }//GEN-LAST:event_btnCadastrarDespesaActionPerformed

    private void btnCadastrarDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarDespesaMouseClicked
        Despesa despesa = new Despesa();

        if (tipoDespesa.getSelectedItem() == null || dataDespesa.getText().trim().equals("") || valorDespesa.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this.rootPane, "Preencha todos os campos");
        } else {
            despesa.setCategoria(CategoriaDespesa.valueOf(tipoDespesa.getSelectedItem().toString().toUpperCase()));
            despesa.setValor(Double.parseDouble(valorDespesa.getText()));
            String dataTexto = dataDespesa.getText();
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date data = formatoData.parse(dataTexto);
                despesa.setData(data);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this.rootPane, "Despesa cadastrada com sucesso!");
            dataDespesa.setText("");
            valorDespesa.setText("");
        }
        conta.cadastrarDespesa(despesa);

    }//GEN-LAST:event_btnCadastrarDespesaMouseClicked

    private void tipoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDespesaActionPerformed

    }//GEN-LAST:event_tipoDespesaActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDespesa().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDespesa;
    private javax.swing.JButton btnLimparDespesa;
    private javax.swing.JTextField dataDespesa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
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
    private javax.swing.JComboBox<String> tipoDespesa;
    private javax.swing.JTextField valorDespesa;
    // End of variables declaration//GEN-END:variables
}
