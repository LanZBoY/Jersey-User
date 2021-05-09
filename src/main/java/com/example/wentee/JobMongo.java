package com.example.wentee;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoDatabase;

public class JobMongo {
    private ConnectionString connString;
    private MongoClientSettings settings;
    private MongoDatabase database;
    public MongoClient getMongoClient(){
        return null;
    }
}
