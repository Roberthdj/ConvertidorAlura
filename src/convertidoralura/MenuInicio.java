
package convertidoralura;

import javax.swing.JOptionPane;

public class MenuInicio {
    
    public void MenuInicial() {
        
        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Conversor de moneda", "Conversor de temperatura", "Conversor de longitud", "Conversor de masa"},
                "opcion 1");

        if (seleccion != null) {
            SeleccionMenu(seleccion.toString());
        } else {
            new Mensaje().MensajeContinuar();
        }
    }

    private void SeleccionMenu(String seleccionMenu) {

        String resp = seleccionMenu;

        if (resp.equals("Conversor de moneda")) {
            new ConvertirDinero().convertir();
            
        } else if (resp.equals("Conversor de temperatura")) {
            System.out.println("temperatura");
            
        } else if (resp.equals("Conversor de longitud")) {
            System.out.println("longitud");
            
        } else if (resp.equals("Conversor de masa")) {
            System.out.println("masa");
            
        }else {
            new Mensaje().MensajeContinuar();
        }
        
    } 
    

}
