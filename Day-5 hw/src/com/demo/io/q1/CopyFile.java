package com.demo.io.q1;
import java.io.*;
import java.util.Scanner;
public class CopyFile {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String src=s.next();
		String des=s.next();
		Copy(src,des);

	}
	
	
	public static void Copy(String Source,String Destination)
	{
		try
		{
		FileReader fr = new FileReader(Source);
		FileWriter fw = new FileWriter(Destination);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		String st = "";
		while ((st = br.readLine()) != null) 
			bw.write(st);

		br.close();
		bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File copied Successfully!!");
		
		
		
	}

}
