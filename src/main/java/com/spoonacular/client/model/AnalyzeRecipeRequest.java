/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * AnalyzeRecipeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:10:15.275701200+01:00[Europe/Berlin]")
public class AnalyzeRecipeRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_INCLUDE_NUTRITION = "includeNutrition";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NUTRITION)
  private Boolean includeNutrition;

  public static final String SERIALIZED_NAME_INCLUDE_TASTE = "includeTaste";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TASTE)
  private Boolean includeTaste;

  public AnalyzeRecipeRequest() {
  }

  public AnalyzeRecipeRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The input language, either \&quot;en\&quot; or \&quot;de\&quot;.
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public AnalyzeRecipeRequest includeNutrition(Boolean includeNutrition) {
    this.includeNutrition = includeNutrition;
    return this;
  }

   /**
   * Whether nutrition data should be added to correctly parsed ingredients.
   * @return includeNutrition
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeNutrition() {
    return includeNutrition;
  }

  public void setIncludeNutrition(Boolean includeNutrition) {
    this.includeNutrition = includeNutrition;
  }


  public AnalyzeRecipeRequest includeTaste(Boolean includeTaste) {
    this.includeTaste = includeTaste;
    return this;
  }

   /**
   * Whether taste data should be added to correctly parsed ingredients.
   * @return includeTaste
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeTaste() {
    return includeTaste;
  }

  public void setIncludeTaste(Boolean includeTaste) {
    this.includeTaste = includeTaste;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeRecipeRequest analyzeRecipeRequest = (AnalyzeRecipeRequest) o;
    return Objects.equals(this.language, analyzeRecipeRequest.language) &&
        Objects.equals(this.includeNutrition, analyzeRecipeRequest.includeNutrition) &&
        Objects.equals(this.includeTaste, analyzeRecipeRequest.includeTaste);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, includeNutrition, includeTaste);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeRecipeRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    includeNutrition: ").append(toIndentedString(includeNutrition)).append("\n");
    sb.append("    includeTaste: ").append(toIndentedString(includeTaste)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("language");
    openapiFields.add("includeNutrition");
    openapiFields.add("includeTaste");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AnalyzeRecipeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnalyzeRecipeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeRecipeRequest is not found in the empty JSON string", AnalyzeRecipeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnalyzeRecipeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalyzeRecipeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeRecipeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeRecipeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeRecipeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeRecipeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeRecipeRequest>() {
           @Override
           public void write(JsonWriter out, AnalyzeRecipeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyzeRecipeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyzeRecipeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeRecipeRequest
  * @throws IOException if the JSON string is invalid with respect to AnalyzeRecipeRequest
  */
  public static AnalyzeRecipeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeRecipeRequest.class);
  }

 /**
  * Convert an instance of AnalyzeRecipeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

