// Java Program to Convert File to a Byte Array
// Using read(byte[]) Method

// Importing required classes
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

// Main class
public class GFG {

	// Method 1
	// To convert file to byte array
	public static byte[] method(File file)
		throws IOException,FileNotFoundException
	{

		// Creating an object of FileInputStream to
		// read from a file
		FileInputStream fl = new FileInputStream(file);
       

		// Now creating byte array of same length as file
		byte[] arr = new byte[(int)file.length()];

		// // Reading file content to byte array
		// // using standard read() method
        //  System.out.print(arr.length);
        //  int i;    
        //    for(i=0;i<(int)file.length();i++)
        //     {    
        //      System.out.print((char)arr[i]);    
        //     }   
		//fl.read(arr);

		// lastly closing an instance of file input stream
		// to avoid memory leakage
		fl.close();

		// Returning above byte array
		return arr;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
		throws IOException,FileNotFoundException
	{

		// Creating an object of File class and
		// providing local directory path of a file
        File path = new File("viv.txt");
        FileInputStream fn=new FileInputStream(path); 
       

		byte[] array = method(path);
        byte[] b=new byte[(int)path.length()];
		byte[] b1=new byte[(int)path.length()];

        for(int i=0;i<(int)path.length();i++)
        {
            b[i]=(byte)(fn.read()-1);
        }
		for(int i=0;i<(int)path.length();i++)
        {
            b1[i]=(byte)b[i]+1;
        }
        System.out.print(Arrays.toString(array));
       // System.out.print(Arrays.toString(b));
        for(int i=0;i<(int)path.length();i++)
        {
            System.out.print((char)b1[i]);
        }
       
	}
}
