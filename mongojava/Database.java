package SQLMONGO;
public interface Database{
    
   public void getConnection(String lc,int port)throws Exception;
   public void createDB(String db)throws Exception;
   public String disDb()throws Exception;
   public void dropDb(String db1)throws Exception;
   public void UseDB(String udb)throws Exception;
   public void showData(String t)throws Exception;
   public void insertData(String table,String field,String data)throws Exception;
}