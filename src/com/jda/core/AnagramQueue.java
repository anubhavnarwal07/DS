package com.jda.core;
import  com.jda.utility.QueueImp;
public class AnagramQueue {
	public static boolean[] anagrams= new boolean[1000];
	public static void main(String args[])
	{ 
		QueueImp<Integer> queue = new QueueImp<>();
		for (int i=0; i<1000; i++)
		{
			if (anagrams[i])
			{
				queue.push(i);
			}
		}
		while(queue.size!=0)
		{ System.out.println(queue.pop()+ " ");
		}}}