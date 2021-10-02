
package br.com.Jogo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaAtaque2Char extends javax.swing.JFrame {

    
    public TelaAtaque2Char() {
        initComponents();
    
        
   
    TelaBatalha batalha = new TelaBatalha();
    new Thread(){
            public void run(){
                for (int i = 0; i < 101; i++) {
                    barra.setValue(i);
                    try {
                        sleep(14);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaAtaque2Char.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(i == 100){                        
                        batalha.setVisible(true);
                        dispose();
                    }
                }   
            }            
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        barra = new javax.swing.JProgressBar();
        telaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(barra);
        barra.setBounds(90, 360, 0, 20);

        telaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icon/Ataque2Char.gif"))); // NOI18N
        getContentPane().add(telaFundo);
        telaFundo.setBounds(0, 0, 600, 400);

        setSize(new java.awt.Dimension(616, 433));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(TelaAtaque2Char.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtaque2Char.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtaque2Char.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtaque2Char.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaAtaque2Char().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel telaFundo;
    // End of variables declaration//GEN-END:variables
}
