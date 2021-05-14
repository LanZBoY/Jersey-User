package com.example.wentee;

import com.mongodb.MongoClient;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class InitApp extends Application {
    public static MongoClient mongoClient;
    public InitApp(){
//        對所有的API做初始化的動作
//        代表所有物件都要在這邊取得聯繫
        JobMongo jobMongo = new JobMongo();
    }
}
