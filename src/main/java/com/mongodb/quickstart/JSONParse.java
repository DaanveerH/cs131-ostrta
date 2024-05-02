package com.mongodb.quickstart;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParse {

	public static void main(String recipeJSONString) {
		
		
		// check to see if this is still here
		
        JSONObject responseJO = new JSONObject(recipeJSONString);
    	String recipeName = responseJO.getString("title");
    	System.out.println("");
    	System.out.println(recipeName);
    	System.out.println("----------------");
    	
    	
		JSONArray ingredientList = responseJO.getJSONArray("extendedIngredients");
		System.out.println("ingredients used:");
        
        for(int i = 0; i < ingredientList.length(); i++) {
        	JSONObject tempJO = ingredientList.getJSONObject(i);
        	Boolean iscustom = tempJO.has("nameClean");

        	
        	if (iscustom) {
        		String ingredientName = tempJO.getString("nameClean");
	        	int ingredientAmount = tempJO.getInt("amount");
	        	String ingredientUnit = tempJO.getString("unit");
	        	System.out.println(ingredientName + ": " + ingredientAmount + " " + ingredientUnit);
        	}
        	if (!iscustom) {
	        	JSONObject tempJO2 = tempJO.getJSONObject("$set");
        		String ingredientName = tempJO2.getString("nameClean");
            	int ingredientAmount = tempJO2.getInt("amount");
            	String ingredientUnit = tempJO2.getString("unit");
            	System.out.println(ingredientName + ": " + ingredientAmount + " " + ingredientUnit);
        	}
        }
        
        
    	
        System.out.println("");
        System.out.println("instructions:");
        JSONArray instructionList = responseJO.getJSONArray("analyzedInstructions");
        

        int recipeId = responseJO.getInt("id");
        if (recipeId > 1) {
	        for (int j = 0; j < instructionList.length(); j++) {
	        	JSONObject instructionList2 = instructionList.getJSONObject(0);
	            JSONArray stepList = instructionList2.getJSONArray("steps");
		        if (j == 0) {
		        	for (int i = 0; i < stepList.length(); i++){
			        	JSONObject tempJO = stepList.getJSONObject(i);
			        	int stepNum = tempJO.getInt("number");
			        	String stepInstruction = tempJO.getString("step");
			        	System.out.println(stepNum + ": " + stepInstruction);
			        	//System.out.println("for "+ lengthNum + " " + lengthUnit);
			        } // end for i
		        } // end if j ==0
		        else if (j >0 ) {
		        	JSONObject tempJO3 = instructionList.getJSONObject(j);
		        	JSONObject tempJO2 = tempJO3.getJSONObject("$set");
		        	int stepNum = tempJO2.getInt("number");
		        	String stepInstruction = tempJO2.getString("step");
		        	System.out.println(stepNum + ": " + stepInstruction);
		        } // end if j>0
	        } // end for j
        } // end if recipeID>1
        
        if (recipeId == 1) {
        	for (int j = 0; j < instructionList.length(); j++) {
        		JSONObject tempJO3 = instructionList.getJSONObject(j);
	        	JSONObject tempJO2 = tempJO3.getJSONObject("$set");
	        	int stepNum = tempJO2.getInt("number");
	        	String stepInstruction = tempJO2.getString("step");
	        	System.out.println(stepNum + ": " + stepInstruction);
        	}
        } // end if recipeID==1
	
	        
	        
        Boolean commentExist = responseJO.has("comment");
        if (commentExist) {
	        System.out.println("");
	        System.out.println("comments:");
	        
	        JSONArray commentList = responseJO.getJSONArray("comment");
	        for (int i = 0; i < commentList.length(); i++) {
	        	String currComment = commentList.getString(i);
	        	System.out.println(currComment);
	        }
        } // end if commentExist
		
		
	} // end main

} // end class
