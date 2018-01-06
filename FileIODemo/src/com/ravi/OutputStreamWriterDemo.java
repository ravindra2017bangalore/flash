package com.ravi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E://homework","rv.txt")));
		 BufferedReader bf1 = new BufferedReader(new FileReader(new File("E:/homework/r.txt")));
		 String s;
		 while((s=bf1.readLine())!=null)
		 {
			 System.out.print(s);
			 bw.write(s);
		 }
		  bf1 = new BufferedReader(new FileReader(new File("E:/homework/m.txt")));
		 while((s=bf1.readLine())!=null)
		 {
			 System.out.print(s);
			 bw.write(s);
		 }
		 System.out.println("done");
		 bw.close();
	}
		
}
