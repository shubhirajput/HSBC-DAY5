package com.demo.io.q1;
import java.io.*;
public class CustomerDeserializable {

	public static void main(String[] args) throws Exception {
		
			
			try {
				FileInputStream fis=new FileInputStream("customer.ser");
				ObjectInputStream objInput=new ObjectInputStream(fis);
				while(true) {
					Customer c=(Customer)objInput.readObject();
					System.out.println(c.getCustomerId()+" "+c.getName()+" "+c.getAddress());
				}
			}
			catch(Exception e) {
				System.out.println("We are done");
			}
			
	}

	}
