/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointegrador;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;


public class IniciarSesion extends javax.swing.JFrame {

    
    public IniciarSesion() {
        initComponents();
        personalizarEstilo();
        setLocationRelativeTo(null);
    }

    
    private void personalizarEstilo() {
        getContentPane().setBackground(Color.WHITE);

        lblTitulo.setForeground(new Color(43,73,224));
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 24));

        lblCorreo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        btnIniciarSesion.setBackground(new Color(61, 90, 241));
        btnIniciarSesion.setForeground(Color.WHITE);
        btnIniciarSesion.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lblOlvidasteContrasena.setForeground(new Color(90, 90, 90));
        lblOlvidasteContrasena.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lblSinCuenta.setForeground(new Color(90, 90, 90));
        lblSinCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lblOlvidasteContrasena = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        lblSinCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SAFE EST - Iniciar Sesion");

        lblCorreo.setText("Correo electronico");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblContrasena.setText("Contrasena");

        lblOlvidasteContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOlvidasteContrasena.setText("¿Olvidaste tu contraseña?");
        lblOlvidasteContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOlvidasteContrasenaMouseClicked(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });

        lblSinCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSinCuenta.setText("¿Sin cuenta? Registrate");
        lblSinCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSinCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasena)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOlvidasteContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSinCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitulo)
                .addGap(36, 36, 36)
                .addComponent(lblCorreo)
                .addGap(6, 6, 6)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContrasena)
                .addGap(6, 6, 6)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblOlvidasteContrasena)
                .addGap(30, 30, 30)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblSinCuenta)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>                        

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // por ahora no hacemos nada aqui, el login se dispara
        // con el boton, no con el Enter del campo de correo
    }                                           

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // sacamos lo que el usuario escribio en los campos
        String correo = txtCorreo.getText().trim();
        String clave =new String(password.getPassword());

        if(correo.isEmpty() || clave.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor completa correo y contraseña.",
                    "Datos incompletos",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // le preguntamos a Autenticacion si esos datos son correctos
        if (Autenticacion.validarCredenciales(correo, clave)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso.");
            // al iniciar sesion correctamente, mandamos al usuario a la biblioteca de actividades
            igu.Biblioteca biblio = new igu.Biblioteca();
            biblio.setVisible(true);
            biblio.setLocationRelativeTo(null);
            this.dispose();
        } else{
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Correo o contraseña incorrectos.",
                    "Error de acceso",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }                                             

    private void lblOlvidasteContrasenaMouseClicked(java.awt.event.MouseEvent evt) {                                                        
        // mandamos al usuario a la ventana de recuperar contrasena
        new OlvidasteContrasena().setVisible(true);
        this.dispose();
    }                                                       

    private void lblSinCuentaMouseClicked(java.awt.event.MouseEvent evt) {                                          
        new Registro().setVisible(true);
        this.dispose();
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // declaracion de variables, NO VAYAN A MOVERLO                     
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblOlvidasteContrasena;
    private javax.swing.JLabel lblSinCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtCorreo;
           
}
