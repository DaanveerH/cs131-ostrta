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
import com.spoonacular.client.model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric;
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
 * GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:10:15.275701200+01:00[Europe/Berlin]")
public class GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric metric;

  public static final String SERIALIZED_NAME_US = "us";
  @SerializedName(SERIALIZED_NAME_US)
  private GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric us;

  public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures() {
  }

  public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures metric(GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nonnull
  public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric getMetric() {
    return metric;
  }

  public void setMetric(GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric metric) {
    this.metric = metric;
  }


  public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures us(GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric us) {
    this.us = us;
    return this;
  }

   /**
   * Get us
   * @return us
  **/
  @javax.annotation.Nonnull
  public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric getUs() {
    return us;
  }

  public void setUs(GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric us) {
    this.us = us;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures getRecipeInformation200ResponseExtendedIngredientsInnerMeasures = (GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures) o;
    return Objects.equals(this.metric, getRecipeInformation200ResponseExtendedIngredientsInnerMeasures.metric) &&
        Objects.equals(this.us, getRecipeInformation200ResponseExtendedIngredientsInnerMeasures.us);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, us);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    us: ").append(toIndentedString(us)).append("\n");
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
    openapiFields.add("metric");
    openapiFields.add("us");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metric");
    openapiRequiredFields.add("us");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures is not found in the empty JSON string", GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `metric`
      GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric.validateJsonElement(jsonObj.get("metric"));
      // validate the required field `us`
      GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric.validateJsonElement(jsonObj.get("us"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures>() {
           @Override
           public void write(JsonWriter out, GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures
  * @throws IOException if the JSON string is invalid with respect to GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures
  */
  public static GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.class);
  }

 /**
  * Convert an instance of GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
