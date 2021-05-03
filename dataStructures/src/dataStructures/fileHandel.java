package dataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.*;
import java.util.Scanner;


public class fileHandel {
	
	public void readermethod(File file3) throws FileNotFoundException {
		Scanner sc= new Scanner(file3);
		while(sc.hasNext()) {
			System.out.println(""+sc.nextLine());}
		
	}
	 
	public void writemethod(File file2) {	
		PrintWriter writer= null;
			try {
					writer = new PrintWriter(file2);
					writer.println("rohit");
					writer.println("5199957379");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
					System.out.println("given file not found"+file2.getName());
		           throw new RuntimeException(e);	
				}finally {
					
					writer.close();
				}
			
			}
	public static void main(String[] args) throws FileNotFoundException {
		
		File file1= new File("C:\\inop\\info.txt");
		fileHandel  handel= new fileHandel();
		handel.writemethod(file1);
		
		File file4= new File("C:\\inop\\read.txt");
		handel.readermethod(file4);
	}
           
	}

