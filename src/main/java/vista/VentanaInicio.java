/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author denis
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    
    
    
    public VentanaInicio() {    
        initComponents();
        
        this.getContentPane().setBackground(Color.pink);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAgregarA = new javax.swing.JMenuItem();
        jMenuBajasA = new javax.swing.JMenuItem();
        jMenuCambiosA = new javax.swing.JMenuItem();
        jMenuConsultasA = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAltasCo = new javax.swing.JMenuItem();
        jMenuBajasCo = new javax.swing.JMenuItem();
        jMenuCambiosCo = new javax.swing.JMenuItem();
        jMenuConsultasCo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sakila Database");

        jMenu1.setText("Actor");

        jMenuAgregarA.setText("Add");
        jMenuAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarAActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAgregarA);

        jMenuBajasA.setText("Delete");
        jMenuBajasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBajasAActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBajasA);

        jMenuCambiosA.setText("Update");
        jMenuCambiosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCambiosAActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCambiosA);

        jMenuConsultasA.setText("Search");
        jMenuConsultasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasAActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuConsultasA);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Country");

        jMenuAltasCo.setText("Add");
        jMenuAltasCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAltasCoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAltasCo);

        jMenuBajasCo.setText("Delete");
        jMenuBajasCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBajasCoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBajasCo);

        jMenuCambiosCo.setText("Update");
        jMenuCambiosCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCambiosCoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCambiosCo);

        jMenuConsultasCo.setText("Search");
        jMenuConsultasCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasCoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsultasCo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("City");

        jMenuItem9.setText("Add");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Delete");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Update");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Search");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarAActionPerformed
        // TODO add your handling code here:
        AltasStaff alAc = new AltasStaff();
        alAc.setVisible(true);
    }//GEN-LAST:event_jMenuAgregarAActionPerformed

    private void jMenuCambiosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCambiosAActionPerformed
        // TODO add your handling code here:
        CambiosActor ca = new CambiosActor();
        ca.setVisible(true);
    }//GEN-LAST:event_jMenuCambiosAActionPerformed

    private void jMenuConsultasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasAActionPerformed
        // TODO add your handling code here:
        ConsultasActor coA = new ConsultasActor();
        coA.setVisible(true);
    }//GEN-LAST:event_jMenuConsultasAActionPerformed

    private void jMenuBajasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBajasAActionPerformed
        // TODO add your handling code here:
        BajasActor ba = new BajasActor();
        ba.setVisible(true);
    }//GEN-LAST:event_jMenuBajasAActionPerformed

    private void jMenuAltasCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAltasCoActionPerformed
        // TODO add your handling code here:
        AltasCountry alCo = new AltasCountry();
        alCo.setVisible(true);
    }//GEN-LAST:event_jMenuAltasCoActionPerformed

    private void jMenuBajasCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBajasCoActionPerformed
        // TODO add your handling code here:
        BajasCountry baCo = new BajasCountry();
        baCo.setVisible(true);
    }//GEN-LAST:event_jMenuBajasCoActionPerformed

    private void jMenuCambiosCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCambiosCoActionPerformed
        // TODO add your handling code here:
        CambiosCountry caCo = new CambiosCountry();
        caCo.setVisible(true);
    }//GEN-LAST:event_jMenuCambiosCoActionPerformed

    private void jMenuConsultasCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasCoActionPerformed
        // TODO add your handling code here:
        ConsultasCountry coCo = new ConsultasCountry();
        coCo.setVisible(true);
    }//GEN-LAST:event_jMenuConsultasCoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAgregarA;
    private javax.swing.JMenuItem jMenuAltasCo;
    private javax.swing.JMenuItem jMenuBajasA;
    private javax.swing.JMenuItem jMenuBajasCo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCambiosA;
    private javax.swing.JMenuItem jMenuCambiosCo;
    private javax.swing.JMenuItem jMenuConsultasA;
    private javax.swing.JMenuItem jMenuConsultasCo;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
      
}

