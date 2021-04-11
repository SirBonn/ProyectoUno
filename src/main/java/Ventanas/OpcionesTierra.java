package Ventanas;

import Plantas.Maiz;
import Plantas.ManejadorPlanta;
import Vivo.planta;

public class OpcionesTierra extends javax.swing.JFrame {

      private planta planta;
      private ManejadorPlanta manejadorPlanta;

      public OpcionesTierra() {
            initComponents();
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPopupMenu1 = new javax.swing.JPopupMenu();
            Arboles = new javax.swing.JMenu();
            Tamarindo = new javax.swing.JMenuItem();
            Aguacae = new javax.swing.JMenuItem();
            Semillas = new javax.swing.JMenu();
            Maiz = new javax.swing.JMenuItem();
            Frijoles = new javax.swing.JMenuItem();
            jPopupMenu2 = new javax.swing.JPopupMenu();
            jMenuItem2 = new javax.swing.JMenuItem();
            jMenuItem3 = new javax.swing.JMenuItem();
            jMenuItem4 = new javax.swing.JMenuItem();
            jLabel1 = new javax.swing.JLabel();
            colocarAnimales = new javax.swing.JButton();
            regresar = new javax.swing.JButton();
            Sembrar = new javax.swing.JButton();
            fondotierra = new javax.swing.JLabel();

            jPopupMenu1.setInvoker(Sembrar);

            Arboles.setText("Arboles");

            Tamarindo.setText("Tamarindo");
            Tamarindo.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        TamarindoActionPerformed(evt);
                  }
            });
            Arboles.add(Tamarindo);

            Aguacae.setText("Aguacate");
            Aguacae.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AguacaeActionPerformed(evt);
                  }
            });
            Arboles.add(Aguacae);

            jPopupMenu1.add(Arboles);

            Semillas.setText("Semillas");

            Maiz.setText("Maiz");
            Maiz.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        MaizMouseClicked(evt);
                  }
            });
            Maiz.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MaizActionPerformed(evt);
                  }
            });
            Semillas.add(Maiz);

            Frijoles.setText("Frijoles");
            Frijoles.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        FrijolesActionPerformed(evt);
                  }
            });
            Semillas.add(Frijoles);

            jPopupMenu1.add(Semillas);

            jPopupMenu2.setInvoker(colocarAnimales);

            jMenuItem2.setText("jMenuItem2");
            jPopupMenu2.add(jMenuItem2);

            jMenuItem3.setText("jMenuItem3");
            jPopupMenu2.add(jMenuItem3);

            jMenuItem4.setText("jMenuItem4");
            jPopupMenu2.add(jMenuItem4);

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setAlwaysOnTop(true);
            setUndecorated(true);
            setResizable(false);
            setType(java.awt.Window.Type.UTILITY);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setText("jLabel1");
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 30));

            colocarAnimales.setText("animal");
            colocarAnimales.setComponentPopupMenu(jPopupMenu2);
            colocarAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        colocarAnimalesMouseReleased(evt);
                  }
            });
            getContentPane().add(colocarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, -1));

            regresar.setText("Regresar");
            regresar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        regresarActionPerformed(evt);
                  }
            });
            getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 212, -1, -1));

            Sembrar.setText("Sembrar");
            Sembrar.setComponentPopupMenu(jPopupMenu1);
            Sembrar.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        SembrarMouseReleased(evt);
                  }
            });
            getContentPane().add(Sembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 174, 83, -1));

            fondotierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galloSembradorFondo.jpg"))); // NOI18N
            getContentPane().add(fondotierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
            setVisible(false);
      }//GEN-LAST:event_regresarActionPerformed

      private void SembrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SembrarMouseReleased
            jPopupMenu1.setVisible(true);
            jPopupMenu1.setLocation(evt.getXOnScreen(), evt.getYOnScreen());

      }//GEN-LAST:event_SembrarMouseReleased

      private void colocarAnimalesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colocarAnimalesMouseReleased
            jPopupMenu2.setVisible(true);
            jPopupMenu2.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
      }//GEN-LAST:event_colocarAnimalesMouseReleased

      private void TamarindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamarindoActionPerformed

      }//GEN-LAST:event_TamarindoActionPerformed

      private void AguacaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguacaeActionPerformed

      }//GEN-LAST:event_AguacaeActionPerformed

      private void MaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaizActionPerformed
            Maiz maiz = new Maiz();
            manejadorPlanta = new ManejadorPlanta(maiz);
            manejadorPlanta.sembrarPlanta(this.jLabel1, maiz);
      }//GEN-LAST:event_MaizActionPerformed

      private void FrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrijolesActionPerformed

      }//GEN-LAST:event_FrijolesActionPerformed

      private void MaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaizMouseClicked

      }//GEN-LAST:event_MaizMouseClicked


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JMenuItem Aguacae;
      private javax.swing.JMenu Arboles;
      private javax.swing.JMenuItem Frijoles;
      private javax.swing.JMenuItem Maiz;
      private javax.swing.JButton Sembrar;
      private javax.swing.JMenu Semillas;
      private javax.swing.JMenuItem Tamarindo;
      private javax.swing.JButton colocarAnimales;
      private javax.swing.JLabel fondotierra;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JMenuItem jMenuItem2;
      private javax.swing.JMenuItem jMenuItem3;
      private javax.swing.JMenuItem jMenuItem4;
      private javax.swing.JPopupMenu jPopupMenu1;
      private javax.swing.JPopupMenu jPopupMenu2;
      private javax.swing.JButton regresar;
      // End of variables declaration//GEN-END:variables
}
