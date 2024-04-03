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
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionCaloricBreakdown;
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionNutrientsInner;
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionPropertiesInner;
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionWeightPerServing;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * ParseIngredients200ResponseInnerNutrition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:10:15.275701200+01:00[Europe/Berlin]")
public class ParseIngredients200ResponseInnerNutrition {
  public static final String SERIALIZED_NAME_NUTRIENTS = "nutrients";
  @SerializedName(SERIALIZED_NAME_NUTRIENTS)
  private Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> properties = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_FLAVONOIDS = "flavonoids";
  @SerializedName(SERIALIZED_NAME_FLAVONOIDS)
  private Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> flavonoids = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CALORIC_BREAKDOWN = "caloricBreakdown";
  @SerializedName(SERIALIZED_NAME_CALORIC_BREAKDOWN)
  private ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown;

  public static final String SERIALIZED_NAME_WEIGHT_PER_SERVING = "weightPerServing";
  @SerializedName(SERIALIZED_NAME_WEIGHT_PER_SERVING)
  private ParseIngredients200ResponseInnerNutritionWeightPerServing weightPerServing;

  public ParseIngredients200ResponseInnerNutrition() {
  }

  public ParseIngredients200ResponseInnerNutrition nutrients(Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public ParseIngredients200ResponseInnerNutrition addNutrientsItem(ParseIngredients200ResponseInnerNutritionNutrientsInner nutrientsItem) {
    if (this.nutrients == null) {
      this.nutrients = new LinkedHashSet<>();
    }
    this.nutrients.add(nutrientsItem);
    return this;
  }

   /**
   * Get nutrients
   * @return nutrients
  **/
  @javax.annotation.Nonnull
  public Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> getNutrients() {
    return nutrients;
  }

  public void setNutrients(Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients) {
    this.nutrients = nutrients;
  }


  public ParseIngredients200ResponseInnerNutrition properties(Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> properties) {
    this.properties = properties;
    return this;
  }

  public ParseIngredients200ResponseInnerNutrition addPropertiesItem(ParseIngredients200ResponseInnerNutritionPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new LinkedHashSet<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nonnull
  public Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> getProperties() {
    return properties;
  }

  public void setProperties(Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> properties) {
    this.properties = properties;
  }


  public ParseIngredients200ResponseInnerNutrition flavonoids(Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> flavonoids) {
    this.flavonoids = flavonoids;
    return this;
  }

  public ParseIngredients200ResponseInnerNutrition addFlavonoidsItem(ParseIngredients200ResponseInnerNutritionPropertiesInner flavonoidsItem) {
    if (this.flavonoids == null) {
      this.flavonoids = new LinkedHashSet<>();
    }
    this.flavonoids.add(flavonoidsItem);
    return this;
  }

   /**
   * Get flavonoids
   * @return flavonoids
  **/
  @javax.annotation.Nonnull
  public Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> getFlavonoids() {
    return flavonoids;
  }

  public void setFlavonoids(Set<ParseIngredients200ResponseInnerNutritionPropertiesInner> flavonoids) {
    this.flavonoids = flavonoids;
  }


  public ParseIngredients200ResponseInnerNutrition caloricBreakdown(ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
    return this;
  }

   /**
   * Get caloricBreakdown
   * @return caloricBreakdown
  **/
  @javax.annotation.Nonnull
  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown getCaloricBreakdown() {
    return caloricBreakdown;
  }

  public void setCaloricBreakdown(ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
  }


  public ParseIngredients200ResponseInnerNutrition weightPerServing(ParseIngredients200ResponseInnerNutritionWeightPerServing weightPerServing) {
    this.weightPerServing = weightPerServing;
    return this;
  }

   /**
   * Get weightPerServing
   * @return weightPerServing
  **/
  @javax.annotation.Nonnull
  public ParseIngredients200ResponseInnerNutritionWeightPerServing getWeightPerServing() {
    return weightPerServing;
  }

  public void setWeightPerServing(ParseIngredients200ResponseInnerNutritionWeightPerServing weightPerServing) {
    this.weightPerServing = weightPerServing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseIngredients200ResponseInnerNutrition parseIngredients200ResponseInnerNutrition = (ParseIngredients200ResponseInnerNutrition) o;
    return Objects.equals(this.nutrients, parseIngredients200ResponseInnerNutrition.nutrients) &&
        Objects.equals(this.properties, parseIngredients200ResponseInnerNutrition.properties) &&
        Objects.equals(this.flavonoids, parseIngredients200ResponseInnerNutrition.flavonoids) &&
        Objects.equals(this.caloricBreakdown, parseIngredients200ResponseInnerNutrition.caloricBreakdown) &&
        Objects.equals(this.weightPerServing, parseIngredients200ResponseInnerNutrition.weightPerServing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutrients, properties, flavonoids, caloricBreakdown, weightPerServing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseIngredients200ResponseInnerNutrition {\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    flavonoids: ").append(toIndentedString(flavonoids)).append("\n");
    sb.append("    caloricBreakdown: ").append(toIndentedString(caloricBreakdown)).append("\n");
    sb.append("    weightPerServing: ").append(toIndentedString(weightPerServing)).append("\n");
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
    openapiFields.add("nutrients");
    openapiFields.add("properties");
    openapiFields.add("flavonoids");
    openapiFields.add("caloricBreakdown");
    openapiFields.add("weightPerServing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nutrients");
    openapiRequiredFields.add("properties");
    openapiRequiredFields.add("flavonoids");
    openapiRequiredFields.add("caloricBreakdown");
    openapiRequiredFields.add("weightPerServing");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParseIngredients200ResponseInnerNutrition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParseIngredients200ResponseInnerNutrition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParseIngredients200ResponseInnerNutrition is not found in the empty JSON string", ParseIngredients200ResponseInnerNutrition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParseIngredients200ResponseInnerNutrition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParseIngredients200ResponseInnerNutrition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ParseIngredients200ResponseInnerNutrition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("nutrients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nutrients` to be an array in the JSON string but got `%s`", jsonObj.get("nutrients").toString()));
      }

      JsonArray jsonArraynutrients = jsonObj.getAsJsonArray("nutrients");
      // validate the required field `nutrients` (array)
      for (int i = 0; i < jsonArraynutrients.size(); i++) {
        ParseIngredients200ResponseInnerNutritionNutrientsInner.validateJsonElement(jsonArraynutrients.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("properties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }

      JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
      // validate the required field `properties` (array)
      for (int i = 0; i < jsonArrayproperties.size(); i++) {
        ParseIngredients200ResponseInnerNutritionPropertiesInner.validateJsonElement(jsonArrayproperties.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("flavonoids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `flavonoids` to be an array in the JSON string but got `%s`", jsonObj.get("flavonoids").toString()));
      }

      JsonArray jsonArrayflavonoids = jsonObj.getAsJsonArray("flavonoids");
      // validate the required field `flavonoids` (array)
      for (int i = 0; i < jsonArrayflavonoids.size(); i++) {
        ParseIngredients200ResponseInnerNutritionPropertiesInner.validateJsonElement(jsonArrayflavonoids.get(i));
      };
      // validate the required field `caloricBreakdown`
      ParseIngredients200ResponseInnerNutritionCaloricBreakdown.validateJsonElement(jsonObj.get("caloricBreakdown"));
      // validate the required field `weightPerServing`
      ParseIngredients200ResponseInnerNutritionWeightPerServing.validateJsonElement(jsonObj.get("weightPerServing"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParseIngredients200ResponseInnerNutrition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParseIngredients200ResponseInnerNutrition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParseIngredients200ResponseInnerNutrition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParseIngredients200ResponseInnerNutrition.class));

       return (TypeAdapter<T>) new TypeAdapter<ParseIngredients200ResponseInnerNutrition>() {
           @Override
           public void write(JsonWriter out, ParseIngredients200ResponseInnerNutrition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParseIngredients200ResponseInnerNutrition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParseIngredients200ResponseInnerNutrition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParseIngredients200ResponseInnerNutrition
  * @throws IOException if the JSON string is invalid with respect to ParseIngredients200ResponseInnerNutrition
  */
  public static ParseIngredients200ResponseInnerNutrition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParseIngredients200ResponseInnerNutrition.class);
  }

 /**
  * Convert an instance of ParseIngredients200ResponseInnerNutrition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

