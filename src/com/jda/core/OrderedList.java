package com.jda.core;

import java.io.File;
import java.io.FileNotFoundException;

import com.jda.utility.Linklist;

public class OrderedList {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/home/bridgelabz/Desktop/Bodly");
		Linklist<String> allWords = new Linklist<String>();
		Linklist<Integer>obj = new Linklist<Integer>();
		String[] words = allWords.readFromFile(file);
		int arr[] = new int[words.length];
for(int i=0;i<words.length;i++)
{ arr[i]=Integer.parseInt(words[i]);
	}
Linklist li  = new Linklist();
arr=Linklist.bubbleSort(arr);
for(int i=0;i<words.length;i++)
{ obj.append(arr[i]);
	}
System.out.println("\nEnter the numer to be searched:");

int key = obj.getInt();
if (obj.search(key)) {
	obj.remove(key);
} else {
	obj.addInput(key);
} 
obj.printList();
obj.writeToCsvFile(file);
	}
}
