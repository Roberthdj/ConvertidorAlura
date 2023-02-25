
package convertidoralura;

import javax.swing.JOptionPane;

public class ConvertirDinero {
    
    public void convertir(){           
        
      CapturarValor captura = new CapturarValor();
      captura.IngresoValor("Ingresa la cantidad de dinero que deseas convertir");
      ElegirMoneda(captura.getValorSalida());
    }
    
     private void ElegirMoneda(double valorEntrante) {

        double dolar = 4849.65, 
               euro = 5118.9, 
               libra = 5800.32, 
               yen = 35.64, 
               won = 3.71, 
               resultado = 0;
        
        String seleccionado, moneda = "";

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Moneda", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras",
                    "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos",
                    "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
                    "De Won Coreano a Pesos"},
                "opcion 1");

        seleccionado = seleccion.toString();

        switch (seleccionado) {
            case "De Pesos a Dólar":
                resultado = valorEntrante / dolar;
                moneda = "Dolares";
                break;
            case "De Dólar a Pesos":
                resultado = valorEntrante * dolar;
                moneda = "Pesos";
                break;
            case "De Pesos a Euro":
                resultado = valorEntrante / euro;
                moneda = "Euros";
                break;
            case "De Euro a Pesos":
                resultado = valorEntrante * euro;
                moneda = "Pesos";
                break;
            case "De Pesos a Libras":
                resultado = valorEntrante / libra;
                moneda = "Libras";
                break;
            case "De Libras a Pesos":
                System.out.println(valorEntrante);
                resultado = valorEntrante * libra;
                moneda = "Pesos";
                break;
            case "De Pesos a Yen":
                resultado = valorEntrante / yen;
                moneda = "Yenes";
                break;
            case "De Yen a Pesos":
                resultado = valorEntrante * yen;
                moneda = "Pesos";
                break;
            case "De Pesos a Won Coreano":
                resultado = valorEntrante / won;
                moneda = "Wones";
                break;
            case "De Won Coreano a Pesos":
                resultado = valorEntrante * won;
                moneda = "Pesos";
                break;
            default:
                new Mensaje().MensajeContinuar();
                break;
        }
        
        new Mensaje().MensajeResultado("Usted tiene " + " " +  String.format("%.2f", resultado) + " " + moneda);    
    }
    
}
