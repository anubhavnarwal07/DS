package com.jda.core;
import com.jda.utility.Linklist;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unorderedlist {
		public static void main(String[] args) throws FileNotFoundException {
			File file = new File("/home/bridgelabz/Desktop/Godly");
			Linklist<String> allWords = new Linklist<String>();
			String[] words = allWords.readFromFile(file);
			for (int i = 0; i < words.length; i++) {
				allWords.append(words[i]);
			}
			System.out.println("\nEnter the word to be searched:");
			Linklist obj2 = new Linklist();
			String key = obj2.getString();
			if (allWords.search(key)) {
				allWords.remove(key);
			} else {
				allWords.append(key);
			} 
			allWords.writeToCsvFile(file);
		}
	}
