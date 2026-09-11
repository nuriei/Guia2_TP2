
package guia2_tp2;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    
        int codigoSecreto;
        int intentos = 0;
        int ayudasUsadas = 0;

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        codigoSecreto = (int) (Math.random() * 900) + 100;// Genero el número de 3 dígitos (100 a 999)
        //aca separo cada numero con division y modulo
        int d1 = codigoSecreto / 100;
        int d2 = (codigoSecreto / 10) % 10;
        int d3 = codigoSecreto % 10;
        
        // aca convierto a texto con la concatenacion y los " cada numero y lo asigno 
        num1.setText(d1 + "");
        num2.setText(d2 + "");
        num3.setText(d3 + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_numeroTecleado = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        num2 = new javax.swing.JPasswordField();
        num3 = new javax.swing.JPasswordField();
        num1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lbl_informacion = new javax.swing.JLabel();
        lbl_trofeo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        txt_numeroTecleado.setBackground(new java.awt.Color(255, 204, 204));
        txt_numeroTecleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_numeroTecleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeroTecleadoActionPerformed(evt);
            }
        });
        txt_numeroTecleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_numeroTecleadoKeyPressed(evt);
            }
        });

        boton.setText("pista");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

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

        lbl_informacion.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        lbl_informacion.setForeground(new java.awt.Color(255, 255, 102));
        lbl_informacion.setText("por favor ingresa exactamente 3 numeros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txt_numeroTecleado, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lbl_trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_informacion)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbl_informacion)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numeroTecleado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void txt_numeroTecleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeroTecleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numeroTecleadoActionPerformed

    private void txt_numeroTecleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroTecleadoKeyPressed
           if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
        try{           
        
        String numIngresado = txt_numeroTecleado.getText();//guardo en una variable el texto q despues convierto en numero
        
        // 2. Validación básica: Comprobar únicamente que tenga 3 caracteres
        if (numIngresado.length() != 3) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingresa exactamente 3 números.");//con este solo evaluo los caracteres
            //con el try si son tres los caracteres y son de letra los reconoce entonces elimino ese error
            txt_numeroTecleado.setText("");//aca limpio lo que puso el usuario para q no tenga q borrar el
            return;
        }
        
        int numeroConvertido = Integer.parseInt(numIngresado);//aca lo convierto a integer
        intentos = intentos + 1;//aca va a sumar cada intento q haga
        
       //aca comparo si el numero es igual que se desenmascare todas las casillas 
        if (numeroConvertido == codigoSecreto) {
            // Desenmascarar las 3 casillas
            num1.setEchoChar((char) 0);
            num2.setEchoChar((char) 0);
            num3.setEchoChar((char) 0);
            
            // si adivino cargo el label trofeo 
            lbl_informacion.setText("Felicidades Adivinaste el codigo");
            lbl_trofeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia2_tp2/trofeo.png")));
           
            
            //cartel de victoria q miestra el numero y los intentos
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "¡Ganaste!\nCódigo correcto: " + codigoSecreto + "\nIntentos totales: " + intentos, 
                "¡Felicidades!", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
            
            //aca le doy las pistas
                                   
        } else if (numeroConvertido < codigoSecreto) {
            lbl_informacion.setText("El número secreto es MAS ALTO.");
            txt_numeroTecleado.setText("");
        } else {
            lbl_informacion.setText("El número secreto es MAS BAJO.");
            txt_numeroTecleado.setText("");
        }
        
    }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "uds debe ingresar solo numeros");
            txt_numeroTecleado.setText("");
    }
        }

        
    }//GEN-LAST:event_txt_numeroTecleadoKeyPressed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
            // TODO add your handling code here:
            //aca pongo el codigo de que si hace un click se revela de a uno los numeros y solo permite 2 visualizaciones
            // 1. Primera vez que presiona el botón: revela la primera casilla (num1)
            switch (ayudasUsadas) {
                case 0:
                    num1.setEchoChar((char) 0);
                    ayudasUsadas = 1; // Registramos que ya usó 1 ayuda
                    break;
                case 1:
                    num2.setEchoChar((char) 0);
                    ayudasUsadas = 2; // Registramos que ya usó las 2 ayudas permitidas
                    break;
                default:
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "¡Solo podes usar 2 pistas por juego!",
                            "Límite de ayudas",
                            javax.swing.JOptionPane.WARNING_MESSAGE);//aca en el cartel le asigna un titulo
                    break;
            }
    }//GEN-LAST:event_botonMouseClicked

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_informacion;
    private javax.swing.JLabel lbl_trofeo;
    private javax.swing.JPasswordField num1;
    private javax.swing.JPasswordField num2;
    private javax.swing.JPasswordField num3;
    private javax.swing.JTextField txt_numeroTecleado;
    // End of variables declaration//GEN-END:variables
}
