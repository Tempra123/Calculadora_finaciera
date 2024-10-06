
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Esta clase representa la interfaz gráfica de un sistema de login.
 * Permite al usuario ingresar su nombre de usuario y contraseña para acceder al sistema.
 * La clase extiende de JFrame para proporcionar una ventana gráfica.
 * @author [Dylan]
 * @version 1.0
*/
public class LOGIN extends javax.swing.JFrame {
/**
    * Constructor de la clase LOGIN.
    * Inicializa los componentes de la interfaz gráfica y establece las configuraciones básicas de la ventana.
    */
   public LOGIN() {
    initComponents();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    Salir.addActionListener(new ButtonClickListener());
}
 // Código generado para inicializar los componentes de la interfaz gráfica.
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresarusuario = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        ingresarcontraseña = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Castellar", 3, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora financiera");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 430, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 140, 50));

        ingresarusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, 30));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 40));

        Iniciar.setBackground(new java.awt.Color(255, 255, 0));
        Iniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 130, 30));

        Registrar.setBackground(new java.awt.Color(255, 255, 0));
        Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registrar.setText("REGISTRARSE");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 140, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/Logo1-removebg-preview.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 240, 220));

        ingresarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ingresarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 270, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iter/login.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
    * Método que se ejecuta al hacer clic en el botón "INICIAR".
    * Verifica las credenciales del usuario ingresado y, si son válidas, abre la ventana del menú principal.
    * Si las credenciales no son válidas, muestra un mensaje de error.
    * @param evt El evento de clic generado al presionar el botón "INICIAR".
    */
    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
    //leer los valores de Usuario y Contraseña
        String usuario = ingresarusuario.getText().toUpperCase().trim();
        String contraseña = new String(ingresarcontraseña.getPassword());
 
    //verficar si Usuario o Contraseña son incorrectos
        if (usuario.isEmpty()|| contraseña.isEmpty()){
            JOptionPane.showMessageDialog(this,"rellene todos los campos");
        }else{
            if (verificarCredenciales(usuario,contraseña)){
                //JOptionPane.showMessageDialog(this,"BIENVENIDO");
                MENU menu = new MENU();
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } 
            
    }//GEN-LAST:event_IniciarActionPerformed

  /**
    * Verifica si las credenciales del usuario son correctas comparándolas con las almacenadas en un archivo de texto.
    * @param usuario El nombre de usuario ingresado.
    * @param contraseña La contraseña ingresada.
    * @return true si las credenciales son válidas, false de lo contrario.
    * @throws IOException Si ocurre un error al leer el archivo de usuarios.
    */
private boolean verificarCredenciales(String usuario, String contraseña) {
    try {
        FileReader leer = new FileReader("usuarios.txt");
        BufferedReader bufferleer = new BufferedReader(leer);
        String linea;
        while ((linea = bufferleer.readLine()) != null) {
            String[] partes = linea.split(":"); //  formato "usuario : contraseña"
            if (partes.length == 2) {
                String usuariotxt = partes[0].trim();
                String contraseñatxt = partes[1].trim();

                // Verificar si coinciden el usuario y la contraseña
                if (usuario.equals(usuariotxt) && contraseña.equals(contraseñatxt)) {
                    bufferleer.close();
                    return true; // Credenciales válidas
                }
            }
          }
        bufferleer.close();
        }catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios.");
      
        }
       return false;  // Credenciales inválidas
    }    
    /**
    * Método que se ejecuta al hacer clic en el botón "REGISTRARSE".
    * Abre la ventana de registro de usuarios.
    * @param evt El evento de clic generado al presionar el botón "REGISTRARSE".
    */
    private void ingresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarusuarioActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
     REGISTRAR registrar = new REGISTRAR();
     this.dispose();
        
    }//GEN-LAST:event_RegistrarActionPerformed
  /**
    * Clase interna que maneja el evento de clic del botón "SALIR".
    * Cierra la aplicación cuando el botón es presionado.
    */
private  class ButtonClickListener implements ActionListener {
        /**
        * Método que se ejecuta al presionar el botón "SALIR".
        * Cierra la ventana actual.
        * @param e El evento de clic generado.
        */
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
           
           
              dispose();
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField ingresarcontraseña;
    private javax.swing.JTextField ingresarusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
