package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test {
	public static void dangky() {
		try {
			FileWriter fr = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\QUOCANH\\output.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			while(true) {
				String st = new Scanner(System.in).nextLine();
				if(st==null || st=="") break;
				bw.write(st);
				bw.newLine();
				
;			}
			bw.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		dangky();
		
	}
	
}
