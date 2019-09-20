package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*2) create a customer class with following attributes
custid
custname
address
age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)*/

class Customer implements Serializable
{
	private int custid ;
	private String custname ; 
	private String address ;
	private int age ;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(int custid, String custname, String address, int age) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.age = age;
	}
	public String toString ()
	{
		return  "custID= " + getCustid() +"\t"+ "custname=  " + getCustname() +"\t"+ "address= " + getAddress() +"\t"+ "Age= " + getAge() ; 
	}
	
}

public class Myclass1 
{
	public static void main(String[] args) 
	{
	Customer c = new Customer(001,"Poki","Delhi",25); 
	try(FileOutputStream fos=new FileOutputStream("D:\\pika.txt"))	
	{
	 try(ObjectOutputStream oo = new ObjectOutputStream(fos))
	 	{	
		 oo.writeObject(c);
	 	}
	 }	 catch(Exception e)
	 {
			e.printStackTrace();
	 }

	
	
	 try(FileInputStream fis = new FileInputStream("D:\\pika.txt"))
	 {
		 try(ObjectInputStream oi = new ObjectInputStream(fis))
		 {   
			 Customer c1 = ((Customer)oi.readObject());
			 System.out.println(c1);
		 } 
		 
	 }	 catch(Exception e)
	 {
			e.printStackTrace();
	 }
	 
	}
	//System.out.println(c1.custid +"  "+ c1.custname+"  "+ c1.address +" "+ c1.age);
}
