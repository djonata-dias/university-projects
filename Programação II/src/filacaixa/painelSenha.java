package filacaixa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class painelSenha extends javax.swing.JFrame {

    List<Senha> listaSenha;
    int numeroSenha;

    public painelSenha() {
        initComponents();
        numeroSenha = 0;
        listaSenha = new ArrayList<Senha>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        telaSenha = new java.awt.Label();
        telaCaixa = new java.awt.Label();
        painelSenha = new javax.swing.JPanel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        senhaEscolhida = new java.awt.Label();
        btnSenhaRapida = new javax.swing.JButton();
        btnSenhaPrioritaria = new javax.swing.JButton();
        btnSenhaComum = new javax.swing.JButton();
        painelCaixa = new javax.swing.JPanel();
        btnCaixa2 = new javax.swing.JButton();
        btnCaixa3 = new javax.swing.JButton();
        btnCaixa4 = new javax.swing.JButton();
        btnCaixa1 = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 93, 93));

        telaSenha.setAlignment(java.awt.Label.CENTER);
        telaSenha.setBackground(new java.awt.Color(93, 93, 93));
        telaSenha.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        telaSenha.setForeground(new java.awt.Color(1, 1, 1));

        telaCaixa.setAlignment(java.awt.Label.CENTER);
        telaCaixa.setBackground(new java.awt.Color(93, 93, 93));
        telaCaixa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        telaCaixa.setForeground(new java.awt.Color(1, 1, 1));
        telaCaixa.setPreferredSize(new java.awt.Dimension(100, 100));

        painelSenha.setBackground(new java.awt.Color(254, 254, 254));

        texto3.setForeground(new java.awt.Color(1, 1, 1));
        texto3.setText("Escolha seu tipo de atendimento");

        texto4.setForeground(new java.awt.Color(1, 1, 1));
        texto4.setText("Sua senha é:");

        senhaEscolhida.setAlignment(java.awt.Label.CENTER);
        senhaEscolhida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnSenhaRapida.setText("Rápido");
        btnSenhaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaRapidaActionPerformed(evt);
            }
        });

        btnSenhaPrioritaria.setText("Prioritário");
        btnSenhaPrioritaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaPrioritariaActionPerformed(evt);
            }
        });

        btnSenhaComum.setText("Comum");
        btnSenhaComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaComumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSenhaLayout = new javax.swing.GroupLayout(painelSenha);
        painelSenha.setLayout(painelSenhaLayout);
        painelSenhaLayout.setHorizontalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaLayout.createSequentialGroup()
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhaEscolhida, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelSenhaLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelSenhaLayout.createSequentialGroup()
                                    .addComponent(btnSenhaComum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSenhaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSenhaPrioritaria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(texto3)))
                        .addGroup(painelSenhaLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(texto4))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        painelSenhaLayout.setVerticalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(texto3)
                .addGap(18, 18, 18)
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSenhaComum, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnSenhaRapida, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnSenhaPrioritaria, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(texto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaEscolhida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        painelCaixa.setBackground(new java.awt.Color(254, 254, 254));

        btnCaixa2.setText("Caixa 2");
        btnCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa2ActionPerformed(evt);
            }
        });

        btnCaixa3.setText("Caixa 3");
        btnCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa3ActionPerformed(evt);
            }
        });

        btnCaixa4.setText("Caixa 4");
        btnCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa4ActionPerformed(evt);
            }
        });

        btnCaixa1.setText("Caixa 1");
        btnCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCaixaLayout = new javax.swing.GroupLayout(painelCaixa);
        painelCaixa.setLayout(painelCaixaLayout);
        painelCaixaLayout.setHorizontalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCaixaLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCaixaLayout.createSequentialGroup()
                        .addComponent(btnCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCaixaLayout.createSequentialGroup()
                        .addComponent(btnCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelCaixaLayout.setVerticalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        texto1.setText("Para cliente:");

        texto2.setText("Para caixas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto1)
                            .addComponent(painelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(telaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telaCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(280, 280, 280)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1)
                    .addComponent(texto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSenhaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaRapidaActionPerformed
        numeroSenha++;
        Senha senhaRapida = new Senha("R", numeroSenha);
        listaSenha.add(senhaRapida);
        senhaEscolhida.setText(senhaRapida.toString());
    }//GEN-LAST:event_btnSenhaRapidaActionPerformed

    private void btnSenhaPrioritariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaPrioritariaActionPerformed
        numeroSenha++;
        Senha senhaPrioritaria = new Senha("P", numeroSenha);
        listaSenha.add(senhaPrioritaria);
        senhaEscolhida.setText(String.valueOf(senhaPrioritaria.toString()));
    }//GEN-LAST:event_btnSenhaPrioritariaActionPerformed

    private void btnSenhaComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaComumActionPerformed
        numeroSenha++;
        Senha senhaComum = new Senha("C", numeroSenha);
        listaSenha.add(senhaComum);
        senhaEscolhida.setText(senhaComum.toString());
    }//GEN-LAST:event_btnSenhaComumActionPerformed

    private void btnCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa2ActionPerformed
        telaCaixa.setText("Caixa 2");
        telaSenha.setText("");

        for (Senha senha : listaSenha) {
            if (senha.getTipo().equals("R")) {
                listaSenha.remove(senha);
                telaSenha.setText(String.valueOf(senha.toString()));
                return;
            }
        }
        for (Senha senha : listaSenha) {
            listaSenha.remove(senha);
            telaSenha.setText(String.valueOf(senha.toString()));
            break;
        }
    }//GEN-LAST:event_btnCaixa2ActionPerformed

    private void btnCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa3ActionPerformed
        telaCaixa.setText("Caixa 3");
        telaSenha.setText("");

        for (Senha senha : listaSenha) {
            if (senha.getTipo().equals("R")) {
                listaSenha.remove(senha);
                telaSenha.setText(String.valueOf(senha.toString()));
                return;
            }
        }
        for (Senha senha : listaSenha) {
            listaSenha.remove(senha);
            telaSenha.setText(String.valueOf(senha.toString()));
            break;
        }
    }//GEN-LAST:event_btnCaixa3ActionPerformed

    private void btnCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa4ActionPerformed
        telaCaixa.setText("Caixa 4");
        telaSenha.setText("");

        for (Senha senha : listaSenha) {
            if (senha.getTipo().equals("C")) {
                listaSenha.remove(senha);
                telaSenha.setText(String.valueOf(senha.toString()));
                return;
            }
        }
        for (Senha senha : listaSenha) {
            listaSenha.remove(senha);
            telaSenha.setText(String.valueOf(senha.toString()));
            break;
        }
    }//GEN-LAST:event_btnCaixa4ActionPerformed

    private void btnCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa1ActionPerformed
        telaCaixa.setText("Caixa 1");
        telaSenha.setText("");

        for (Senha senha : listaSenha) {
            if (senha.getTipo().equals("P")) {
                listaSenha.remove(senha);
                telaSenha.setText(String.valueOf(senha.toString()));
                return;
            }
        }
        for (Senha senha : listaSenha) {
            listaSenha.remove(senha);
            telaSenha.setText(String.valueOf(senha.toString()));
            break;
        }
    }//GEN-LAST:event_btnCaixa1ActionPerformed

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
            java.util.logging.Logger.getLogger(painelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(painelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(painelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(painelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new painelSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa1;
    private javax.swing.JButton btnCaixa2;
    private javax.swing.JButton btnCaixa3;
    private javax.swing.JButton btnCaixa4;
    private javax.swing.JButton btnSenhaComum;
    private javax.swing.JButton btnSenhaPrioritaria;
    private javax.swing.JButton btnSenhaRapida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelCaixa;
    private javax.swing.JPanel painelSenha;
    private java.awt.Label senhaEscolhida;
    private java.awt.Label telaCaixa;
    private java.awt.Label telaSenha;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables
}
