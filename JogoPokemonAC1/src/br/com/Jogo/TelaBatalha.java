/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Jogo;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gusta
 */
public class TelaBatalha extends javax.swing.JFrame {

    private int vidaPokemon = 100;
    int i = 0;
    
    public TelaBatalha() {
        
        // as linhas abaixos servem para mudar a cor da barra de Progresso 
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        
        vidaPokemon1.setValue(vidaBlas());
        vidaPokemon2.setValue(vidaChar());

    }
    public int vidaBlas() {
        
        return vidaPokemon;
    }

    public int vidaChar() {

        return vidaPokemon;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        vidaPokemon2 = new javax.swing.JProgressBar();
        pokemon2Nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pokemon2Level = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        vidaPokemon1 = new javax.swing.JProgressBar();
        pokemon1Nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pokemon1Level = new javax.swing.JLabel();
        DesktopPk1 = new javax.swing.JDesktopPane();
        atk1Blas = new javax.swing.JButton();
        atk1Char = new javax.swing.JButton();
        atk2Blas = new javax.swing.JButton();
        atk2Char = new javax.swing.JButton();
        desktopTela = new javax.swing.JLabel();
        turnoPokemon = new javax.swing.JLabel();
        pokemon2 = new javax.swing.JLabel();
        pokemon1 = new javax.swing.JLabel();
        telaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vidaPokemon2.setBackground(new java.awt.Color(153, 153, 153));
        vidaPokemon2.setForeground(new java.awt.Color(153, 0, 0));

        pokemon2Nome.setText("Charizard");

        jLabel2.setText("Level : ");

        pokemon2Level.setText("10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(vidaPokemon2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pokemon2Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon2Level, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(vidaPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokemon2Nome)
                    .addComponent(jLabel2)
                    .addComponent(pokemon2Level))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(370, 0, 220, 50);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vidaPokemon1.setBackground(new java.awt.Color(153, 153, 153));
        vidaPokemon1.setForeground(new java.awt.Color(153, 0, 0));

        pokemon1Nome.setText("Blastoise");

        jLabel3.setText("Level : ");

        pokemon1Level.setText("10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pokemon1Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon1Level))
            .addComponent(vidaPokemon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(vidaPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(pokemon1Level))
                    .addComponent(pokemon1Nome))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 230, 50);

        atk1Blas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atk1Blas.setForeground(new java.awt.Color(255, 255, 255));
        atk1Blas.setText("Skull Bash");
        atk1Blas.setContentAreaFilled(false);
        atk1Blas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atk1Blas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atk1BlasMouseClicked(evt);
            }
        });
        atk1Blas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk1BlasActionPerformed(evt);
            }
        });
        DesktopPk1.add(atk1Blas);
        atk1Blas.setBounds(10, 10, 110, 35);

        atk1Char.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atk1Char.setForeground(new java.awt.Color(255, 255, 255));
        atk1Char.setText("Air Slash");
        atk1Char.setContentAreaFilled(false);
        atk1Char.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atk1Char.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk1CharActionPerformed(evt);
            }
        });
        DesktopPk1.add(atk1Char);
        atk1Char.setBounds(140, 9, 110, 35);

        atk2Blas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atk2Blas.setForeground(new java.awt.Color(255, 255, 255));
        atk2Blas.setText("Hydro Pump");
        atk2Blas.setAlignmentY(0.0F);
        atk2Blas.setAutoscrolls(true);
        atk2Blas.setContentAreaFilled(false);
        atk2Blas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atk2Blas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk2BlasActionPerformed(evt);
            }
        });
        DesktopPk1.add(atk2Blas);
        atk2Blas.setBounds(10, 50, 110, 35);

        atk2Char.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        atk2Char.setForeground(new java.awt.Color(255, 255, 255));
        atk2Char.setText("Flamethrower ");
        atk2Char.setContentAreaFilled(false);
        atk2Char.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atk2Char.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk2CharActionPerformed(evt);
            }
        });
        DesktopPk1.add(atk2Char);
        atk2Char.setBounds(140, 49, 110, 35);

        desktopTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icon/Desktop.png"))); // NOI18N
        DesktopPk1.add(desktopTela);
        desktopTela.setBounds(0, 0, 260, 90);

        getContentPane().add(DesktopPk1);
        DesktopPk1.setBounds(300, 293, 260, 90);

        turnoPokemon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        turnoPokemon.setForeground(new java.awt.Color(0, 0, 0));
        turnoPokemon.setText("Selecione um ataque:");
        getContentPane().add(turnoPokemon);
        turnoPokemon.setBounds(40, 320, 220, 20);

        pokemon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icon/CharizardFoto (1).gif"))); // NOI18N
        getContentPane().add(pokemon2);
        pokemon2.setBounds(360, 40, 130, 120);

        pokemon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icon/BlastoiseGif.gif"))); // NOI18N
        getContentPane().add(pokemon1);
        pokemon1.setBounds(80, 130, 150, 143);

        telaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icon/Design sem nome (6).png"))); // NOI18N
        getContentPane().add(telaFundo);
        telaFundo.setBounds(0, 0, 600, 400);

        setSize(new java.awt.Dimension(616, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atk2BlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk2BlasActionPerformed
        // Abre o ataque 2 do blastoise
        ImageIcon icon = new ImageIcon("src/br/com/icon/pokebolaA.png");
        JOptionPane.showMessageDialog(null, "ATAQUE COM HYDRO PUMP", "Blastoise atacou", HEIGHT,icon);
        new TelaAtaque2Blas().setVisible(true);
        dispose();
    }//GEN-LAST:event_atk2BlasActionPerformed

    private void atk2CharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk2CharActionPerformed
        // Realiza o Ataque 2 do Charizard
        ImageIcon icon = new ImageIcon("src/br/com/icon/pokebola.png");
        JOptionPane.showMessageDialog(null, "ATAQUE COM FLAMETHOWER ", "Charizard Atacou atacou", HEIGHT,icon);
        new TelaAtaque2Char().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_atk2CharActionPerformed

    private void atk1BlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk1BlasActionPerformed
        // Realiza o primeiro ataque
        ImageIcon icon = new ImageIcon("src/br/com/icon/pokebolaA.png");
        JOptionPane.showMessageDialog(null, "ATAQUE COM SKULL BASH", "Blastoise atacou", HEIGHT,icon);
        new TelaAtaque1Blas().setVisible(true);
        dispose();
        


    }//GEN-LAST:event_atk1BlasActionPerformed

    private void atk1CharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk1CharActionPerformed
        // Realiza o primeiro ataque do charizard
        ImageIcon icon = new ImageIcon("src/br/com/icon/pokebola.png");
        JOptionPane.showMessageDialog(null, "ATAQUE COM AIR SLASH ", "Charizard Atacou atacou", HEIGHT,icon);
        new TelaAtaque1Char().setVisible(true);
        dispose();
        

    }//GEN-LAST:event_atk1CharActionPerformed

    private void atk1BlasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atk1BlasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_atk1BlasMouseClicked

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
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBatalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPk1;
    private javax.swing.JButton atk1Blas;
    private javax.swing.JButton atk1Char;
    private javax.swing.JButton atk2Blas;
    private javax.swing.JButton atk2Char;
    private javax.swing.JLabel desktopTela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pokemon1;
    private javax.swing.JLabel pokemon1Level;
    private javax.swing.JLabel pokemon1Nome;
    private javax.swing.JLabel pokemon2;
    private javax.swing.JLabel pokemon2Level;
    private javax.swing.JLabel pokemon2Nome;
    private javax.swing.JLabel telaFundo;
    private javax.swing.JLabel turnoPokemon;
    private javax.swing.JProgressBar vidaPokemon1;
    private javax.swing.JProgressBar vidaPokemon2;
    // End of variables declaration//GEN-END:variables

}
