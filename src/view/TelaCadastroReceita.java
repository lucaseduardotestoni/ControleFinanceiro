package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Enums.CategoriaReceita;
import model.Conta;
import model.Receita;

public class TelaCadastroReceita extends javax.swing.JFrame {

    Conta conta = new Conta();
    public TelaCadastroReceita() {
        initComponents();
        for(CategoriaReceita categoria : CategoriaReceita.values()){
            tipoReceita.addItem(categoria.name());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimparReceita = new javax.swing.JButton();
        btnCadastrarReceita = new javax.swing.JButton();
        valorReceita = new javax.swing.JTextField();
        lblValorReceita = new javax.swing.JLabel();
        lblTitleReceita = new javax.swing.JLabel();
        lblDataReceita = new javax.swing.JLabel();
        lblTipoReceita = new javax.swing.JLabel();
        tipoReceita = new javax.swing.JComboBox<>();
        dataReceita = new javax.swing.JTextField();
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

        btnLimparReceita.setBackground(new java.awt.Color(102, 102, 102));
        btnLimparReceita.setFont(new java.awt.Font("GalanoGrotesque-Medium", 0, 12)); // NOI18N
        btnLimparReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparReceita.setText("Limpar");
        btnLimparReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparReceitaActionPerformed(evt);
            }
        });

        btnCadastrarReceita.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrarReceita.setFont(new java.awt.Font("GalanoGrotesque-Medium", 0, 12)); // NOI18N
        btnCadastrarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarReceita.setText("Cadastrar");
        btnCadastrarReceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarReceitaMouseClicked(evt);
            }
        });
        btnCadastrarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarReceitaActionPerformed(evt);
            }
        });

        valorReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorReceitaActionPerformed(evt);
            }
        });

        lblValorReceita.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblValorReceita.setText("Valor:");

        lblTitleReceita.setFont(new java.awt.Font("GalanoGrotesqueDEMO-Bold", 0, 24)); // NOI18N
        lblTitleReceita.setForeground(new java.awt.Color(0, 153, 0));
        lblTitleReceita.setText("Cadastro de Receita");

        lblDataReceita.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblDataReceita.setText("Data");

        lblTipoReceita.setFont(new java.awt.Font("GalanoGrotesque-ExtraLight", 0, 12)); // NOI18N
        lblTipoReceita.setText("Tipo de Receita:");

        tipoReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoReceitaActionPerformed(evt);
            }
        });

        dataReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataReceitaActionPerformed(evt);
            }
        });

        mnReceita.setText("Receita");

        mnCadastroReceita.setText("Cadastro");
        mnCadastroReceita.setEnabled(false);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnLimparReceita)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarReceita))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitleReceita)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorReceita)
                                .addGap(18, 18, 18)
                                .addComponent(valorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDataReceita)
                                    .addComponent(lblTipoReceita))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitleReceita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorReceita)
                    .addComponent(valorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoReceita)
                    .addComponent(tipoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataReceita)
                    .addComponent(dataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparReceita)
                    .addComponent(btnCadastrarReceita))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparReceitaActionPerformed
        valorReceita.setText("");
        dataReceita.setText("");
    }//GEN-LAST:event_btnLimparReceitaActionPerformed

    private void btnCadastrarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarReceitaActionPerformed

    }//GEN-LAST:event_btnCadastrarReceitaActionPerformed

    private void valorReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorReceitaActionPerformed

    }//GEN-LAST:event_valorReceitaActionPerformed

    private void btnCadastrarReceitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarReceitaMouseClicked
        Receita receita = new Receita();
        
        if(tipoReceita.getSelectedItem() == null || dataReceita.getText().trim().equals("") || valorReceita.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this.rootPane,"Preencha todos os campos");
        }else{
            receita.setCategoria(CategoriaReceita.valueOf((String)tipoReceita.getSelectedItem().toString().toUpperCase()));
            receita.setValor(Double.parseDouble(valorReceita.getText()));
            String dataTexto = dataReceita.getText();
            SimpleDateFormat formatoData = new SimpleDateFormat("MM/dd/yyyy");
            try {
                Date data = formatoData.parse(dataTexto);
                receita.setData(data);
            } catch (ParseException e) {
                e.printStackTrace();
            }            
            JOptionPane.showMessageDialog(this.rootPane,"Receita cadastrada com sucesso!");
            dataReceita.setText("");
            valorReceita.setText("");
        }
        conta.cadastrarReceita(receita);
    }//GEN-LAST:event_btnCadastrarReceitaMouseClicked

    private void tipoReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoReceitaActionPerformed

    }//GEN-LAST:event_tipoReceitaActionPerformed

    private void dataReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataReceitaActionPerformed

    }//GEN-LAST:event_dataReceitaActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroReceita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarReceita;
    private javax.swing.JButton btnLimparReceita;
    private javax.swing.JTextField dataReceita;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblDataReceita;
    private javax.swing.JLabel lblTipoReceita;
    private javax.swing.JLabel lblTitleReceita;
    private javax.swing.JLabel lblValorReceita;
    private javax.swing.JMenuItem mnCadastroDespesa;
    private javax.swing.JMenuItem mnCadastroReceita;
    private javax.swing.JMenuItem mnConsultaDespesa;
    private javax.swing.JMenuItem mnConsultaReceita;
    private javax.swing.JMenu mnDespesa;
    private javax.swing.JMenu mnReceita;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mnbtnSair;
    private javax.swing.JComboBox<String> tipoReceita;
    private javax.swing.JTextField valorReceita;
    // End of variables declaration//GEN-END:variables
}
