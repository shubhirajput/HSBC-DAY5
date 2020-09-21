package com.demo.io.q1;
import java.io.*;
public class CustomerSerializable {



		public static void main(String[] args) throws IOException{
			
			FileOutputStream fos=new FileOutputStream("customer.txt");
			ObjectOutputStream dos=new ObjectOutputStream(fos);
			
			for(int i=1;i<=3;i++)
			{
				Customer c=new Customer(100+i,"customer"+i,"city"+i);
				dos.writeObject(c);
			}
			
			dos.close();
			
			System.out.println("DONE AFTER A LONG STRUGGLE");
			
		}
	}