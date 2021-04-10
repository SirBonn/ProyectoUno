package Ventanas;

import Granjero.Jugador;

public class VentanaIngreso extends javax.swing.JFrame {

    Jugador jugador;
    //VentanaInicial ventanainicio = new VentanaInicial();
    JuegoPrincipal ventanaJuego;
    public VentanaIngreso() {
        initComponents();
        setLocationRelativeTo(null);    //para que nuestra ventana aparezca en el centro de nuestra pantalla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenidaEmergente = new javax.swing.JDialog();
        salirJdialogBoton = new javax.swing.JButton();
        aceptarJdialogBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoBienvenida = new javax.swing.JTextArea();
        registroLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nickText = new javax.swing.JTextField();
        salirBoton = new javax.swing.JButton();
        aceptarBoton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        salirJdialogBoton.setText("Salir");
        salirJdialogBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJdialogBotonActionPerformed(evt);
            }
        });

        aceptarJdialogBoton.setText("Aceptar");
        aceptarJdialogBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarJdialogBotonActionPerformed(evt);
            }
        });

        textoBienvenida.setEditable(false);
        textoBienvenida.setColumns(20);
        textoBienvenida.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        textoBienvenida.setLineWrap(true);
        textoBienvenida.setRows(5);
        textoBienvenida.setToolTipText("");
        textoBienvenida.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textoBienvenida);

        javax.swing.GroupLayout bienvenidaEmergenteLayout = new javax.swing.GroupLayout(bienvenidaEmergente.getContentPane());
        bienvenidaEmergente.getContentPane().setLayout(bienvenidaEmergenteLayout);
        bienvenidaEmergenteLayout.setHorizontalGroup(
            bienvenidaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienvenidaEmergenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bienvenidaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bienvenidaEmergenteLayout.createSequentialGroup()
                        .addGap(0, 248, Short.MAX_VALUE)
                        .addComponent(aceptarJdialogBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirJdialogBoton)))
                .addGap(7, 7, 7))
        );
        bienvenidaEmergenteLayout.setVerticalGroup(
            bienvenidaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienvenidaEmergenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bienvenidaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarJdialogBoton)
                    .addComponent(salirJdialogBoton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FARMSQUARE");
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.cyan);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroLabel.setBackground(new java.awt.Color(0, 0, 0));
        registroLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registroLabel.setForeground(new java.awt.Color(0, 0, 0));
        registroLabel.setText("BIENVENIDO A FARMSQUARE");
        registroLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registroLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(registroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa tu nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 90, -1, -1));

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });
        getContentPane().add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 117, 250, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tu Nick:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 172, -1, -1));
        getContentPane().add(nickText, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 199, 250, -1));

        salirBoton.setText("Salir");
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });
        getContentPane().add(salirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        aceptarBoton.setText("Aceptar");
        aceptarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\byron\\Desktop\\proyecto1\\PruebasClases\\Granja\\src\\main\\Resources\\fondoinicio.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBotonActionPerformed

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        jugador = new Jugador(nombreText.getText(), nickText.getText(), 500, 100);
        this.dispose();
        bienvenidaEmergente.setTitle("SQUAREFARM");
        bienvenidaEmergente.setSize(414, 240);
        bienvenidaEmergente.setLocationRelativeTo(null);
        bienvenidaEmergente.setVisible(true);
        textoBienvenida.setVisible(true);
        textoBienvenida.setEditable(false);
        textoBienvenida.setText("\t\tBIENVENIDO\n\nTe damos la bienvenida a SquareFarm, un lugar en donde un cuadrado tiene mas de 4 lados,"
                + " ahora eres el Granjero: " + jugador.getNick() + ". Eesperamos que hagas estas tierras mucho mas productivas para generar tus ganancias."
                + "\n\nCuentas con 500 monedas y 100 puntos de vida.");

    }//GEN-LAST:event_aceptarBotonActionPerformed

    private void salirJdialogBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJdialogBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirJdialogBotonActionPerformed

    private void aceptarJdialogBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarJdialogBotonActionPerformed
        bienvenidaEmergente.setVisible(false);
        ventanaJuego = new JuegoPrincipal(jugador); //enviamos al jugador que hemos creado como parametro para que siga siendo la misma persona en otra ventana
        ventanaJuego.setVisible(true);
    }//GEN-LAST:event_aceptarJdialogBotonActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed
    public Jugador ventanaIngreso() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngreso().setVisible(true);
            }

        });
        return jugador; //enviaremos de vuelta el jugador que crearemos en esta estancia de registro
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBoton;
    private javax.swing.JButton aceptarJdialogBoton;
    private javax.swing.JDialog bienvenidaEmergente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nickText;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel registroLabel;
    private javax.swing.JButton salirBoton;
    private javax.swing.JButton salirJdialogBoton;
    private javax.swing.JTextArea textoBienvenida;
    // End of variables declaration//GEN-END:variables
}
