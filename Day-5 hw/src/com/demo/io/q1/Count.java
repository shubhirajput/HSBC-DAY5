package com.demo.io.q1;
import java.io.*;

public class Count {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("dat.txt");
		BufferedInputStream bis=new BufferedInputStream(fi);
		int lcount=0;
		int wcount=0;
		int count=0;
		while((count=bis.read())!=-1) {
			if((char)count==' ')
				wcount=wcount+1;
			if((char)count=='.')
				lcount=lcount+1;
		}
		
		bis.close();
		fi.close();
		
		System.out.println(wcount);
		System.out.println(lcount);
		
	}

}
