/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


public class RaWToFiles {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/Users/tylernelson/NetBeansProjects/RawToFiles/src/data.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		
		File file = new File("/Users/tylernelson/NetBeansProjects/RawToFiles/src/data.txt");
		Scanner scanner = new Scanner(file);
		
		FileWriter writer = new FileWriter("/Users/tylernelson/NetBeansProjects/RawToFiles/src/output.txt");
		
		for (int i = 0; i < lines; i++) {
			String line = scanner.nextLine();
			String[] lineArray = line.split("\\s+");
			String firstName = lineArray[0];
			char lastInitial = lineArray[0].charAt(0);
			writer.write(lineArray[1] + ", " + lastInitial + ". " + lineArray[2] + String.format("%n"));
			
		}
		
		writer.close();
	}
}