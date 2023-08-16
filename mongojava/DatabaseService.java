package SQLMONGO;
import java.*;

public class DatabaseService{
   private Database db;

   public DatabaseService(Database db)throws Exception{
      this.db = db;
   }

   public void Connection(String lc,int port)throws Exception
   {
      System.out.println("con");
       db.getConnection(lc,port);
   }
   public void dbCreate(String dbname)throws Exception{
       db.createDB(dbname);
   }
   public String display()throws Exception
   {
     return db.disDb();
   }
   public void dropDbm(String db1)throws Exception
   {
    
     db.dropDb(db1);
     System.out.println("TS1");
   }
   public void UseDB1(String udb)throws Exception
   {
        db.UseDB(udb);
   }
   public void showTData(String t1)throws Exception
   {
      db.showData(t1);
   }
    public void insertTData(String table,String field,String data)throws Exception
    {
       db.insertData(table,field,data);
    }
  
}