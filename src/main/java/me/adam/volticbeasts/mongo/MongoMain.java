package me.adam.volticbeasts.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoMain {
    MongoClient mongoClient = MongoClients.create("mongodb://server-auth:jAs9Rb0TnRCCqqnH@cluster0-shard-00-00.6hwgj.mongodb.net:27017,cluster0-shard-00-01.6hwgj.mongodb.net:27017,cluster0-shard-00-02.6hwgj.mongodb.net:27017/<dbname>?ssl=true&replicaSet=atlas-ujsvfo-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoDatabase mongoDatabase = mongoClient.getDatabase("Voltic");
    MongoCollection<Document> globalCollection = mongoDatabase.getCollection("Global");
    MongoCollection<Document> localCollection = mongoDatabase.getCollection("beastGame");


}
