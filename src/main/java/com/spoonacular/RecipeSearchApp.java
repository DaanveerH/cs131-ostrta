package com.spoonacular;

import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.auth.ApiKeyAuth;
import com.spoonacular.DefaultApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RecipeSearchApp {
    private static final String API_KEY = "41a61e7ce95149b2975318bec5ac0783";

    public static void main(String[] args) {
        String baseUrl = "https://api.spoonacular.com/recipes/complexSearch";
        String query = "pasta";
        int maxFat = 25;
        int number = 2;

        // query URL
        String urlString = String.format("%s?query=%s&maxFat=%d&number=%d&apiKey=%s",
                baseUrl, query, maxFat, number, API_KEY);

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // check for successful response
            
            int responseCode = conn.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("HTTP request failed with code: " + responseCode);
                return;
            }

            // read the response
            Scanner scanner = new Scanner(url.openStream(), StandardCharsets.UTF_8.toString());
            scanner.useDelimiter("\\Z");
            String response = scanner.next();
            scanner.close();

            System.out.println("Response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
