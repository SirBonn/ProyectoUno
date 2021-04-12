package Ventanas;

import Plantas.Maiz;
import Plantas.ManejadorPlanta;
import Vivo.planta;
import Terrenos.*;
import TiposTerrenos.Tierra;
import Vivo.SerVivo;

public class OpcionesTierra extends javax.swing.JFrame {

      private SerVivo planta;
      private ManejadorPlanta manejadorPlanta;
      private ManejadorTerreno manejadorTerreno;
      private  Tierra tierra;
      
      public OpcionesTierra() {
            initComponents();
            this.tierra = new Tierra(true, false);
            botonCosechador.setVisible(false);
            botonFertilizante.setVisible(false);
            botonLimpiador.setVisible(false);
            botonRegar.setVisible(false);
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            sembrarpopup = new javax.swing.JPopupMenu();
            Arboles = new javax.swing.JMenu();
            Tamarindo = new javax.swing.JMenuItem();
            Aguacae = new javax.swing.JMenuItem();
            Semillas = new javax.swing.JMenu();
            Maiz = new javax.swing.JMenuItem();
            Frijoles = new javax.swing.JMenuItem();
            criarPopUp = new javax.swing.JPopupMenu();
            jMenuItem2 = new javax.swing.JMenuItem();
            jMenuItem3 = new javax.swing.JMenuItem();
            jMenuItem4 = new javax.swing.JMenuItem();
            botonFertilizante = new javax.swing.JButton();
            botonCosechador = new javax.swing.JButton();
            edadSiembra = new javax.swing.JLabel();
            siembraLabel = new javax.swing.JLabel();
            colocarAnimales = new javax.swing.JButton();
            regresar = new javax.swing.JButton();
            sembrar = new javax.swing.JButton();
            botonLimpiador = new javax.swing.JButton();
            botonRegar = new javax.swing.JButton();
            imagenSiembraLabel = new javax.swing.JLabel();
            fondotierra = new javax.swing.JLabel();

            sembrarpopup.setInvoker(sembrar);

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

            sembrarpopup.add(Arboles);

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

            sembrarpopup.add(Semillas);

            criarPopUp.setInvoker(colocarAnimales);

            jMenuItem2.setText("jMenuItem2");
            criarPopUp.add(jMenuItem2);

            jMenuItem3.setText("jMenuItem3");
            criarPopUp.add(jMenuItem3);

            jMenuItem4.setText("jMenuItem4");
            criarPopUp.add(jMenuItem4);

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setAlwaysOnTop(true);
            setUndecorated(true);
            setPreferredSize(new java.awt.Dimension(250, 250));
            setResizable(false);
            setType(java.awt.Window.Type.UTILITY);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            botonFertilizante.setText("Fertilizante");
            botonFertilizante.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonFertilizanteActionPerformed(evt);
                  }
            });
            getContentPane().add(botonFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

            botonCosechador.setText("Cosechar");
            botonCosechador.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonCosechadorActionPerformed(evt);
                  }
            });
            getContentPane().add(botonCosechador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));
            getContentPane().add(edadSiembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

            siembraLabel.setText("Aun no siembras nada.");
            getContentPane().add(siembraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

            colocarAnimales.setText("Criar");
            colocarAnimales.setComponentPopupMenu(criarPopUp);
            colocarAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        colocarAnimalesMouseReleased(evt);
                  }
            });
            colocarAnimales.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        colocarAnimalesActionPerformed(evt);
                  }
            });
            getContentPane().add(colocarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, -1));

            regresar.setText("Regresar");
            regresar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        regresarActionPerformed(evt);
                  }
            });
            getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 210, -1, -1));

            sembrar.setText("Sembrar");
            sembrar.setComponentPopupMenu(sembrarpopup);
            sembrar.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        sembrarMouseReleased(evt);
                  }
            });
            getContentPane().add(sembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 83, -1));

            botonLimpiador.setText("Limpiar");
            botonLimpiador.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiadorActionPerformed(evt);
                  }
            });
            getContentPane().add(botonLimpiador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, -1));

            botonRegar.setText("Regar");
            botonRegar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonRegarActionPerformed(evt);
                  }
            });
            getContentPane().add(botonRegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, -1));

            imagenSiembraLabel.setBackground(new java.awt.Color(255, 255, 255, 100));
            imagenSiembraLabel.setForeground(new java.awt.Color(255, 255, 255, 100));
            imagenSiembraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            getContentPane().add(imagenSiembraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 150));

            fondotierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galloSembradorFondo.jpg"))); // NOI18N
            getContentPane().add(fondotierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
            setVisible(false);
      }//GEN-LAST:event_regresarActionPerformed

      private void sembrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sembrarMouseReleased
            sembrarpopup.setVisible(true);
            sembrarpopup.setLocation(evt.getXOnScreen(), evt.getYOnScreen());

      }//GEN-LAST:event_sembrarMouseReleased

      private void colocarAnimalesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colocarAnimalesMouseReleased
            criarPopUp.setVisible(true);
            criarPopUp.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
      }//GEN-LAST:event_colocarAnimalesMouseReleased

      private void TamarindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamarindoActionPerformed

      }//GEN-LAST:event_TamarindoActionPerformed

      private void AguacaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguacaeActionPerformed

      }//GEN-LAST:event_AguacaeActionPerformed

      private void MaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaizActionPerformed
            Maiz maiz = new Maiz();
            this.planta =maiz;
            tierra.sembrar(maiz, siembraLabel, sembrar, edadSiembra, imagenSiembraLabel);
            this.tierra.setLibre(false);
            colocarAnimales.setVisible(false);
            botonCosechador.setVisible(true);
            botonFertilizante.setVisible(true);
            botonLimpiador.setVisible(true);
            botonRegar.setVisible(true);
      }//GEN-LAST:event_MaizActionPerformed

      private void FrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrijolesActionPerformed
            
      }//GEN-LAST:event_FrijolesActionPerformed

      private void MaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaizMouseClicked
            
      }//GEN-LAST:event_MaizMouseClicked

      private void botonFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFertilizanteActionPerformed
            tierra.fertilizar(this.planta);
      }//GEN-LAST:event_botonFertilizanteActionPerformed

      private void botonLimpiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiadorActionPerformed
            this.tierra.setLibre(true);
            this.tierra.setParcela(false);
            siembraLabel.setIcon(null);
            siembraLabel.setText("Listo para sembrar");
            edadSiembra.setVisible(false);
            imagenSiembraLabel.setVisible(false);
            sembrar.setVisible(true);
            colocarAnimales.setVisible(true);
            botonCosechador.setVisible(false);
            botonFertilizante.setVisible(false);
            botonLimpiador.setVisible(false);
            botonRegar.setVisible(false);
            
      }//GEN-LAST:event_botonLimpiadorActionPerformed

      private void colocarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarAnimalesActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_colocarAnimalesActionPerformed

      private void botonRegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegarActionPerformed
            tierra.regar(this.planta);
      }//GEN-LAST:event_botonRegarActionPerformed

      private void botonCosechadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCosechadorActionPerformed
           tierra.cosechar(this.planta);
      }//GEN-LAST:event_botonCosechadorActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JMenuItem Aguacae;
      private javax.swing.JMenu Arboles;
      private javax.swing.JMenuItem Frijoles;
      private javax.swing.JMenuItem Maiz;
      private javax.swing.JMenu Semillas;
      private javax.swing.JMenuItem Tamarindo;
      private javax.swing.JButton botonCosechador;
      private javax.swing.JButton botonFertilizante;
      private javax.swing.JButton botonLimpiador;
      private javax.swing.JButton botonRegar;
      private javax.swing.JButton colocarAnimales;
      private javax.swing.JPopupMenu criarPopUp;
      private javax.swing.JLabel edadSiembra;
      private javax.swing.JLabel fondotierra;
      private javax.swing.JLabel imagenSiembraLabel;
      private javax.swing.JMenuItem jMenuItem2;
      private javax.swing.JMenuItem jMenuItem3;
      private javax.swing.JMenuItem jMenuItem4;
      private javax.swing.JButton regresar;
      private javax.swing.JButton sembrar;
      private javax.swing.JPopupMenu sembrarpopup;
      private javax.swing.JLabel siembraLabel;
      // End of variables declaration//GEN-END:variables
}
