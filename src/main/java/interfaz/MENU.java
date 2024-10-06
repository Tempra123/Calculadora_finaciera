
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 * La clase MENU representa el menú principal de la aplicación.
 * Permite al usuario acceder a diferentes opciones, como calcular el interés,
 * ver el historial o salir de la aplicación.
 * La clase extiende JFrame para proporcionar una ventana gráfica.
 * @author [Dylan]
 * @version 1.0
 */
public class MENU extends javax.swing.JFrame {
 /**
     * Constructor de la clase MENU.
     * Inicializa los componentes de la interfaz gráfica y establece las configuraciones básicas de la ventana.
     */
    public MENU() {
         initComponents();
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         Salir.addActionListener(new MENU.ButtonClickListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Historial = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Historial.setBackground(new java.awt.Color(255, 255, 51));
        Historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Historial.setText("HISTORIAL");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 220, 50));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 30));

        Calcular.setBackground(new java.awt.Color(255, 255, 0));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Calcular.setText("CALCULAR INTERES ");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 210, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/calcuM.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 210));

        Regresar.setBackground(new java.awt.Color(255, 255, 0));
        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/CalInt.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 260, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/Historial.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 270, 260));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/Menu.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Método que se ejecuta al hacer clic en el botón "HISTORIAL".
     * Cierra la ventana actual y abre la ventana del historial.
     * @param evt El evento de clic generado al presionar el botón "HISTORIAL".
     */
    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        HISTORIAL irHistorial = new HISTORIAL();
        this.dispose();        
    }//GEN-LAST:event_HistorialActionPerformed
 /**
     * Método que se ejecuta al hacer clic en el botón "CALCULAR INTERÉS".
     * Cierra la ventana actual y abre la ventana para ingresar datos para el cálculo del interés.
     * @param evt El evento de clic generado al presionar el botón "CALCULAR INTERÉS".
     */
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        DATOS datos = new DATOS();
         this.dispose();
    }//GEN-LAST:event_CalcularActionPerformed
 /**
     * Método que se ejecuta al hacer clic en el botón "REGRESAR".
     * Cierra la ventana actual y regresa a la ventana de login.
     * @param evt El evento de clic generado al presionar el botón "REGRESAR".
     */
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        LOGIN login = new LOGIN();
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
   /**
         * Método que se ejecuta al presionar el botón "SALIR".
         * Cierra la ventana actual.
         * @param e El evento de clic generado.
         */
    private  class ButtonClickListener implements ActionListener {
      @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
              dispose();
        }
    } 
 }
