package com.jda.utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Linklist<T> {
	Node<T> head = null;

	static class Node<T> {
		T data;
		Node<T>next;

		Node(T d) {
			data = d;
			next = null;
		}
	}
 public T pop() {
		Node<T> n = head;
		Node<T>prev_node = null;
		while (n.next != null) {
			prev_node = n;
			n = n.next;
		}
		prev_node.next = null;
		return n.data;
	}

	public T pop(int pos) {
		Node <T>n = head;
		Node <T>prev_node = null;
	int  count = 0;
		while (count != pos) {
			prev_node = n;
			n = n.next;
			count = count + 1;

		}
		if (prev_node != null)
			prev_node.next = n.next;
		else
			head = n.next;
		return n.data;
	}

	public void push(T item) {
		Node <T>newnode = new Node<T>(item);
		newnode.next = head;
		head = newnode;
	}

	public void append(T d) {
		Node<T> newNode = new Node<T>(d);
		Node<T> temp = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void addInput(T item)
	{Node<T> newNode = new Node<T>(item);
	Node<T> temp = head;
	Node<T>prev=null;
	if(head.next==null)
	{ if((int)head.data>=(int) item)
	{ head=newNode;
	newNode.next=head;
	newNode=head;
	return;
	}
	else 
	{ head.next=newNode;
	return;
	}}
	else
	{ 
	while((int)temp.data<=(int)item)
			{ prev=temp;
		temp =temp.next;
		
	} 
	newNode.next=temp;
	prev.next=newNode;
	}}
	public int index(T item) {
		Node <T>n = head;
	int  xount = 0;
		while (n.data != item) {
			xount = xount + 1;
			n = n.next;
		}
		return xount;
	}

	public void inser(T item, int pos) {
		Node <T>n = head;
		Node<T> prev_node = null;
		Node <T>newnode = new Node<T>(item);
	int count = 0;
		while (count != pos) {
			prev_node = n;
			n = n.next;
			count = count + 1;
		}
		newnode.next = n;
		if (count == 0)
			head = newnode;
		if (count != 0)
			prev_node.next = newnode;

	}

	public void printList() {
		Node<T> n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void remove(T d) {
		Node<T> newNode = head;
		if (newNode.data.equals(d)) {
			head = newNode.next;
			return;
		}
		while (newNode != null) {
			if (newNode.next.data.equals(d)) {
				newNode.next = newNode.next.next;
				return;
			}
			newNode = newNode.next;
		}
	}

	public boolean search(T d) {
		Node<T> newNode = head;
		while (newNode != null) {
			if (newNode.data.equals(d)) {
				return true;
			}
			newNode = newNode.next;
		}
		return false;
	}

	public int size() {
		int  count = 0;
		Node<T>n = head;
		while (n != null) {
			count = count + 1;
			n = n.next;
		}
		return count;
	}
	public String[] readFromFile(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		String totalData = "";
		while (sc.hasNextLine()) {
			totalData += sc.nextLine() + " ";
		}
		String[] words = totalData.split(" ");
		return words;
	}
	public static int[]  bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}	static Scanner sc = new Scanner(System.in);

	public static String getString() {
		String word = sc.nextLine();
		return word;
	}

	public static int getInt() {
		int number = sc.nextInt();
		return number;
	}
	public void writeToCsvFile(File file) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(file);
		Node<T> temp = head;
		while (temp != null) {
			if (temp.next == null) {
				String s=temp.data.toString();
				pw.append((CharSequence) s);
				temp = temp.next;
			} else {
				String s=temp.data.toString();
				pw.append((CharSequence) s);
				pw.append(" ");
				temp = temp.next;
			}
		}
		pw.flush();
		pw.close();
	}

	public static void main(String args[]) {
		Linklist llist = new Linklist(); }
}
