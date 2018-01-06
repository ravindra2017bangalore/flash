package com.ravi;
import java.io.File;
import java.io.IOException;

public class FileAvai {

	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f =new File("ravindra");
		f.mkdir();
		File f1 = new File("E:\\homework", "practice.txt");
		System.out.println(f1.createNewFile());
		System.out.println("File is Exists "+f1.exists());
		System.out.println(f.isDirectory());
		System.out.println("This is the File "+f1.isFile());
		File f2 = new File("E:\\homework");
		//System.out.println(f2.createNewFile());
		//System.out.println(f2.exists());
		String name[]=f2.list();
		long lengthOfFile=f2.length();
		System.out.println("Length Of file = "+lengthOfFile);
		for(String name1:name)
		{
			++count;
			//System.out.println(name1);
		}
		//File file = new File("E:\\homework","practice.txt");
		//System.out.println(file.delete());
		//System.out.println("Number of file is "+count);
	}

}
