package com.mongodb.quickstart;

import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.auth.*;
import com.spoonacular.client.model.*;
import com.spoonacular.DefaultApi;
import com.spoonacular.RecipeSearchApp;
import com.spoonacular.RecipeSearchByID;

import java.util.Scanner;
import org.bson.Document;
import org.json.JSONObject;

public class HelloMongoDB {

    public static void main(String[] args) {
        // System.out.println("Hello MongoDB!");
    	
    	String  userInput			= "";
    	int 	userInputInt;
    	boolean noMoreLoopBool		= true;
    	String 	noMoreLoopString 	= "q";
    	int 	menuOption1			= 1;
    	int		menuOption2			= 2;
    	int		menuOption3			= 3;
    	
    	// open scanner (in)
    	Scanner userIn = new Scanner(System.in);
    	userIn.useDelimiter(System.lineSeparator());
    	
    	while(noMoreLoopBool) {									// main menu loop
    		// print menu to console
    		System.out.println("");
    		System.out.println("Options:");
    		System.out.println("1: search new recipes");		// TODO: search new recipes					(done)
    		System.out.println("2: view saved recipes");		// TODO: view saved recipes					(in progress)
    		System.out.println("3: create new recipe");			// TODO: create new recipe from scratch		(in progress)
    		System.out.println("q: exit program");
    		// scan input from console to get next action
    		userInput = userIn.next();
    		
    		if (HelloMongoDB.isNumber(userInput)) {  // if isNumber, then {1, 2, 3, invalid}
    			userInputInt = Integer.parseInt(userInput);
    			if ( userInputInt == menuOption1) {
    				//System.out.println("option 1 not available");
    				HelloMongoDB.optionSearchRecipes(userIn);
    			} // end menuOption1
    			if ( userInputInt == menuOption2) {
    				//System.out.println("option 2 not available");
    				HelloMongoDB.optionViewSavedRecipes(userIn);
    			} // end menuOption2
    			if ( userInputInt == menuOption3) {
    				System.out.println("option 3 not available");
    				//HelloMongoDB.optionCreateNewRecipe(userIn);
    			} // end menuOption3
    		} // end if isNumber
    		
    		if (!HelloMongoDB.isNumber(userInput)) {
    			if (userInput.equals(noMoreLoopString)) {
    				break;
    			} // end if .equals(Q)
    		} // end if !isNumber
    		
    	} // end main menu loop
    	
    	//TODO: console loop and functionalities
    	/* - what does user want to do: 
    	 * 			search new recipes, view saved recipe, create new recipe (from scratch) 
    	 * - search new recipe:    (user input = 1) 	(done)
    	 * - viewing saved recipe: (user input = 2)		(in progress)
    	 * 		- from mongoDB
    	 * 				- show all recipes				(done)
    	 * 				- show individual recipe		(done)
    	 * 				- edit recipe					{MongoDBUpdate.main();}
    	 * 				- delete recipe					{MongoDBDelete.main();}
    	 * 				- print recipe
    	 * - create new recipe:    (user input = 3)		(in progress)
    	 * 				- create new recipe				{MongoDBCreate.main();}
    	 * 				- input: name, ingredients, instructions, avg prep/cook time, etc... 
    	 * 						- check from existing spoonacular recipe
    	 */
    	
    	// how to parse json string for specific arguements
    	/*    	
    	JSONObject responseJO;
    	String jsonString = "";
    	String recipeName = "";
    	int    recipeId;
        jsonString = cursor.next().toJson();
        responseJO = new JSONObject(jsonString);
        recipeId = responseJO.getInt("id");
    	recipeName = responseJO.getString("title");
        System.out.println(recipeId + ": " +recipeName); 
    	*/
    	
    	
    	// close scanner (in)
    	userIn.close();
    	System.out.println("");
    	System.out.println("exiting program");
    	System.out.println("see you next time");
    	
    } // end main
    
    
    public static boolean isNumber(String s) {
        try {
        Integer.parseInt(s); 
        return true;
        } // end try
        catch(NumberFormatException nfe){
        return false;
        } // end catch
    } //  end isNumber
    
    public static void optionSearchRecipes(Scanner userIn) {
    	String 		paramsToSearch 		= "";
    	int    		numResults			= 5;			//TODO: change to higher number at later time
    	String 		noMoreLoopString 	= "q";
        int 		paramsToSearchID;
    	
    	while (!paramsToSearch.equals(noMoreLoopString)) {
	    	//scan input from console to set params (hopefully)
    		System.out.println("");
	    	System.out.println("enter parameters");
	    	System.out.println("q to return to menu");
	    	paramsToSearch = userIn.next();
	    	
	    	
	    	if (!HelloMongoDB.isNumber(paramsToSearch)) {			//	if !isNumber, then RecipeSearchApp or quit
	    		if (paramsToSearch.equals(noMoreLoopString)) {   	// if Q, then quit
		    		break;
		    	}// end if noMoreLoopString
	    		System.out.println("");
	    		System.out.println("the following was entered: " + paramsToSearch + ".");
	    		RecipeSearchApp.main(paramsToSearch, numResults);
	    	} // end if !isNumber
	    	if (HelloMongoDB.isNumber(paramsToSearch)) { 			// if isNumber, then RecipeSearchByID
	    		paramsToSearchID = Integer.parseInt(paramsToSearch);
	    		System.out.println("");
	    		System.out.println("the following was entered: " + paramsToSearch + ".");
	    		RecipeSearchByID.main(paramsToSearchID, false, false, false, userIn); // takes recipeID=int, includeNutrition=bool, addWinePairing=bool, addTasteData=bool
	    	} // end if isNumber 
	        
    	} // end while loop
    	
    	System.out.println("returning to menu");
    	
    } // end optionSearchRecipes
    
    public static void optionViewSavedRecipes(Scanner userIn) {
    	// TODO: need connection to MongoDBRead
    	MongoDBRead.main(userIn);
    	// TODO: need connection to MongoDBUpdate
    	//MongoDBUpdate.main();
    	// TODO: need connection to MongoDBDelete
    	//MongoDBDelete.main();
    } // end optionViewSavedRecipes
    
    public static void optionCreateNewRecipe(Scanner userIn) {
    	// TODO: need connection to MongoDBCreate
    	//MongoDBCreateScratch.main(userIn);
    	// TODO: need connection to MongoDBDelete
    	//MongoDBDelete.main();
    } // end optionCreateNewRecipe
    
    
} // end HelloMongoDB class