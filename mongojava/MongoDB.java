package SQLMONGO;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.client.MongoIterable;
import com.mongodb.MongoCredential;  
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;

public class MongoDB implements Database{ 
   
   MongoClient mongo=null;
   MongoDatabase database,database1=null;
   String db=null;

    private static MongoDB obj=null;

     private MongoDB()
     {


     }
     public static MongoDB getInstance()
    {
        if (obj == null)
        {
           
            synchronized (MongoDB.class)
            {
                    if (obj==null)
                    obj = new MongoDB();
            }
        }
        return obj;
    }

   public void getConnection(String lc,int port)
   {
      mongo = new MongoClient( lc , port );
      System.out.println("--------------| Connected to the database successfully |-------------"); 
   }

   public void createDB(String d)
   {
      database = mongo.getDatabase(d);
      database.createCollection("demo");
      System.out.println(db+" ------ collection create successfully ----");     
   } 
   public String disDb()
   {
     
      MongoIterable<String> list = mongo.listDatabaseNames();
      
      String n1=null;
       for (String name : list) {
         n1=name+" ";
        // System.out.println(name); 
         }

      return n1;
   }
   public void dropDb(String db1)
      {
         database = mongo.getDatabase(db1);
         database.drop();
         System.out.println("succesfully drop");
      }
       public void UseDB(String udb)
       {
           database1 = mongo.getDatabase(udb);
       }
   public void showData(String t)throws Exception
   {
         MongoCollection<Document> collection = database1.getCollection(t);

         FindIterable<Document> cursor = collection.find();

         for (Document doc : cursor) {
            System.out.println(doc.toJson());
         } 
   }

   public void insertData(String table,String field,String data)
   {
         {
     //var database = mongo.getDatabase("student");

    
     }
    // System.out.println("DOCUMENT INSERTED SUCCESSFULLY");
}
}