// Java Program to Convert File to a Byte Array
// Using read(byte[]) Method

// Importing required classes
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

// Main class
public class GFG1 {

	// Method 1
	// To convert file to byte array
	public static byte[] method(File file)
		throws IOException
	{

		// Creating an object of FileInputStream to
		// read from a file
		FileInputStream fl = new FileInputStream(file);

		// Now creating byte array of same length as file
		byte[] arr = new byte[(int)file.length()];

		// Reading file content to byte array
		// using standard read() method
		fl.read(arr);

		// lastly closing an instance of file input stream
		// to avoid memory leakage
		fl.close();

		// Returning above byte array
		return arr;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating an object of File class and
		// providing local directory path of a file
		File path = new File("viv.txt");

		// Calling the Method1 in main() to
		// convert file to byte array
		byte[] array = method(path);
        byte[] b=new byte[(int)path.length()];
        byte[] b1=new byte[(int)path.length()];
		int [] a=new int[(int)path.length()];
		int [] copy=new int[(int)path.length()];

		// Printing the byte array
		System.out.print("Ascii"+Arrays.toString(array));
        for(int i=0;i<(int)path.length();i++)
        {
            System.out.print((int)array[i]);
			int r=0;
			int t=array[i];
			while (t > 0) 
			{
               int digit = t % 10;
               r = r * 10 + digit;
               t /= 10;
       		}
			a[i]=r;
			System.out.println("temp:- "+a[i]);
	    }

		for(int i=0;i<(int)path.length();i++)
        {
            System.out.print((char)a[i]);
		}
		System.out.println(Arrays.toString(a));
       
		for(int i=0;i<(int)path.length();i++)
        {
            //System.out.println((int)array[i]);
			int r=0;
			int t=a[i];
			while (t > 0) 
			{
           int digit = t % 10;
           r = r * 10 + digit;
           t /= 10;
       		}
			copy[i]=r;
			//System.out.println("temp:- "+r);
	    }
		for(int i=0;i<(int)path.length();i++)
        {
            System.out.print((char)copy[i]);
		}

		

        //  for(int i=0;i<(int)path.length();i++)
        // {
        //     b[i]=(byte)(array[i]+5512);
        // }

        // for(int i=0;i<(int)path.length();i++)
        // {
        //    b1[i]=(byte)(b[i]-5512);
        // }
        // System.out.print(Arrays.toString(b1));
	}
}
