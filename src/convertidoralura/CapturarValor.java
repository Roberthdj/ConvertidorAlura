package convertidoralura;

import javax.swing.JOptionPane;

public class CapturarValor {
    
    double valorSalida;

    public CapturarValor() {
        // Constructor de la clase
    }
    

    public double getValorSalida() {
        return valorSalida;
    }  
    

    public void IngresoValor(String mensaje) {

        String valor = JOptionPane.showInputDialog(null, mensaje, "Entrada",
                JOptionPane.QUESTION_MESSAGE);

        if (valor != null) {
            try {
                this.valorSalida = Double.parseDouble(valor);
            } catch (Exception e) {
                System.out.println("Error al convertir el valor: --> " + e);
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numérico");
                new Mensaje().MensajeContinuar(); // Podria cambiarse a Iniciar nuevamente la aplicacion
            }
        } else {
            new Mensaje().MensajeContinuar();
        }
    }   
}
