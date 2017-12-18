/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.Adicao;
import classes.BaseJogo;
import classes.Multiplicacao;
import classes.Subtracao;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author welli
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    Adicao adicao;
    Subtracao sub;
    Multiplicacao mult;
    ArrayList<BaseJogo> lst = null;
    Timer timer = new Timer();
    
    public Game() {
        initComponents();
    }
    public Game(String op){
        initComponents();
        switch(op){
            case "+":
                lst = new ArrayList<>();
                adicao = new Adicao();
                lblOperacao.setText("+");
                lst.add(adicao); 
                break;
            case "-":
                lst = new ArrayList<>();
                sub = new Subtracao();
                lst.add(sub);
                lblOperacao.setText("-");
                break;
            case "x":
                lst = new ArrayList<>();
                mult = new Multiplicacao();
                lblOperacao.setText("x");
                lst.add(mult);
                break;
            default:
                break;
        }
        class Incrementar extends TimerTask{ // responsavel por incrementar a barra;
                public Incrementar(){}
                @Override
                public void run(){
                String s = lst.get(0).incrementaBarra();
                lblBarra.setText(s);
                lst.get(0).fimDeJogo();
                if (s.contains(" ")){timer.cancel();btnResposta.setEnabled(false);}
                
                
            }
                
        }
        timer.schedule(new Incrementar(), 0,1200);  // a classe de incrementar a barra é chamada a cada 1,2 segs;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblOperacao = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        btnResposta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblAcertos = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblErros = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Barra");

        lblBarra.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblBarra.setText("jLabel2");

        lblNum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblNum1.setText("jLabel2");

        lblOperacao.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblOperacao.setText("jLabel2");

        lblNum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblNum2.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Resposta");

        txtResposta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtResposta.setMaximumSize(new java.awt.Dimension(10000, 10000));
        txtResposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespostaKeyTyped(evt);
            }
        });

        btnResposta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnResposta.setText("Confirmar");
        btnResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespostaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Acertos");

        lblAcertos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblAcertos.setForeground(new java.awt.Color(51, 204, 0));
        lblAcertos.setText("0");

        lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lbl.setText("Erros");

        lblErros.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblErros.setForeground(new java.awt.Color(255, 51, 51));
        lblErros.setText("0");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Trabalho de LP3");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("Nível");

        lblNivel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblNivel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBarra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOperacao)
                                    .addComponent(lblNum2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNum1)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAcertos)
                            .addComponent(lblErros)
                            .addComponent(lblNivel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblBarra))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(jLabel3)
                    .addComponent(lblAcertos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblOperacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(lblNum2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(btnResposta)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(lblErros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblNivel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespostaActionPerformed
        
        try {
            int i = Integer.parseInt(txtResposta.getText());
            boolean resposta = lst.get(0).getResult(i);
            if (resposta){
                lst.get(0).decrementaBarra();
                lblNum1.setText(Integer.toString(lst.get(0).getNum1()));
                lblNum2.setText(Integer.toString(lst.get(0).getNum2()));
                lblAcertos.setText(Integer.toString(lst.get(0).getAcertos()));
                lblNivel.setText(Integer.toString(lst.get(0).getNivel()));
                txtResposta.setText("");
            }
            else{
                lst.get(0).setErros();
                txtResposta.setText("");
                lblErros.setText(Integer.toString(lst.get(0).getErros()));
            }
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Resposta deve ser um numero inteiro");
            txtResposta.setText("");
        }
        txtResposta.requestFocus();
    }//GEN-LAST:event_btnRespostaActionPerformed
    
    // inicia o formulario já com alguns valores;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lblNum1.setText(Integer.toString(lst.get(0).getNum1()));
        lblNum2.setText(Integer.toString(lst.get(0).getNum2()));  
        lblNivel.setText(Integer.toString(lst.get(0).getNivel()));
    }//GEN-LAST:event_formWindowActivated

    private void txtRespostaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespostaKeyTyped
        if (txtResposta.getText().length() > 5){
            evt.consume();
        }
    }//GEN-LAST:event_txtRespostaKeyTyped

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JTextField txtResposta;
    // End of variables declaration//GEN-END:variables
}
