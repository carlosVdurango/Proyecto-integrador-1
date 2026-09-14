/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;


public class Biblioteca extends javax.swing.JFrame {

    
    public Biblioteca() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new java.awt.Label();
        ButRespiraciónDiafragmática = new javax.swing.JButton();
        TimpRespiraciónDiafragmática = new javax.swing.JLabel();
        ButMeditaciónDeAtenciónPlena = new javax.swing.JButton();
        TimpMeditaciónDeAtenciónPlena = new javax.swing.JLabel();
        ButEjercicioAeróbicoDeIntensidadModerada = new javax.swing.JButton();
        TiemEjercicioAeróbicoDeIntensidadModerada = new javax.swing.JLabel();
        ButRelajaciónMuscularProgresiva = new javax.swing.JButton();
        TimpRelajaciónMuscularProgresiva = new javax.swing.JLabel();
        ButVisualizaciónGuiada = new javax.swing.JButton();
        TimpVisualizaciónGuiada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setAlignment(java.awt.Label.CENTER);
        Titulo.setBackground(new java.awt.Color(0, 0, 204));
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Biblioteca De Actividades");

        ButRespiraciónDiafragmática.setText("Respiración diafragmática");
        ButRespiraciónDiafragmática.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRespiraciónDiafragmáticaActionPerformed(evt);
            }
        });

        TimpRespiraciónDiafragmática.setText("5 minutos");

        ButMeditaciónDeAtenciónPlena.setText("Meditación de Atención Plena");
        ButMeditaciónDeAtenciónPlena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMeditaciónDeAtenciónPlenaActionPerformed(evt);
            }
        });

        TimpMeditaciónDeAtenciónPlena.setText("10/20 minutos");

        ButEjercicioAeróbicoDeIntensidadModerada.setText("Ejercicio aeróbico de intensidad moderada");
        ButEjercicioAeróbicoDeIntensidadModerada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEjercicioAeróbicoDeIntensidadModeradaActionPerformed(evt);
            }
        });

        TiemEjercicioAeróbicoDeIntensidadModerada.setText("30 minutos");

        ButRelajaciónMuscularProgresiva.setText("Relajación muscular progresiva (estrés)");
        ButRelajaciónMuscularProgresiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRelajaciónMuscularProgresivaActionPerformed(evt);
            }
        });

        TimpRelajaciónMuscularProgresiva.setText("10 minutos");

        ButVisualizaciónGuiada.setText("Visualización guiada (ansiedad)");
        ButVisualizaciónGuiada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButVisualizaciónGuiadaActionPerformed(evt);
            }
        });

        TimpVisualizaciónGuiada.setText("10 minutos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButMeditaciónDeAtenciónPlena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButEjercicioAeróbicoDeIntensidadModerada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButRespiraciónDiafragmática, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButRelajaciónMuscularProgresiva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButVisualizaciónGuiada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimpMeditaciónDeAtenciónPlena)
                    .addComponent(TimpRespiraciónDiafragmática)
                    .addComponent(TiemEjercicioAeróbicoDeIntensidadModerada)
                    .addComponent(TimpRelajaciónMuscularProgresiva)
                    .addComponent(TimpVisualizaciónGuiada))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRespiraciónDiafragmática)
                    .addComponent(TimpRespiraciónDiafragmática))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButMeditaciónDeAtenciónPlena)
                    .addComponent(TimpMeditaciónDeAtenciónPlena))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButEjercicioAeróbicoDeIntensidadModerada)
                    .addComponent(TiemEjercicioAeróbicoDeIntensidadModerada))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRelajaciónMuscularProgresiva)
                    .addComponent(TimpRelajaciónMuscularProgresiva))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButVisualizaciónGuiada)
                    .addComponent(TimpVisualizaciónGuiada))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
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

    private void ButRespiraciónDiafragmáticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRespiraciónDiafragmáticaActionPerformed
        
       InfRespiraciónDiafragmática newframeq = new InfRespiraciónDiafragmática();
        newframeq.setVisible(true);
        newframeq.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButRespiraciónDiafragmáticaActionPerformed

    private void ButMeditaciónDeAtenciónPlenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMeditaciónDeAtenciónPlenaActionPerformed
        infMeditaciónDeAtencionPlena newframe = new infMeditaciónDeAtencionPlena();
        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButMeditaciónDeAtenciónPlenaActionPerformed

    private void ButEjercicioAeróbicoDeIntensidadModeradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEjercicioAeróbicoDeIntensidadModeradaActionPerformed
        // InfEjercicioAeróbicoDeIntensidadModerada
        InfEjercicioAeróbicoDeIntensidadModerada newframe = new InfEjercicioAeróbicoDeIntensidadModerada();
        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_ButEjercicioAeróbicoDeIntensidadModeradaActionPerformed

    private void ButRelajaciónMuscularProgresivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRelajaciónMuscularProgresivaActionPerformed
        InfRelajaciónMuscularProgresiva newframe = new InfRelajaciónMuscularProgresiva();
        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButRelajaciónMuscularProgresivaActionPerformed

    private void ButVisualizaciónGuiadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButVisualizaciónGuiadaActionPerformed
        InfVisualizaciónGuiada newframe = new InfVisualizaciónGuiada();
        newframe.setVisible(true);
        newframe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButVisualizaciónGuiadaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEjercicioAeróbicoDeIntensidadModerada;
    private javax.swing.JButton ButMeditaciónDeAtenciónPlena;
    private javax.swing.JButton ButRelajaciónMuscularProgresiva;
    private javax.swing.JButton ButRespiraciónDiafragmática;
    private javax.swing.JButton ButVisualizaciónGuiada;
    private javax.swing.JLabel TiemEjercicioAeróbicoDeIntensidadModerada;
    private javax.swing.JLabel TimpMeditaciónDeAtenciónPlena;
    private javax.swing.JLabel TimpRelajaciónMuscularProgresiva;
    private javax.swing.JLabel TimpRespiraciónDiafragmática;
    private javax.swing.JLabel TimpVisualizaciónGuiada;
    private java.awt.Label Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
