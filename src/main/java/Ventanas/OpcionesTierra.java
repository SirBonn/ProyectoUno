package Ventanas;

import Plantas.*;
import Animales.*;
import Terrenos.*;
import TiposTerrenos.Tierra;
import TiposTerrenos.seteadorImagenesTerreno;
import Vivo.SerVivo;
import Granjero.Jugador;

public class OpcionesTierra extends javax.swing.JFrame {

      private SerVivo serVivo;
      private Tierra tierra;
      private Jugador jugador;
      private SuperficieTerreno botonPulsado;
      private seteadorImagenesTerreno imageSetter;

      public OpcionesTierra(SuperficieTerreno celdaRecibida, Jugador jugador) {
            initComponents();
            this.botonPulsado = celdaRecibida;
            this.jugador =jugador;
            // imageSetter = new seteadorImagenesTerreno();
            this.tierra = new Tierra(true, false);
            //  imageSetter.maizSembrado(Maiz, botonPulsado);
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
            vacaAnimal = new javax.swing.JMenuItem();
            cerdoAnimal = new javax.swing.JMenuItem();
            gallinaAnimal = new javax.swing.JMenuItem();
            botonFertilizante = new javax.swing.JButton();
            botonCosechador = new javax.swing.JButton();
            edadColocao = new javax.swing.JLabel();
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

            vacaAnimal.setText("Vaca");
            vacaAnimal.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        vacaAnimalActionPerformed(evt);
                  }
            });
            criarPopUp.add(vacaAnimal);

            cerdoAnimal.setText("Cerdo");
            cerdoAnimal.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cerdoAnimalActionPerformed(evt);
                  }
            });
            criarPopUp.add(cerdoAnimal);

            gallinaAnimal.setText("Gallina");
            gallinaAnimal.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        gallinaAnimalActionPerformed(evt);
                  }
            });
            criarPopUp.add(gallinaAnimal);

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setAlwaysOnTop(true);
            setUndecorated(true);
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
            getContentPane().add(edadColocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

            siembraLabel.setText("Aun no esta ocupado");
            getContentPane().add(siembraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

            colocarAnimales.setText("Criar");
            colocarAnimales.setComponentPopupMenu(criarPopUp);
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
            getContentPane().add(botonLimpiador, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 170, -1, -1));

            botonRegar.setText("Regar");
            botonRegar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonRegarActionPerformed(evt);
                  }
            });
            getContentPane().add(botonRegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, -1));

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
            tierra.setParcela(true);
      }//GEN-LAST:event_colocarAnimalesMouseReleased

      private void TamarindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamarindoActionPerformed
            TamarindoArbol tamarindo = new TamarindoArbol();
            this.serVivo = tamarindo;
            tierra.sembrar(tamarindo, siembraLabel, sembrar, edadColocao, imagenSiembraLabel);
            this.tierra.setLibre(false);
            setBotonesPlanta();
      }//GEN-LAST:event_TamarindoActionPerformed

      private void AguacaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguacaeActionPerformed
            AguacateArbol aguacate = new AguacateArbol();
            this.serVivo = aguacate;
            tierra.sembrar(aguacate, siembraLabel, sembrar, edadColocao, imagenSiembraLabel);
            this.tierra.setLibre(false);
            setBotonesPlanta();
      }//GEN-LAST:event_AguacaeActionPerformed

      private void FrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrijolesActionPerformed
            Frijol frijol = new Frijol();
            this.serVivo = frijol;
            tierra.sembrar(frijol, siembraLabel, sembrar, edadColocao, imagenSiembraLabel);
            this.tierra.setLibre(false);
            setBotonesPlanta();
      }//GEN-LAST:event_FrijolesActionPerformed

      private void botonFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFertilizanteActionPerformed
          if (tierra.isParcela() == false) {
            tierra.fertilizar(this.serVivo); 
          } else {
                tierra.obtenerRecursos(this.serVivo);
          }
      }//GEN-LAST:event_botonFertilizanteActionPerformed

      private void botonLimpiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiadorActionPerformed
            this.tierra.setLibre(true);
            this.tierra.setParcela(false);
            this.tierra.limpiar(siembraLabel, edadColocao);  
            siembraLabel.setIcon(null);
            imagenSiembraLabel.setVisible(false);
            sembrar.setVisible(true);
            colocarAnimales.setVisible(true);
            botonCosechador.setVisible(false);
            botonFertilizante.setVisible(false);
            botonLimpiador.setVisible(false);
            botonRegar.setVisible(false);
            
      }//GEN-LAST:event_botonLimpiadorActionPerformed

      private void botonRegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegarActionPerformed
            tierra.mantenerVida(this.serVivo);
      }//GEN-LAST:event_botonRegarActionPerformed

      private void botonCosechadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCosechadorActionPerformed
            if(tierra.isParcela() == false) {
            tierra.cosechar(this.serVivo);
            } else {
                  tierra.destazarAnimal(this.serVivo);
            }
      }//GEN-LAST:event_botonCosechadorActionPerformed

      private void MaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaizActionPerformed
            Maiz maiz = new Maiz();
            this.serVivo = maiz;
            tierra.sembrar(maiz, siembraLabel, sembrar, edadColocao, imagenSiembraLabel);
            this.tierra.setLibre(false);
            setBotonesPlanta();

      }//GEN-LAST:event_MaizActionPerformed

      private void vacaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacaAnimalActionPerformed
            Vaca vaca = new Vaca();
            this.serVivo = vaca;
            tierra.colocar(vaca, siembraLabel, colocarAnimales, edadColocao, imagenSiembraLabel);
            setBotonesAnimal();
      }//GEN-LAST:event_vacaAnimalActionPerformed

      private void cerdoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerdoAnimalActionPerformed
            Cerdo cerdo = new Cerdo();
            this.serVivo = cerdo;
            tierra.colocar(cerdo, siembraLabel, colocarAnimales, edadColocao, imagenSiembraLabel);
            setBotonesAnimal();
      }//GEN-LAST:event_cerdoAnimalActionPerformed

      private void gallinaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallinaAnimalActionPerformed
            Gallina gallina = new Gallina();
            this.serVivo = gallina;
            tierra.colocar(gallina, siembraLabel, colocarAnimales, edadColocao, imagenSiembraLabel);
            setBotonesAnimal();
      }//GEN-LAST:event_gallinaAnimalActionPerformed

      private void setBotonesPlanta() {
            colocarAnimales.setVisible(false);
            botonCosechador.setText("Cosechar");
            botonCosechador.setVisible(true);
            botonFertilizante.setText("Fertilizante");
            botonFertilizante.setVisible(true);
            botonRegar.setText("Regar");
            botonRegar.setVisible(true);
            botonLimpiador.setVisible(true);
      }

      private void setBotonesAnimal() {
            colocarAnimales.setVisible(false);
            botonCosechador.setText("Recolectar");
            botonCosechador.setVisible(true);
            botonFertilizante.setText("Destazar");
            botonFertilizante.setVisible(true);
            botonRegar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            botonRegar.setText("Alimentar");
            botonRegar.setVisible(true);
            botonLimpiador.setVisible(true);

      }
      
      
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
      private javax.swing.JMenuItem cerdoAnimal;
      private javax.swing.JButton colocarAnimales;
      private javax.swing.JPopupMenu criarPopUp;
      private javax.swing.JLabel edadColocao;
      private javax.swing.JLabel fondotierra;
      private javax.swing.JMenuItem gallinaAnimal;
      private javax.swing.JLabel imagenSiembraLabel;
      private javax.swing.JButton regresar;
      private javax.swing.JButton sembrar;
      private javax.swing.JPopupMenu sembrarpopup;
      private javax.swing.JLabel siembraLabel;
      private javax.swing.JMenuItem vacaAnimal;
      // End of variables declaration//GEN-END:variables
}
