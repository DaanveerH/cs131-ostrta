package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.json.JsonWriterSettings;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.*;

public class MongoDBUpdate {

    public static void main(String[] args) {
        JsonWriterSettings prettyPrint = JsonWriterSettings.builder().indent(true).build();
        
        String connectionString = "mongodb+srv://nuhret:somepass@atlascluster.4n1uead.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("CSC131_TM_Awesome");
            MongoCollection<Document> gradesCollection = sampleTrainingDB.getCollection("Data_Management");

            // update one document
            
            Bson filter = eq("student_id", 10000);
            Bson updateOperation = set("comment", "MongoDBUpdate class update function test");
            // update method for one document: two parameters, filter and updateOperation
            UpdateResult updateResult = gradesCollection.updateOne(filter, updateOperation);
            System.out.println("=> Updating the doc with {\"student_id\":10000}. Adding comment.");
            System.out.println(gradesCollection.find(filter).first().toJson(prettyPrint));
            System.out.println(updateResult);
            
            // upsert: mix between insert and update - updates a document, assuming it exists; creates the document if it doesnt
            filter = and(eq("student_id", 10002d), eq("class_id", 10d));
            updateOperation = push("comments", "MongoDBUpdate class upsert function test");
            // upsert method for one document: three parameters, filter, updateOperation, and set upsert to true
            UpdateOptions options = new UpdateOptions().upsert(true);
            updateResult = gradesCollection.updateOne(filter, updateOperation, options);
            System.out.println("\n=> Upsert document with {\"student_id\":10002.0, \"class_id\": 10.0} because it doesn't exist yet.");
            System.out.println(updateResult);
            System.out.println(gradesCollection.find(filter).first().toJson(prettyPrint));
            
            // update many documents
            filter = eq("student_id", 10001);
            updateOperation = push("comments", "MongoDBUpdate class update many function test");
            updateResult = gradesCollection.updateMany(filter, updateOperation);
            System.out.println("\n=> Updating all the documents with {\"student_id\":10001}.");
            System.out.println(updateResult);
            
            // find and update one document
            filter = eq("student_id", 10002);
            Bson update1 = inc("x", 10); // increment x by 10. As x doesn't exist yet, x=10.
            Bson update2 = rename("class_id", "new_class_id"); // rename variable "class_id" in "new_class_id".
            Bson update3 = mul("scores.0.score", 2); // multiply the first score in the array by 2.
            Bson update4 = addToSet("comments", "This comment is uniq"); // creating an array with a comment.
            Bson update5 = addToSet("comments", "This comment is uniq"); // using addToSet so no effect.
            Bson updates = combine(update1, update2, update3, update4, update5);
            // returns the old version of the document before the update.
            Document oldVersion = gradesCollection.findOneAndUpdate(filter, updates);
            System.out.println("\n=> FindOneAndUpdate operation. Printing the old version by default:");
            System.out.println(oldVersion.toJson(prettyPrint));
            // but I can also request the new version
            filter = eq("student_id", 10001);
            FindOneAndUpdateOptions optionAfter = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);
            Document newVersion = gradesCollection.findOneAndUpdate(filter, updates, optionAfter);
            System.out.println("\n=> FindOneAndUpdate operation. But we can also ask for the new version of the doc:");
            System.out.println(newVersion.toJson(prettyPrint));
            
            
        } // end try
    } // end main
} // end class