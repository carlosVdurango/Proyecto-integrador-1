/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JavaClass.java to edit this template
 */
package proyectointegrador;

import javax.swing.UIManager;

/**
 * Esta es la clase desde donde arranca todo el programa.
 *
 * Lo que hace es configurar el "Look and Feel" (o sea, como se ven los
 * botones, ventanas, etc.) y despues abre directamente la ventana de
 * inicio de sesion, que es lo primero que el usuario deberia ver.
 * Cuando el inicio de sesion sea correcto (revisar Autenticacion), en
 * teoria aqui deberiamos abrir despues la ventana principal con las
 * actividades del sistema, pero esa parte todavia no la hicimos, queda
 * pendiente para la siguiente entrega.
 */
public class Arranque {

    public static void main(String[] args) {
        // intentamos poner el estilo Nimbus porque se ve un poco mas
        // moderno que el que trae Java por defecto
        try {
            for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
}
