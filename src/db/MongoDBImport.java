package db;

import java.text.ParseException;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBImport {
	public static void main(String[] args) throws ParseException {
	   	 MongoClient mongoClient = new MongoClient();
	   	 MongoDatabase db = mongoClient.getDatabase(DBUtil.DB_NAME);
	   	 
	   	 //mongoDB will automatically create new table if not exist, so can just use "getCollection" method
	   	 db.getCollection("users").insertOne(
	   			 new Document()
	   					 .append("first_name", "John")
	   					 .append("last_name", "Smith")
	   					 .append("password", "3229c1097c00d497a0fd282d586be050")
	   					 .append("user_id", "1111"));
	   	 mongoClient.close();
	    }

}
