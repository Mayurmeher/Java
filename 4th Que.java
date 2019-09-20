package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )
*/

public class Myclass2 {

	public static void main(String[] args) 
	{	
		File f = new File("D:\\z1.txt");
		char arr1[] = null;
		try(FileWriter fw = new FileWriter("D:\\z1.txt"))
		{
			char arr[]= {'a','b','c','d','u'};
			fw.write(arr);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		try(FileReader fr = new FileReader("D:\\z1.txt"))
		{
			arr1=new char[(int)f.length()];
			fr.read(arr1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		for(int i=0;i<arr1.length;i++)
		{
		System.out.println(arr1[i]);	
		}

}
}
