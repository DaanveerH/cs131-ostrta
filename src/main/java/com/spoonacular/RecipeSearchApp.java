package com.spoonacular;

import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.JSON;
import com.spoonacular.client.auth.ApiKeyAuth;

import com.spoonacular.DefaultApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.*;
import org.bson.Document;

public class RecipeSearchApp {
    private static final String API_KEY = "48fef9e60f35484db667e103f75d1594";

    public static void main(String str, int x) { // originally: public static void main (String[] args) {
        String baseUrl = "https://api.spoonacular.com/recipes/complexSearch";
        String query = str;	// what to search for, can include multiple ingredients 
        int numberToShow = x;					// number of results to show


        
        // Construct query URL (new attempt)
        String urlString = String.format("%s?query=%s&number=%d&apiKey=%s", baseUrl, query, numberToShow, API_KEY);
        // TODO: JSON => import org.JSON.*;   (DONE)
        
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
            //String response = scanner.next();
            //System.out.println(response);
            
            JSONObject responseJO = new JSONObject(scanner.next());
            int response = responseJO.getInt("totalResults");
            System.out.println(response + "recipes available, showing " + numberToShow);
            JSONArray responseList = responseJO.getJSONArray("results");
            
            for(int i = 0; i < responseList.length(); i++) {
            	JSONObject tempJO = responseList.getJSONObject(i);
            	int recipeId = tempJO.getInt("id");
            	String recipeName = tempJO.getString("title");
            	System.out.println(recipeId + ": " + recipeName);
            }
            
            scanner.close();
            
            
            //System.out.println(numAvailable + " recipes, showing first " + numberList + " recipes");
            //for (int j = 0; i < recipeList.size(); j++) {
            //	System.out.println(recipeList.get(j).getId() + ": " + recipeList.get(j).getTitle());
            //}
            
            
            
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    } // end main
}
