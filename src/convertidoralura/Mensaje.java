package convertidoralura;

import javax.swing.JOptionPane;

public class Mensaje {

    public Mensaje() {
        // Constructor de la clase
    }

    private void MensajeSalida() {           
        JOptionPane.showMessageDialog(null, "Programa finalizado");
        System.exit(0);
    }

    public void MensajeResultado(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
        MensajeContinuar();
    }

    public void MensajeContinuar() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == opcion){
            new MenuInicio().MenuInicial();
        }else{
            MensajeSalida();
        }
    }

}
