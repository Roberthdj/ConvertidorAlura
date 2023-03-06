package convertidoralura;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConvertirMasa {

    public void convertir() {

        CapturarValor captura = new CapturarValor();
        captura.IngresoValor("Ingresa la cantidad que deseas convertir");
        ElegirMasa(captura.getValorSalida());
    }

    private void ElegirMasa(double valorEntrante) {

        double onza = 28.3495,
                libra = 453.59,
                kilo = 1000,
                resultado = 0;

        String seleccionado,
                texto = "";

        String[] lista = {"De Gramos a Onzas", "De Gramos a Libras", "De Gramos a Kilogramos",
            "De Onzas a Gramos", "De Libras a Gramos", "De Kilogramos a Gramos"};

        ImageIcon icono = new ImageIcon("imagen/balanza.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Escala de temperatura", JOptionPane.PLAIN_MESSAGE, icono,
                lista, lista[0]);

        if (seleccion != null) {

            seleccionado = seleccion.toString();

            switch (seleccionado) {
                case "De Gramos a Onzas":
                    resultado = valorEntrante / onza;
                    texto = "Onzas";
                    break;
                case "De Onzas a Gramos":
                    resultado = valorEntrante * onza;
                    texto = "Gramos";
                    break;
                case "De Gramos a Libras":
                    resultado = valorEntrante / libra;
                    texto = "Libras";
                    break;
                case "De Libras a Gramos":
                    resultado = valorEntrante * libra;
                    texto = "Gramos";
                    break;
                case "De Gramos a Kilogramos":
                    resultado = valorEntrante / kilo;
                    texto = "Kilogramos";
                    break;
                case "De Kilogramos a Gramos":
                    resultado = valorEntrante * kilo;
                    texto = "Gramos";
                    break;
                default:
                    new Mensaje().MensajeContinuar();
                    break;
            }

            new Mensaje().MensajeResultado("Usted tiene " + " " + String.format("%.2f", resultado) + " " + texto);
       
        } else {
            
             new ConvertirMasa().convertir();
             
        }

    }
}
