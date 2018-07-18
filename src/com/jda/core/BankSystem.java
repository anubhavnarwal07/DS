package com.jda.core;
import java.util.Scanner;
public class BankSystem<T>{
	

	

	

		protected static class people
		{
		protected String status;
		 protected int amt;
		 
		 public people()
		 {
			 status = "d";
			 amt  = 0;
			 }
}
		public static void main(String args[])
		{ CustomQueue cq = new CustomQueue();
			Scanner scan = new Scanner(System.in);
			int amt = 1000;
			int noOfpeople;
		System.out.println("enter number of people in line");
		noOfpeople = scan.nextInt();
		System.out.println("now enter the queue");
		for(int i=0;i<noOfpeople;i++)
		{  people ppl = new people();
		    scan.nextLine();
			System.out.println("enter status");
			ppl.status =scan.nextLine();
			System.out.println("enter amt");
			ppl.amt = scan.nextInt();
			cq.enqueue(ppl);
			
		
		}
		
		for(int i=0;i<cq.size();i++)
		{
			people item = (people) cq.dequeue();
			if(item.status == "w")
			{
				if(amt-item.amt>0)
				{
					System.out.println("withdrawn successful");
					amt = amt - item.amt;
				}
				else
				{
					System.out.print("cannot be withdrawn");
				}
			}
			else
			{
				if(item.status == "d")
				{
					amt = amt+ item.amt;
				}
			}
		}
		
		System.out.println(amt);	
		}
	}

