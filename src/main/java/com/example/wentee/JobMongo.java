package com.example.wentee;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.sun.javafx.binding.StringFormatter;

import javax.ws.rs.Path;

public class JobMongo {
    private ConnectionString connString;
    private MongoClientSettings settings;
    private MongoDatabase database;
    private MongoClient mongoClient;

    public JobMongo(){
        connString = new ConnectionString(String.format("mongodb://%s:27017",MongoEnv.ipaddress));
        settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase(MongoEnv.dbName);
    }

    public MongoDatabase getDatabase() throws Exception {
        if(database == null){
            throw new Exception("No DB");
        }
        return database;
    }
}
