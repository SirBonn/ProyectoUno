/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


/**
 *
 * @author byron
 */
public class OpcionesDesierto extends javax.swing.JFrame {


      
      public OpcionesDesierto( ) {
            initComponents();
            mensajeDesierto.setText("<html>No puedes hacer nada, el granjero se rostizo por el calor</html>");
      }

     
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            regresar = new javax.swing.JButton();
            mensajeDesierto = new javax.swing.JLabel();
            PolloDesierto = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setAlwaysOnTop(true);
            setUndecorated(true);
            setResizable(false);
            setType(java.awt.Window.Type.UTILITY);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            regresar.setText("Regresar");
            regresar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        regresarActionPerformed(evt);
                  }
            });
            getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

            mensajeDesierto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
            mensajeDesierto.setForeground(new java.awt.Color(0, 0, 0));
            getContentPane().add(mensajeDesierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 70));

            PolloDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PolloTostado.jpg"))); // NOI18N
            getContentPane().add(PolloDesierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
            setVisible(false);
      }//GEN-LAST:event_regresarActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel PolloDesierto;
      private javax.swing.JLabel mensajeDesierto;
      private javax.swing.JButton regresar;
      // End of variables declaration//GEN-END:variables
}
