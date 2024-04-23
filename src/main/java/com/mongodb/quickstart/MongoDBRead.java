package com.mongodb.quickstart;

import com.mongodb.client.*;
import org.bson.Document;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.descending;

public class MongoDBRead {

    public static void main(Scanner userInput) {
    	String connectionString = "mongodb+srv://nuhret:somepass@atlascluster.4n1uead.mongodb.net/";
    	String noMoreLoopString = "q";
    	String userIn = "";
    	
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("CSC131_TM_Awesome");
            MongoCollection<Document> recipeCollection = sampleTrainingDB.getCollection("Data_Management");

            // TODO: create code to take user input
            // TODO: take user input to either exit to menu or show one specific recipe
            // call findSpecificRecipe: 	MongoDBRead.findSpecificRecipe(recipeCollection, recipeTitle);
            
            MongoDBRead.listAllRecipes(recipeCollection);
            
            while (!userIn.equals(noMoreLoopString)) {
            	System.out.println("");
                System.out.println("enter id or name to view complete recipe");
                System.out.println("q to return to menu");
            	userIn = userInput.next();
            	
				if (!HelloMongoDB.isNumber(userIn)) {
					if ( userIn.equals(noMoreLoopString)) {
						break;
					}
					else {
						MongoDBRead.findSpecificRecipeTitle(recipeCollection, userIn);
					}
				} // end if !isNumber
				if (HelloMongoDB.isNumber(userIn)) {
	    			int userInputInt = Integer.parseInt(userIn);
	    			MongoDBRead.findSpecificRecipeId(recipeCollection, userInputInt);
	    		} // end if isNumber 
            } // end while 
            
        } // end try
    } // end main
    
    private static void findSpecificRecipeTitle (MongoCollection<Document> recipeCollection, String recipeTitle) {
        // find one document with new Document
        Document student1 = recipeCollection.find(new Document("title", recipeTitle)).first();
        System.out.println(recipeTitle + ": " + student1.toJson());
        
        // find one document with Filters.eq()
        //Document student2 = recipeCollection.find(eq("title", recipeTitle)).first();
        //System.out.println("Student 2: " + student2.toJson());
        
    } // end findSpecificRecipe
    
    private static void findSpecificRecipeId (MongoCollection<Document> recipeCollection, int recipeId) {
        // find one document with new Document
        Document student1 = recipeCollection.find(new Document("id", recipeId)).first();
        System.out.println(recipeId + ": " + student1.toJson());
        
        // find one document with Filters.eq()
        //Document student2 = recipeCollection.find(eq("title", recipeId)).first();
        //System.out.println("Student 2: " + student2.toJson());
        
    } // end findSpecificRecipeId
    
    private static void listAllRecipes (MongoCollection<Document> recipeCollection) {
    	JSONObject responseJO;
    	String jsonString = "";
    	String recipeName = "";
    	int    recipeId;
    	
    	// find a list of documents and iterate throw it using an iterator
        FindIterable<Document> iterable = recipeCollection.find(gte("id", 0));
        MongoCursor<Document> cursor = iterable.iterator();
        System.out.println("");
        System.out.println("saved recipes:");
        while (cursor.hasNext()) {
            //System.out.println(cursor.next().toJson());
            jsonString = cursor.next().toJson();
            responseJO = new JSONObject(jsonString);
            recipeId = responseJO.getInt("id");
        	recipeName = responseJO.getString("title");
            System.out.println(recipeId + ": " +recipeName);
        } // end while cursor.hasNext()
        /*
        // find a list of documents and use a List object instead of an iterator
        List<Document> studentList = recipeCollection.find(gte("student_id", 10000)).into(new ArrayList<>());
        System.out.println("Student list with an ArrayList:");
        for (Document student : studentList) {
            System.out.println(student.toJson());
        }
        
        // find a list of documents and print using a consumer
        System.out.println("Student list using a Consumer:");
        Consumer<Document> printConsumer = document -> System.out.println(document.toJson());
        recipeCollection.find(gte("student_id", 10000)).forEach(printConsumer);

        
        // find a list of documents with sort, skip, limit, and projection
        List<Document> docs = recipeCollection.find(and(eq("student_id", 10001), lte("class_id", 5)))
                .projection(fields(excludeId(), include("class_id", "student_id")))
                .sort(descending("class_id"))
                .skip(2)
                .limit(2)
                .into(new ArrayList<>());

		System.out.println("Student sorted, skipped, limited and projected:");
		for (Document student : docs) {
		System.out.println(student.toJson());
		}
    	*/
    } // end findAllRecipe
    
} // end class