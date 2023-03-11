package convertidoralura;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ConsumirApi {

    private double pesoEnDolares = 0;
    private double pesoEnEuros = 0;
    private double pesoEnLibras = 0;
    private double pesoEnYenes = 0;
    private double pesoEnWones = 0;

    public void optenerMonedas() {

        String urlApi = "https://api.apilayer.com/fixer/latest?base=COP";

        try {

            URL url = new URL(urlApi);
            HttpURLConnection urlConexion = (HttpURLConnection) url.openConnection(); 
            urlConexion.setRequestProperty("apikey", "rl5nCfpm6dB4CeSpJggv420pKdAcwvQo");
            urlConexion.setRequestMethod("GET");
            urlConexion.connect();

            int responseCode = urlConexion.getResponseCode();

            if (responseCode != 200) {

                throw new RuntimeException("Ha ocurrido un error " + responseCode);

            } else {

                StringBuilder almacenDatos = new StringBuilder();
                Scanner flujoDatos = new Scanner(urlConexion.getInputStream());

                while (flujoDatos.hasNext()) {

                    almacenDatos.append(flujoDatos.nextLine());

                }

                flujoDatos.close();

                JSONObject jsonObject = new JSONObject(almacenDatos.toString());

                pesoEnDolares = jsonObject.getJSONObject("rates").getDouble("USD");
                pesoEnEuros = jsonObject.getJSONObject("rates").getDouble("EUR");
                pesoEnLibras = jsonObject.getJSONObject("rates").getDouble("GBP");
                pesoEnYenes = jsonObject.getJSONObject("rates").getDouble("JPY");
                pesoEnWones = jsonObject.getJSONObject("rates").getDouble("KRW");

//                System.out.println("Dolar: " + pesoEnDolares + "\n" + "Euro: " + pesoEnEuros + "\n" + "Libra Esterlina: "
//                        + pesoEnLibras + "\n" + "Yen Japones: " + pesoEnYenes + "\n" + "Won Coreano: " + pesoEnWones);
            }

        } catch (IOException | RuntimeException ex) {
            System.out.println(ex);
        }
    }

    public double getPesoEnDolares() {
        return pesoEnDolares;
    }

    public double getPesoEnEuros() {
        return pesoEnEuros;
    }

    public double getPesoEnLibras() {
        return pesoEnLibras;
    }

    public double getPesoEnYenes() {
        return pesoEnYenes;
    }

    public double getPesoEnWones() {
        return pesoEnWones;
    }

}
