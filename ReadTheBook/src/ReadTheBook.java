/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.io.*;
import java.util.*;

public class ReadTheBook {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		long startTime = System.currentTimeMillis();
		//Count total words and lines
		ArrayList<Double> wordsPerLine = new ArrayList<Double>();
		int lineCount = 0;
		int wordCount = 0;
		int mostChars = 0;
		String longestWord = "";
		BufferedReader reader = new BufferedReader(new FileReader("/Users/tylernelson/NetBeansProjects/ReadTheBook/src/oliver.txt"));
		
		String currentLine = reader.readLine();
		
		while (reader.readLine() != null) {
            //Updating the lineCount
            lineCount++;
            //Getting array of all words in currentLine
            String[] words = currentLine.split(" ");
			//Removing all special characters from each element in currentLine
			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].replaceAll("[^a-zA-Z0-9_-]", "");
				
			}
			//Search for longest word
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals("ftpftpibiblioorgpubdocsbooksgutenbergetext03")) {
					break;
				}
				if(words[i].length() > mostChars) {
					mostChars = words[i].length();
					longestWord = words[i];
				}
			}
            //Updating the wordCount
            wordCount = wordCount + words.length;
			//Add wordCount element to ArrayList
			wordsPerLine.add((double) words.length);
			//Reading next line into currentLine
            currentLine = reader.readLine();
        }
		reader.close();
		
		//Calculate average words per line
		double sum = 0.0;
		double average = 0.0;
		for (int i = 0; i < wordsPerLine.size(); i++) {
			sum = sum + wordsPerLine.get(i);
		}
		average = sum / (double) lineCount;
		
		System.out.println("Total number of lines is " + lineCount);
		System.out.println("Total number of words is " + wordCount);
		System.out.println("Average words per line is " + average);
		System.out.println("The longest word is " + longestWord + " with " + mostChars + " characters.");
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("The program runtime is " + elapsedTime + " milliseconds.");
	}
}