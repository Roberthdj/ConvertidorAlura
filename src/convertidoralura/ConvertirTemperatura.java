package convertidoralura;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    public void convertir() {

        CapturarValor captura = new CapturarValor();
        captura.IngresoValor("Ingresa el valor que deseas convertir");
        ElegirGrados(captura.getValorSalida());
    }

    private void ElegirGrados(double valorEntrante) {

        double resultado = 0;

        String seleccionado,
                texto = "";

        String[] lista = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
            "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"};

        ImageIcon icono = new ImageIcon("imagen/termometro.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Escala de temperatura", JOptionPane.PLAIN_MESSAGE, icono,
                lista, lista[0]);

        if (seleccion != null) {

            seleccionado = seleccion.toString();

            switch (seleccionado) {
                case "De Celsius a Fahrenheit":
                    resultado = (valorEntrante * 1.8) + 32;
                    texto = "Fahrenheit";
                    break;
                case "De Fahrenheit a Celsius":
                    resultado = (valorEntrante - 32) / 1.8;
                    texto = "Celsius";
                    break;
                case "De Celsius a Kelvin":
                    resultado = valorEntrante + 273.15;
                    texto = "Kelvin";
                    break;
                case "De Kelvin a Celsius":
                    resultado = valorEntrante - 273.15;
                    texto = "Celsius";
                    break;
                case "De Fahrenheit a Kelvin":
                    resultado = (valorEntrante - 32) * 5 / 9 + 273.15;
                    texto = "Kelvin";
                    break;
                case "De Kelvin a Fahrenheit":
                    resultado = 1.8 * (valorEntrante - 273.15) + 32;
                    texto = "Fahrenheit";
                    break;
                default:
                    new Mensaje().MensajeContinuar();
                    break;
            }

            new Mensaje().MensajeResultado("Usted tiene " + " " + String.format("%.2f", resultado) + " grados " + texto);

        } else {
            
            new ConvertirTemperatura().convertir();
            
        }
    }

}
