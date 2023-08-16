import java.io.*;      
public abstract class Bill{  
         protected double rate;  
         abstract double getRate();  
   
         public double calculateBill(double units){  
              return units*rate;  
          }  
}