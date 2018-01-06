package com.ravi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Write Something...you want");
		String data=sc.nextLine();
		try(FileWriter fw =new FileWriter(new File("E:\\homework","practice.txt"),true);) 
		{
			//fw.write("Ravindra Singh Parihar");
			fw.write(data);
		} 
			catch (IOException e)
			{
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Done");
	}

}
