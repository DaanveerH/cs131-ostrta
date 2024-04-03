package com.mongodb.quickstart;

// Import classes:
import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.auth.*;
import com.spoonacular.client.model.*;
import com.spoonacular.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spoonacular.com");
    
    // Configure API key authorization: apiKeyScheme
    ApiKeyAuth apiKeyScheme = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyScheme");
    apiKeyScheme.setApiKey("7cb3e9034ba5474f9d2ba234e9346152");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyScheme.setApiKeyPrefix("test");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AnalyzeRecipeRequest analyzeRecipeRequest = new AnalyzeRecipeRequest(); // AnalyzeRecipeRequest | Example request body.
    String language = "en"; // String | The input language, either \"en\" or \"de\".
    Boolean includeNutrition = false; // Boolean | Whether nutrition data should be added to correctly parsed ingredients.
    Boolean includeTaste = false; // Boolean | Whether taste data should be added to correctly parsed ingredients.
    try {
      Object result = apiInstance.analyzeRecipe(analyzeRecipeRequest, language, includeNutrition, includeTaste);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#analyzeRecipe");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
