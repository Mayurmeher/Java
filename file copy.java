package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*write a file copy program using FileInputStream and FileOutputStream

hint: existing file u need to open using FileInputStream and new file u need
to open using FileOutputStream.

first read existing file's data inside byte array and then write the same
byte array inside new file.

byte array should be created equivalent to the length of existing file.*/

public class Myclass1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		File f = new File("D:\\kika.txt");		
		byte b[] = null;
		if(!f.exists())
		{
			System.out.println("file does not exists");
			System.exit(0);
		}
		
			try(FileInputStream fis = new FileInputStream(f))
			{
				b = new byte[((int)f.length())];
				fis.read(b);
				String ss = new String(b);
				System.out.println(ss);
				
				
			} catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try(FileOutputStream fos = new FileOutputStream("D:\\kika1.txt",true))
					{
					fos.write(b);
					
					} 
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			
			
	}

}
