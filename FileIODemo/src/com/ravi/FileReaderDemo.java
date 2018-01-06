package com.ravi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader(new File("E:\\homework","practice.txt")));)
		{
			String line;
			while((line=br.readLine())!=null)
			{	
				System.out.println(line);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
