package com.ravi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedWriter br = new BufferedWriter( new FileWriter(new File("E:\\homework","practice.txt"),true));){
			br.newLine();
			br.write("This the New Line...2");
			br.newLine();
			br.write(100);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
