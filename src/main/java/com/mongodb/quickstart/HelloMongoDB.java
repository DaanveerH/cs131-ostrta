package com.mongodb.quickstart;

import com.spoonacular.client.ApiClient;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Configuration;
import com.spoonacular.client.auth.*;
import com.spoonacular.client.model.*;
import com.spoonacular.DefaultApi;
import com.spoonacular.RecipeSearchApp;
import java.util.Scanner;

public class HelloMongoDB {

    public static void main(String[] args) {
        // System.out.println("Hello MongoDB!");
    	
    	//TODO: set up loop to run more than once
    	
    	//scan input from console to set params (hopefully)
    	System.out.println("enter parameters");
    	// open scanner (in)
    	Scanner in = new Scanner(System.in);
    	String paramsToSearch = in.nextLine();
    	
    	System.out.println("enter number of results");
    	int numResults = in.nextInt();
    	
    	// close scanner (in)
    	in.close();
    	
    	System.out.println("the following was entered: " + paramsToSearch + ", " + numResults + ".");
    	
        // use RecipeSearchApp class to make call with parameters set above
        RecipeSearchApp.main(paramsToSearch, numResults);
    } // end main
}