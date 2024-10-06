
package claseCalcu;

import interfaz.LOGIN; // Asegúrate de que la clase Login esté en el paquete igu.
//import javax.swing.ImageIcon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * La clase Calculadora es el punto de entrada de la aplicación.
 * Se encarga de iniciar la interfaz de login y proporciona métodos para calcular
 * el interés simple y guardar datos en un archivo de texto.
 * @author Dylan
 * @version 1.0
 */
public class Calculadora {
    /**
     * Método principal que inicia la aplicación.
     * Llama a la clase LOGIN para mostrar la ventana de inicio de sesión.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LOGIN(); // Crea e inicia la ventana del login
        });
        
    }
    
     /**
     * Método para calcular el interés simple.
     * Ajusta la tasa de interés y el tiempo según las selecciones del usuario
     * y calcula el interés simple basado en el monto inicial, tasa de interés y tiempo.
     * @param montoInicial El monto inicial del préstamo.
     * @param tasaInteres La tasa de interés aplicada.
     * @param tiempo El tiempo durante el cual se aplicará el interés.
     * @param tipoInteres El tipo de interés (mensual o anual).
     * @param tipoTiempo El tipo de tiempo (años o meses).
     * @return El interés simple calculado.
     */
    public static double calcularInteresSimple(double montoInicial, double tasaInteres, int tiempo, String tipoInteres, String tipoTiempo) {
        // Ajustar la tasa de interés y el tiempo según las selecciones del usuario
        if (tipoInteres.equals("mensual") && tipoTiempo.equals("años")) {
            tiempo = tiempo * 12; // convertir años a meses
        } else if (tipoInteres.equals("anual") && tipoTiempo.equals("meses")) {
            tiempo = tiempo / 12; // convertir meses a años
        }
        
        // Calcular el interés simple
        return montoInicial * tasaInteres * tiempo;
    }
    
    /**
     * Método para guardar los datos del cliente en un archivo de texto.
     * Escribe los detalles del prestamista, cliente, monto inicial, tasa de interés,
     * tiempo e interés simple calculado en un archivo.
     * @param prestamista El nombre del prestamista.
     * @param cliente El nombre del cliente.
     * @param montoInicial El monto inicial del préstamo.
     * @param tasaInteres La tasa de interés aplicada.
     * @param tipoInteres El tipo de interés (mensual o anual).
     * @param tiempo El tiempo durante el cual se aplicará el interés.
     * @param tipoTiempo El tipo de tiempo (años o meses).
     * @param interesSimple El interés simple calculado.
     */
    public static void guardarTxt(String prestamista, String cliente, double montoInicial, double tasaInteres, String tipoInteres, int tiempo, String tipoTiempo, double interesSimple) {
       String archivo = "DATOS DEL CLIENTE " + cliente + ".txt"  ;
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter (escribir); 
            buffer.write("Prestamista: " + prestamista);
            buffer.newLine();
            buffer.write("Cliente: " + cliente);
            buffer.newLine();
            buffer.write("Monto Inicial: " + montoInicial);
            buffer.newLine();
            buffer.write("Tasa de Interés: " + tasaInteres +" " + tipoInteres);
            buffer.newLine();
            buffer.write("Tiempo: " + tiempo + " " + tipoTiempo);
            buffer.newLine();
            buffer.write("Interés Simple Calculado: " + interesSimple);
            buffer.newLine();
            buffer.write("----------------------------");
            buffer.newLine();
            // Asegurarse de que se guarden los datos en el archivo
        buffer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    


