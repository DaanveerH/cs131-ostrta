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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:10:15.275701200+01:00[Europe/Berlin]")
public class MapIngredientsToGroceryProductsRequest {
  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private List<String> ingredients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private BigDecimal servings;

  public MapIngredientsToGroceryProductsRequest() {
  }

  public MapIngredientsToGroceryProductsRequest ingredients(List<String> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public MapIngredientsToGroceryProductsRequest addIngredientsItem(String ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nonnull
  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }


  public MapIngredientsToGroceryProductsRequest servings(BigDecimal servings) {
    this.servings = servings;
    return this;
  }

   /**
   * Get servings
   * @return servings
  **/
  @javax.annotation.Nonnull
  public BigDecimal getServings() {
    return servings;
  }

  public void setServings(BigDecimal servings) {
    this.servings = servings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapIngredientsToGroceryProductsRequest mapIngredientsToGroceryProductsRequest = (MapIngredientsToGroceryProductsRequest) o;
    return Objects.equals(this.ingredients, mapIngredientsToGroceryProductsRequest.ingredients) &&
        Objects.equals(this.servings, mapIngredientsToGroceryProductsRequest.servings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredients, servings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapIngredientsToGroceryProductsRequest {\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
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
    openapiFields.add("ingredients");
    openapiFields.add("servings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ingredients");
    openapiRequiredFields.add("servings");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MapIngredientsToGroceryProductsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MapIngredientsToGroceryProductsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MapIngredientsToGroceryProductsRequest is not found in the empty JSON string", MapIngredientsToGroceryProductsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MapIngredientsToGroceryProductsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MapIngredientsToGroceryProductsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MapIngredientsToGroceryProductsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ingredients") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ingredients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MapIngredientsToGroceryProductsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MapIngredientsToGroceryProductsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MapIngredientsToGroceryProductsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MapIngredientsToGroceryProductsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MapIngredientsToGroceryProductsRequest>() {
           @Override
           public void write(JsonWriter out, MapIngredientsToGroceryProductsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MapIngredientsToGroceryProductsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MapIngredientsToGroceryProductsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MapIngredientsToGroceryProductsRequest
  * @throws IOException if the JSON string is invalid with respect to MapIngredientsToGroceryProductsRequest
  */
  public static MapIngredientsToGroceryProductsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MapIngredientsToGroceryProductsRequest.class);
  }

 /**
  * Convert an instance of MapIngredientsToGroceryProductsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

