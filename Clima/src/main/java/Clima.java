import com.fasterxml.jackson.databind.ObjectMapper;
import modelo.Respuesta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Clima {
    private static String API_KEY = ""; // Clave de usuario al registrarse en el sitio https://openweathermap.org/
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&APPID=%s&lang=es&units=metric";
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String RESET = "\033[0m";  // Text Reset

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String ciudad = "San Francisco,cba,ar";
        if(args.length > 0) {
            ciudad = args[0];
        } else {
            System.out.printf("Ingrese una ciudad para verificar el clima: ");
            ciudad = scanner.nextLine();
        }

        String apiUrl = String.format(API_URL, ciudad, API_KEY);
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if(connection.getResponseCode() == 404) {
            System.out.println("Ciudad no encontrada");
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        ObjectMapper objectMapper = new ObjectMapper();
        Respuesta respuesta = objectMapper.readValue(response.toString(), Respuesta.class);

        System.out.println("Para hoy se espera: " +GREEN+ respuesta.getWeather().get(0).getDescription() + RESET);
        System.out.println("Temp.: " + GREEN + respuesta.getMain().getTemp() + "º" + RESET);
        System.out.println("Sensación térmica: " + GREEN + respuesta.getMain().getFeelsLike() + "º" + RESET);
        System.out.println("Max.: " + GREEN + respuesta.getMain().getTempMax() + "º" + RESET);
        System.out.println("Min.: " + GREEN + respuesta.getMain().getTempMin() + "º" + RESET);
        System.out.println("Humedad.: " + GREEN + respuesta.getMain().getHumidity()+ "%" + RESET);
        System.out.println("Presión: " + GREEN + respuesta.getMain().getPressure() + "hPa" + RESET);
        System.out.println("Latitud: " + GREEN + respuesta.getCoord().get("lat") + RESET);
        System.out.println("Longitud: " + GREEN + respuesta.getCoord().get("lon") + RESET);

        System.out.println(objectMapper.writeValueAsString(respuesta));
    }
}
