package com.jda.core;
import com.jda.utility.Linklist;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unorderedlist {
public static void main(String args[]) throws FileNotFoundException
{  File file = new File ("/home/bridgelabz/Desktop/Godly");
Scanner in = new Scanner(file);
while(in.hasNextLine())
{ System.out.print(in.nextLine());
} 
System.out.println("Please enter a word to search");
}
}
	
