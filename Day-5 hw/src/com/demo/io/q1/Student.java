package com.demo.io.q1;

import java.io.*;
import com.demo.io.*;


public class Student {

	public static void copy(Stud[] StudList) throws IOException {
		
		
		FileOutputStream fos=new FileOutputStream("StudentRecord",true);
		BufferedOutputStream  bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
	
		Stud[] stList = new Stud[10];

		
		for(int i=0;i<10;i++) {
			dos.writeInt(stList[i].getStId());
			dos.writeUTF(stList[i].getName());
		}
		
		System.out.println("Data saved!!");
		
	}

	public static void main(String[] args) throws IOException {
		
		Stud [] stList=new Stud[10];
		for(int i=0;i<10;i++)
			stList[i]=new Stud(100+i,"Name"+i);
		
		copy(stList);
	}


	}

	