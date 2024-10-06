
package interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import claseCalcu.Calculadora;
/**
 * La clase DATOS permite al usuario ingresar los datos necesarios para calcular
 * el interés simple, incluyendo el prestamista, el cliente, el monto, la tasa de interés y el tiempo.
 * Proporciona opciones para calcular con tasas y tiempos anuales o mensuales.
 * La clase extiende JFrame para proporcionar una ventana gráfica.
 * @author [Dylan]
 * @version 1.0
 */
public class DATOS extends javax.swing.JFrame {
      /**
     * Constructor de la clase DATOS.
     * Inicializa los componentes de la interfaz gráfica y agrupa los botones de opciones.
     */
    public DATOS() {
    initComponents();
    agruparBotones();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
    
@SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ingresarprestamista = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        ingresartiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ingresarmontoinicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ingresartasadeinteres = new javax.swing.JTextField();
        Tiempoaños = new javax.swing.JRadioButton();
        Tiempomeses = new javax.swing.JRadioButton();
        Interesanual = new javax.swing.JRadioButton();
        Interesmensual = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ingresarcliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIEMPO A PAGAR :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 180, 50));

        ingresarprestamista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarprestamista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarprestamista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamistaActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarprestamista, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 210, 30));

        Cancelar.setBackground(new java.awt.Color(255, 255, 51));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 120, -1));

        ingresartiempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartiempoActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("    PRESTAMISTA :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 170, 50));

        Calcular.setBackground(new java.awt.Color(255, 255, 0));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcular.setText("CALCULAR");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" MONTO INICIAL (Bs)  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 220, 50));

        ingresarmontoinicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarmontoinicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarmontoinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarmontoinicialActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarmontoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" TASA DE INTERES (%) :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 220, 50));

        ingresartasadeinteres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartasadeinteres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartasadeinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartasadeinteresActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartasadeinteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 210, 30));

        Tiempoaños.setText("Años");
        Tiempoaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoañosActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempoaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        Tiempomeses.setText("Meses");
        Tiempomeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempomesesActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempomeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        Interesanual.setText("Anual");
        Interesanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresanualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        Interesmensual.setText("Mensual");
        Interesmensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresmensualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesmensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    CLIENTE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 110, 50));

        ingresarcliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 210, 30));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interes simple");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 370, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/calcuM.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 210));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/interez(1).jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Agrupa los botones de selección de tiempo e interés, asegurando que solo se pueda seleccionar uno de cada grupo.
     */
private void agruparBotones() {
    // Crear los ButtonGroup para agrupar los botones de tiempo e interés
    ButtonGroup grupoTiempo = new ButtonGroup();
    ButtonGroup grupoInteres = new ButtonGroup();

    // Agregar los botones de tiempo al grupo "grupoTiempo"
    grupoTiempo.add(Tiempoaños);
    grupoTiempo.add(Tiempomeses);

    // Agregar los botones de interés al grupo "grupoInteres"
    grupoInteres.add(Interesanual);
    grupoInteres.add(Interesmensual);
}
    private void ingresartiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartiempoActionPerformed

    }//GEN-LAST:event_ingresartiempoActionPerformed
 /**
     * Método que se ejecuta al hacer clic en el botón "CALCULAR".
     * Obtiene los datos ingresados por el usuario y calcula el interés simple.
     * Luego, abre la ventana de resultado con los datos calculados.
     * Si los valores ingresados no son numéricos válidos, muestra un mensaje de error.
     * @param evt El evento de clic generado al presionar el botón "CALCULAR".
     */
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
    //obtener datos
    String prestamista = ingresarprestamista.getText().toUpperCase().trim();
    String cliente = ingresarcliente.getText().toUpperCase().trim();
    String montoInicial = ingresarmontoinicial.getText();
    String tasaInteres = ingresartasadeinteres.getText();
    String tipoInteres = Interesanual.isSelected() ? "anual" : "mensual"; // Ajustar según la selección
    String tiempo = ingresartiempo.getText();
    String tipoTiempo = Tiempoaños.isSelected() ? "años" : "meses"; // Ajustar según la selección
    
   //calcular el interes simple con los datos adquiridos 
    try {
        // Convertir los valores ingresados a tipos numéricos
        double monto = Double.parseDouble(montoInicial);
        double tasa = Double.parseDouble(tasaInteres) / 100; // convertir a decimal
        int tiempoTotal = Integer.parseInt(tiempo);

        // Calcular el interés simple    
        double interesSimple = Calculadora.calcularInteresSimple(monto, tasa, tiempoTotal, tipoInteres, tipoTiempo );
        
        //enviar datos a RESULTADO 
         RESULTADO datos = new RESULTADO(prestamista, cliente, monto, tasa, tipoInteres, tiempoTotal, tipoTiempo, interesSimple);
    
        } catch (NumberFormatException e) {
        // Manejo de errores si la entrada no es un número válido
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
      
    }//GEN-LAST:event_CalcularActionPerformed

    private void ingresarprestamistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarprestamistaActionPerformed
           
    }//GEN-LAST:event_ingresarprestamistaActionPerformed

    private void ingresarmontoinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarmontoinicialActionPerformed
       
    }//GEN-LAST:event_ingresarmontoinicialActionPerformed
 /**
     * Método que se ejecuta al hacer clic en el botón "CANCELAR".
     * Cierra la ventana actual y regresa al menú principal.
     * @param evt El evento de clic generado al presionar el botón "CANCELAR".
     */
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
      
        MENU menu = new MENU();
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ingresartasadeinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartasadeinteresActionPerformed
       
    }//GEN-LAST:event_ingresartasadeinteresActionPerformed

    private void TiempoañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoañosActionPerformed
        
    }//GEN-LAST:event_TiempoañosActionPerformed

    private void InteresanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresanualActionPerformed
       
    }//GEN-LAST:event_InteresanualActionPerformed

    private void InteresmensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresmensualActionPerformed
        
    }//GEN-LAST:event_InteresmensualActionPerformed

    private void TiempomesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempomesesActionPerformed
        
    }//GEN-LAST:event_TiempomesesActionPerformed

    private void ingresarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarclienteActionPerformed

    }//GEN-LAST:event_ingresarclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Cancelar;
    private javax.swing.JRadioButton Interesanual;
    private javax.swing.JRadioButton Interesmensual;
    private javax.swing.JRadioButton Tiempoaños;
    private javax.swing.JRadioButton Tiempomeses;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresarcliente;
    private javax.swing.JTextField ingresarmontoinicial;
    private javax.swing.JTextField ingresarprestamista;
    private javax.swing.JTextField ingresartasadeinteres;
    private javax.swing.JTextField ingresartiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
