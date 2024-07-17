
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.sql.SQLOutput;
import java.util.Scanner;

public class API {


    public void AtraerApi(String monedaSinConvertir , String monedaConvertida, double valorConvertir) {

        Gson gson = new Gson();

        try {

            String direccion = "https://v6.exchangerate-api.com/v6/87a9fe6a962c5f3f9504b1de/pair/" + monedaSinConvertir + "/" + monedaConvertida;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            ConversionesDeMonedas conversorMoneda = gson.fromJson(json, ConversorMonedas.class);
            Conversion conversion = new Conversion(conversorMoneda);
            Opciones opciones = new Opciones();
            var multiplicacion =conversion.valorMoneda * valorConvertir;
            System.out.println("el valor de " + valorAConvertir + " [" + monedaSinConvertir + "] Es igual a " + multiplicacion + " [" + monedaConvertida +"]");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
