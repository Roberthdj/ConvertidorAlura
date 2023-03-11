package convertidoralura;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConvertirDinero {

    public void convertir() {

        CapturarValor captura = new CapturarValor();
        captura.IngresoValor("Ingresa la cantidad de dinero que deseas convertir");
        ElegirMoneda(captura.getValorSalida());
    }

    private void ElegirMoneda(double valorEntrante) {

        ConsumirApi moneda = new ConsumirApi();
        moneda.optenerMonedas();

        double pesoEnDolares = moneda.getPesoEnDolares(),
                pesoEnEuros = moneda.getPesoEnEuros(),
                pesoEnLibras = moneda.getPesoEnLibras(),
                pesoEnYenes = moneda.getPesoEnYenes(),
                pesoEnWones = moneda.getPesoEnWones(),
                resultado = 0;

        String seleccionado,
                texto = "";

        String[] lista = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras",
            "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos",
            "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"};

        ImageIcon icono = new ImageIcon("imagen/intercambio.png");

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Moneda", JOptionPane.PLAIN_MESSAGE, icono, lista, lista[0]);

        if (seleccion != null) {

            seleccionado = seleccion.toString();

            switch (seleccionado) {
                case "De Pesos a Dólar":
                    resultado = pesoEnDolares * valorEntrante;
                    texto = "Dolares";
                    break;
                case "De Dólar a Pesos":
                    resultado = valorEntrante / pesoEnDolares;
                    texto = "Pesos";
                    break;
                case "De Pesos a Euro":
                    resultado = pesoEnEuros * valorEntrante;
                    texto = "Euros";
                    break;
                case "De Euro a Pesos":
                    resultado = valorEntrante / pesoEnEuros;
                    texto = "Pesos";
                    break;
                case "De Pesos a Libras":
                    resultado = pesoEnLibras * valorEntrante;
                    texto = "Libras";
                    break;
                case "De Libras a Pesos":
                    resultado = valorEntrante / pesoEnLibras;
                    texto = "Pesos";
                    break;
                case "De Pesos a Yen":
                    resultado = pesoEnYenes * valorEntrante;
                    texto = "Yenes";
                    break;
                case "De Yen a Pesos":
                    resultado = valorEntrante / pesoEnYenes;
                    texto = "Pesos";
                    break;
                case "De Pesos a Won Coreano":
                    resultado = pesoEnWones * valorEntrante;
                    texto = "Wones";
                    break;
                case "De Won Coreano a Pesos":
                    resultado = valorEntrante / pesoEnWones;
                    texto = "Pesos";
                    break;
                default:
                    new Mensaje().MensajeContinuar();
                    break;
            }

            new Mensaje().MensajeResultado("Usted tiene " + " " + String.format("%.2f", resultado) + " " + texto);

        } else {

            new ConvertirDinero().convertir();

        }
    }

}
