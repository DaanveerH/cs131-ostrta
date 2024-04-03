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
    private static final String API_KEY = "48fef9e60f35484db667e103f75d1594";

    public static void main(String str, int x) { // originally: public static void main (String[] args) {
        String baseUrl = "https://api.spoonacular.com/recipes/complexSearch";
        String query = str;	// what to search for, can include multiple ingredients 
        // above line originally : String query = "pasta";
        int maxFat = 100;						// limits results to fat content below this value
        int number = x;							// number of results to show

        // Construct the query URL
        String urlString = String.format("%s?query=%s&maxFat=%d&number=%d&apiKey=%s",
                baseUrl, query, maxFat, number, API_KEY);
        		// originally: String urlString = String.format("%s?query=%s&maxFat=%d&number=%d&apiKey=%s",
        		// 					   baseUrl, query, maxFat, number, API_KEY); 

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Check for successful response
            
            int responseCode = conn.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("HTTP request failed with code: " + responseCode);
                return;
            }

            // Read the response
            Scanner scanner = new Scanner(url.openStream(), StandardCharsets.UTF_8.toString());
            scanner.useDelimiter("\\Z");
            
            // split response into multiple lines
            /*
            String[] responseList = new String[x];  // create String array of X size, x = number of responses to show
            for (int i=0; i < x; i++) {
            	responseList[i] = scanner.next();
            	System.out.println(responseList[i]);
            }// end for loop
            */
            
            // original code
            String response = scanner.next();
            scanner.close();

            // original code
            System.out.println("Response: " + response);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    } // end main
}