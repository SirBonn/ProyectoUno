/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Terrenos.*;
import Granjero.*;

public class JuegoPrincipal extends javax.swing.JFrame {

      public final Jugador jugador;
      private final ManejadorTerreno manejadorTerreno;
      private final ManejadorJugador manejadorJugador;
      private final Granja granja;
      private Bodega bodegaPanel;
      private Mercado mercadoPanel;
      public Inventario inventario;

      public JuegoPrincipal(Jugador jugador) {
            initComponents();
            setLocationRelativeTo(null);
            this.jugador = jugador;
            this.granja = new Granja(this.jugador);
            this.inventario = jugador.getInventario();
            this.manejadorTerreno = new ManejadorTerreno(panelTerreno, granja.getSuelo(), this.inventario);
            this.manejadorJugador = new ManejadorJugador(this.jugador, this.inventario);
            //this.manejadorTerreno = new ManejadorTerreno(panelTerreno, granja.getSuelo(), this.inventario);
            this.bodegaPanel = new Bodega(panelBodega, this.jugador, this.inventario);
            this.mercadoPanel = new Mercado(panelMercado, this.jugador, this.inventario);
            //this.manejadorTerreno = new ManejadorTerreno(panelTerreno, granja.getSuelo(), jugador);

            panelMercado.setVisible(false);
            panelMercado.add(mercadoPanel);
            panelBodega.setVisible(false);
            panelBodega.add(bodegaPanel);
            manejadorJugador.mostarDatos(monedasJugador, nombreJugador);
            manejadorJugador.VidaJugador(vidaJugador, monedasJugador);
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            bodegaBoton = new javax.swing.JButton();
            mercadoBoton = new javax.swing.JButton();
            panelBodega = new javax.swing.JPanel();
            panelMercado = new javax.swing.JPanel();
            panelTerreno = new javax.swing.JPanel();
            infoJugador = new javax.swing.JPanel();
            nombreJugador = new javax.swing.JLabel();
            vidaJugador = new javax.swing.JLabel();
            monedasJugador = new javax.swing.JLabel();
            FondoGranja = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("MyFarm");
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            bodegaBoton.setText("Bodega");
            bodegaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        bodegaBotonMouseReleased(evt);
                  }
            });
            getContentPane().add(bodegaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 80, -1));

            mercadoBoton.setText("Mercado");
            mercadoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        mercadoBotonMouseReleased(evt);
                  }
            });
            getContentPane().add(mercadoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));
            getContentPane().add(panelBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 320, 500));
            getContentPane().add(panelMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 320, 500));

            panelTerreno.setBackground(new java.awt.Color(128, 80, 6,100));
            panelTerreno.setLayout(new java.awt.GridLayout(5, 5));
            getContentPane().add(panelTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 760, 504));

            infoJugador.setBackground(new java.awt.Color(255, 255, 255,100));
            infoJugador.setForeground(new java.awt.Color(0, 0, 0));
            infoJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            nombreJugador.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
            nombreJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pollo.png"))); // NOI18N
            infoJugador.add(nombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 136, -1));

            vidaJugador.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
            infoJugador.add(vidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 200, 16));

            monedasJugador.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
            monedasJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2e34042fecd9906b496afe77124489f2.png"))); // NOI18N
            infoJugador.add(monedasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 72, 16));

            getContentPane().add(infoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 240, 70));

            FondoGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granjaFondo.jpg"))); // NOI18N
            getContentPane().add(FondoGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1120, 610));

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void mercadoBotonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mercadoBotonMouseReleased
            panelMercado.setVisible(true);
      }//GEN-LAST:event_mercadoBotonMouseReleased

      private void bodegaBotonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodegaBotonMouseReleased
            panelBodega.setVisible(true);
      }//GEN-LAST:event_bodegaBotonMouseReleased

      public Jugador getJugador() {
            return jugador;
      }

      public Inventario getInventario() {
            return inventario;
      }

      
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel FondoGranja;
      private javax.swing.JButton bodegaBoton;
      private javax.swing.JPanel infoJugador;
      private javax.swing.JButton mercadoBoton;
      private javax.swing.JLabel monedasJugador;
      private javax.swing.JLabel nombreJugador;
      private javax.swing.JPanel panelBodega;
      private javax.swing.JPanel panelMercado;
      private javax.swing.JPanel panelTerreno;
      private javax.swing.JLabel vidaJugador;
      // End of variables declaration//GEN-END:variables
}
