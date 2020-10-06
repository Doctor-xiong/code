/*
package com.lyf.china.dao;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

public class MongodbBaseDao {

    private static MongoClient mongoClient = new MongoClient("localhost",27017); // 主机和端口
    private static MongoDatabase mongoDatabase = mongoClient.getDatabase("文物");


    @SuppressWarnings({ })
    */
/*
     * 查询某一Collection中所有的Document
     * 返回FindIterable类型，接收后需要判断里面是否含有数据
     * 参数列表：查询的集合名称、查询关键字名称、查询的数值
     *//*

    public static FindIterable<Document> inquireAllDocument(String collectionName) {
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        return collection.find();
    }

    */
/*
     * 查询某一Collection中的符合条件的所有Document
     * 返回FindIterable类型，接收后需要判断里面是否含有数据
     * 参数列表：查询的集合名称、查询Bson格式
     *//*

    public static FindIterable<Document> inquireBson(String collectionName, Bson filter) {
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        FindIterable<Document> findIterable = collection.find(filter);//查找到符合条件的Document
        MongoCursor<Document> cursor = findIterable.iterator();
        return findIterable;
    }
    */
/*
     * 在某一collection中插入一个document
     * 参数列表：要插入的document
     *//*

    public static boolean insertOneDocument(String collectionName, Document document){

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        collection.insertOne(document);
        return true;
    }

    public static boolean insertManyDocument(String collectionName, List<Document> list){
        */
/*
         * 在某一collection中插入一个document
         * 参数列表：要插入的多个document即list
         *//*

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        collection.insertMany(list);
        return true;
    }

    public static boolean removeOneDocument(String collectionName, Bson filter){
        */
/*
        * 删除符合filter条件的第一个Document
        * 参数列表：操作的集合名称，要删除的信息条件
        * *//*

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        FindIterable<Document> result = inquireBson(collectionName, filter);
        MongoCursor<Document> cursor = result.iterator();
        if(cursor.hasNext()){
            collection.deleteOne(filter);
            return true;
        }
        System.out.println("没有该Document，删除失败！");
        return false;
    }

    public static boolean removeManyDocument(String collectionName, Bson filter){
        */
/*
        * 删除所有符合filter条件的document
        * 参数列表：操作的集合名称，要删除的信息条件
        * *//*

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        collection.deleteMany(filter);
        return true;
    }

    public static boolean updateOne(String collectionName, Bson oldDocument, Bson newDocument){
        */
/*
        * 只更新第一个符合条件的Document
        * 参数列表：操作的集合名称，要更改的信息条件，更改后的信息条件
        * *//*

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        collection.updateOne(oldDocument, newDocument);
        return true;
    }

    public static boolean updateMany(String collectionName, Bson oldDocument, Bson newDocument){
        */
/*
         * 更新所有符合条件的Document
         * 参数列表：操作的集合名称，要更改的信息条件，更改后的信息条件
         * *//*

        MongoCollection collection = mongoDatabase.getCollection(collectionName);
        collection.updateMany(oldDocument, newDocument);
        return true;
    }

    public static void main(String[] argc){
        // test code
        // ......
    }

}
*/
