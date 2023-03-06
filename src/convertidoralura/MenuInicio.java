package convertidoralura;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuInicio {

    public void MenuInicial() {
        
        String [] lista={"Conversor de moneda", "Conversor de temperatura", "Conversor de masa"};
        
        ImageIcon icono = new ImageIcon("imagen/convertir.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, icono, lista, lista[0]);
  

        if (seleccion != null) {
            SeleccionMenu(seleccion.toString());
        } else {
            new Mensaje().MensajeContinuar(); 
        }
    }

    private void SeleccionMenu(String seleccionMenu) {

        String resp = seleccionMenu;

        switch (resp) {
            case "Conversor de moneda":
                new ConvertirDinero().convertir();
                break;
            case "Conversor de temperatura":
                new ConvertirTemperatura().convertir();
                break;
            case "Conversor de masa":
                new ConvertirMasa().convertir();
                break;
            default:
                new Mensaje().MensajeContinuar();
                break;
        }

    }

}
