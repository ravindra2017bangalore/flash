package com.ravi;

import java.io.File;

public class DisplayOnlyFilesName {
static int countFile=0;
static int countDir=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\homework");
		String [] n=f.list();
		for(String s:n)
		{
			File f1 = new File(f, s);
			if(f1.isFile())
			{
				++countFile;
				System.out.println(s);
			}
			else {
				++countDir;
				System.out.println(s);
			}
			
		}
		System.out.println("Number Of files = "+countFile);
		System.out.println("Number Of Directory = "+countDir);
	}

}
