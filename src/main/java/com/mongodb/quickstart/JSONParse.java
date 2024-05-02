package com.mongodb.quickstart;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParse {

	public static void main(String recipeJSONString) {
		
		///*  testing
        JSONObject responseJO = new JSONObject(recipeJSONString);
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
        //*/
		
		
	} // end main

} // end class
