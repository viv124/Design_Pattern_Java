//import SQLMONGO.*;
import java.sql.*;
public class client{
   public static void main(String[] args)throws Exception {

       // Database d=;
        DatabaseService client1 = new DatabaseService(MysqlDb.getInstance());
       client1.Connection("localhost",3306);
      
      //Database d=FactoryDB.getInstance("mongodb");
      //client1.Connection("localhost",27017);

            
      
        // client1.UseDB1("ahire");
      //   client1.showTData("viv");

      //   client1.UseDB1("test");
      //   client1.showTData("Gpay");
    //  client1.insertTData("viv","id,name","3,'Yogeshvar'");
        //client1.dbCreate("design");      
       
      // System.out.println("\n \n \n --------- Show Table Data ------ \n");
       //client1.showTData("test","finance");
      // 
       System.out.println("\n \n ----- | list of database |-------\n \n ");
       System.out.println(client1.display());
       
      
   }
}