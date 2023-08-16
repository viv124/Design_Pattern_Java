package SQLMONGO;
import java.sql.*;

public class MysqlDb implements Database
{

    private Connection con,con1=null;
    private Statement st,st1=null;
    private ResultSet resultset = null;
    private static MysqlDb obj=null;

     private MysqlDb()
     {


     }
     public static MysqlDb getInstance()
    {
        if (obj == null)
        {
           synchronized (MysqlDb.class)
            {
                    if (obj==null)
                    obj = new MysqlDb();
            }
        }
        return obj;
    }

   public void getConnection(String lc,int port)throws Exception
   {
      Class.forName("com.mysql.cj.jdbc.Driver");
     // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","root");
      // st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
     // System.out.println("-----------| Connected to the database successfully  |----------"); 
   }
   public void createDB(String d)throws Exception
   {
        
         String sql = "CREATE DATABASE "+d+"";
         st.executeUpdate(sql);
         System.out.println(d+" ---- Database created successfully ----");   	  
    } 
     public void dropDb(String db1)throws Exception 
       {
           System.out.println("ts1.1");
             String drop="DROP DATABASE "+db1;
            System.out.println("ts1.2");
             st.execute(drop);
            System.out.println("succesfully drop");
       }

       public String disDb()throws Exception
       {
           // st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
            resultset = st.executeQuery("SHOW DATABASES;");
            if (st.execute("SHOW DATABASES;")) {
                resultset = st.getResultSet();
            }
 
            while (resultset.next()) {
                  resultset.getString("Database");
               }
               return resultset.toString() ;
       }
       public void UseDB(String udb)throws Exception
       {
              con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+udb, "root","root");
              st1= con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
       }
       public void showData(String t)throws Exception
       {
             ResultSet rs = st1.executeQuery("select * from "+t);
             ResultSetMetaData rs1 = rs.getMetaData();
             int NumOfCol=rs1.getColumnCount();
             System.out.println(NumOfCol);
             while(rs.next())
             {
                  for(int i=1;i<=NumOfCol;i++)
                 {
                       System.out.print("  "+rs.getString(i));
                 }
                 System.out.println();
             }
            
       }
       public void insertData(String table,String field,String data)throws Exception
       {
            
             String q1 = "insert into "+table+"( "+field+") values( "+data+")";
            int x = st1.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully Inserted");           
            else           
                System.out.println("Insert Failed");

       }
    }