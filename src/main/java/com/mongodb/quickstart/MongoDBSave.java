package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.InsertManyOptions;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MongoDBSave {

    private static final Random rand = new Random();

    public static void main(String recipeIn) {
    	// TODO: change class to take elements/document to insert into db
    	// TODO: change class to recieve connectionString in call function, so it isnt needed in every CRUD operation
    	
    	String recipeToSave = recipeIn;
    	
    	String connectionString = "mongodb+srv://nuhret:somepass@atlascluster.4n1uead.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
        	
        	// create the document to create in database (hardcoded)
        	// insert to database: CSC131_TM_Awesome; and collection: Data_Management
            MongoDatabase recipeDB = mongoClient.getDatabase("CSC131_TM_Awesome");
            MongoCollection<Document> recipeCollection = recipeDB.getCollection("Data_Management");
            
            insertOneDocument(recipeCollection, recipeToSave);
            //insertManyDocuments(gradesCollection);
        }
    }

    private static void insertOneDocument(MongoCollection<Document> recipeCollection, String recipeIn) {
        Document recipeToSave = Document.parse(recipeIn);
        recipeCollection.insertOne(recipeToSave);
        System.out.println("Recipe saved.");
    }
    private static void insertManyDocuments(MongoCollection<Document> recipeCollection) {
        List<Document> grades = new ArrayList<>();
        for (double classId = 1d; classId <= 10d; classId++) {
            grades.add(generateNewGrade(10001d, classId));
        }

        recipeCollection.insertMany(grades, new InsertManyOptions().ordered(false));
        System.out.println("Ten grades inserted for studentId 10001.");
    }

    private static Document generateNewGrade(double studentId, double classId) {
        List<Document> scores = List.of(new Document("type", "exam").append("score", rand.nextDouble() * 100),
                                        new Document("type", "quiz").append("score", rand.nextDouble() * 100),
                                        new Document("type", "homework").append("score", rand.nextDouble() * 100),
                                        new Document("type", "homework").append("score", rand.nextDouble() * 100));
        return new Document("_id", new ObjectId()).append("student_id", studentId)
                                                  .append("class_id", classId)
                                                  .append("scores", scores);
    }
}