package convertidoralura;

import javax.swing.JOptionPane;

public class MenuInicio {

    public void MenuInicial() {

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Conversor de moneda", "Conversor de temperatura", "Conversor de masa"},
                "opcion 1");

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
