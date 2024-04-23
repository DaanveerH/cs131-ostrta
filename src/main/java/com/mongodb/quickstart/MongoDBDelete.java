package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.json.JsonWriterSettings;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;

public class MongoDBDelete {

    public static void main(String[] args) {
    	
    	String connectionString = "mongodb+srv://nuhret:somepass@atlascluster.4n1uead.mongodb.net/";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("CSC131_TM_Awesome");
            MongoCollection<Document> gradesCollection = sampleTrainingDB.getCollection("Data_Management");
            
            // delete one document
            Bson filter = eq("student_id", 10000);
            DeleteResult result = gradesCollection.deleteOne(filter);
            System.out.println(result);
            
            // find and delete one document
            filter = eq("student_id", 10002);
            Document doc = gradesCollection.findOneAndDelete(filter);
            System.out.println(doc.toJson(JsonWriterSettings.builder().indent(true).build()));
            
            /*
            // delete many documents
            filter = eq("title", "Chorizo Lasagna Rolls");
            result = gradesCollection.deleteMany(filter);
            System.out.println(result);
            
            // delete the entire collection and its metadata (indexes, chunk metadata, etc).
            // deletes database and collection, don't know how to recreate these with code
            // gradesCollection.drop();
            */
            
            
            // TODO: probably only need delete one document or find and delete one document
        }
    }
}