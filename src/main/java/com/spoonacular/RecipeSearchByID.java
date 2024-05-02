package com.spoonacular;

import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.auth.ApiKeyAuth;
import com.mongodb.quickstart.HelloMongoDB;
import com.mongodb.quickstart.JSONParse;
import com.mongodb.quickstart.MongoDBSave;
import com.spoonacular.DefaultApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.json.*;
import org.bson.Document;

public class RecipeSearchByID {
    private static final String API_KEY = "48fef9e60f35484db667e103f75d1594";

    public static void main(int x, boolean nutritionResponse, boolean wineResponse, boolean tasteResponse, Scanner userInput) {
        int      recipeId         = x;						// recipeID to search
        boolean  includeNutrition = nutritionResponse;		// want to include nutrition info of recipe?
        boolean  addWinePairing   = wineResponse;			// want to include wine that pairs with recipe?
        boolean  addTasteData     = tasteResponse;			// want to include taste data of recipe?
        String   baseUrl          = "https://api.spoonacular.com/recipes/" + recipeId + "/information";
        String   response         = "";
        Document recipeResponse	  = new Document();
        int 	 menuOption1	  = 1;
        String   noMoreLoopString = "q";
        int      userInputInt;
        String   userIn           = "";
        boolean  noMoreLoopBool	  = true;
        
        // Construct query URL
        String urlString = String.format("%s?includeNutrition=%b&addWinePairing=%b&addTasteData=%b&apiKey=%s", 
        										baseUrl, includeNutrition, addWinePairing, addTasteData, API_KEY);
        
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
            // original code
            scanner.useDelimiter("\\Z");
            
            /* //split response into multiple lines
            scanner.useDelimiter("\\Z");
            while(scanner.hasNext()) {
            	System.out.println(scanner.next());
            } // end while
            */
            
            response = scanner.next();
            scanner.close();
            System.out.println("");
            JSONParse.main(response);
            /*  testing
            JSONObject responseJO = new JSONObject(response);
        	String recipeName = responseJO.getString("title");
        	System.out.println(recipeName);
        	System.out.println("----------------");
        	
        	
    		JSONArray ingredientList = responseJO.getJSONArray("extendedIngredients");
    		System.out.println("ingredients used:");
            
            for(int i = 0; i < ingredientList.length(); i++) {
            	JSONObject tempJO = ingredientList.getJSONObject(i);
            	String ingredientName = tempJO.getString("nameClean");
            	int ingredientAmount = tempJO.getInt("amount");
            	String ingredientUnit = tempJO.getString("unit");
            	System.out.println(ingredientName + ": " + ingredientAmount + ingredientUnit);
            }
        	
            System.out.println("");
            System.out.println("instructions:");
            JSONArray instructionList = responseJO.getJSONArray("analyzedInstructions");
            JSONObject instructionList2 = instructionList.getJSONObject(0);
            JSONArray stepList = instructionList2.getJSONArray("steps");
            
            for (int i = 0; i < instructionList2.length(); i++){
            	JSONObject tempJO = stepList.getJSONObject(i);
            	int stepNum = tempJO.getInt("number");
            	String stepInstruction = tempJO.getString("step");
            	//int lengthNum = tempJO.getInt("number");
            	//String lengthUnit = tempJO.getString("unit");
            	System.out.println(stepNum + ": " + stepInstruction);
            	//System.out.println("for "+ lengthNum + " " + lengthUnit);
            }
            
            
        	// print out parameters
        	//System.out.println("Name: " + recipeName);
            */
            
            //System.out.println("Recipe: " + response);
            System.out.println("");
        	System.out.println("1: save recipe");
        	System.out.println("any other key: new search");
            
            userIn = userInput.next();
			if (HelloMongoDB.isNumber(userIn)) {
    			userInputInt = Integer.parseInt(userIn);
    			if ( userInputInt == menuOption1) { // save recipe
    	            // save recipe to MongoDB
    	            MongoDBSave.main(response);
    			} // end menuOption1
    		} // end if isNumber  
        } // end try 
        catch (IOException e) {
            e.printStackTrace();
        } // end catch
        
    } // end main
} // end class
