
package guia2_tp2;

public class NewJFrame extends javax.swing.JFrame {
    
        int codigoSecreto;
        int intentos = 0;
        int ayudasUsadas = 0;

    public NewJFrame() {
        initComponents();
        
        codigoSecreto = (int) (Math.random() * 900) + 100;// Genero el número de 3 dígitos (100 a 999)
        //aca separo cada numero con division y modulo
        int d1 = codigoSecreto / 100;
        int d2 = (codigoSecreto / 10) % 10;
        int d3 = codigoSecreto % 10;
        
        // aca convierto a texto cada numero y lo asigno 
        num1.setText(d1 + "");
        num2.setText(d2 + "");
        num3.setText(d3 + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        intento = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        pista = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        num2 = new javax.swing.JPasswordField();
        num3 = new javax.swing.JPasswordField();
        num1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        trofeo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        intento.setBackground(new java.awt.Color(255, 204, 204));
        intento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        intento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intentoActionPerformed(evt);
            }
        });
        intento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                intentoKeyPressed(evt);
            }
        });

        boton.setText("revelar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        pista.setText("jLabel1");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        num2.setEditable(false);
        num2.setBackground(new java.awt.Color(255, 255, 204));
        num2.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2.setText("$");
        num2.setToolTipText("");
        num2.setEchoChar('$');
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setEditable(false);
        num3.setBackground(new java.awt.Color(204, 255, 204));
        num3.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        num3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num3.setText("$");
        num3.setEchoChar('$');
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num1.setEditable(false);
        num1.setBackground(new java.awt.Color(204, 153, 255));
        num1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1.setText("$");
        num1.setEchoChar('$');
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(num2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(num3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(num1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(num3)
                    .addComponent(num2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("¡¡¡Adivina el codigo secreto!!!");

        jLabel2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("por favor ingresa exactamente 3 numeros");

        trofeo.setEditable(false);
        trofeo.setBackground(java.awt.SystemColor.activeCaption);
        trofeo.setText("jPasswordField1");
        trofeo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        trofeo.setEchoChar(' ');

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pista)
                        .addGap(304, 304, 304))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(pista)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num3ActionPerformed

    private void intentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intentoActionPerformed

    private void intentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_intentoKeyPressed
           if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
        
        String numIngresado = intento.getText();
        
        // 2. Validación básica: Comprobar únicamente que tenga 3 caracteres
        if (numIngresado.length() != 3) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingresa exactamente 3 números."); //uso un cartel de advertencia q ofrece java
            return;
        }
        
        int intentoUsuario = Integer.parseInt(numIngresado);//aca lo convierto a entero
        intentos = intentos + 1;//aca va a sumar cada intento q haga
        
        // 4. Evaluar el número ingresado
        if (intentoUsuario == codigoSecreto) {
            // Desenmascarar las 3 casillas
            num1.setEchoChar((char) 0);
            num2.setEchoChar((char) 0);
            num3.setEchoChar((char) 0);
            
            trofeo.setText("¡Excelente! ¡Adivinaste el código!");
            
           
            javax.swing.JOptionPane.showMessageDialog(this, "¡Ganaste!\nCódigo correcto: " + codigoSecreto + "\nIntentos totales: " + intentos);
            
        } else if (intentoUsuario < codigoSecreto) {
            pista.setText("El número secreto es MÁS ALTO.");
        } else {
            pista.setText("El número secreto es MÁS BAJO.");
        }
    }

        
    }//GEN-LAST:event_intentoKeyPressed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField intento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField num1;
    private javax.swing.JPasswordField num2;
    private javax.swing.JPasswordField num3;
    private javax.swing.JLabel pista;
    private javax.swing.JPasswordField trofeo;
    // End of variables declaration//GEN-END:variables
}
