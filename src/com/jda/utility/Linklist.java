package com.jda.utility;

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

	public void append(T item) {
		Node <T>n = head;

		Node <T>newnode = new Node<T>(item);
		while (n.next != null) {

			n = n.next;
		}
		n.next = newnode;

	}

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

	public void remove(T item) {
		Node<T>temp = head;
		if (head.data == item) {
			head = head.next;
		} else
			while (temp != null) {
				if (temp.next.data == item) {
					temp.next = temp.next.next;
					break;
				} else
					temp = temp.next;
			}
	}

	public boolean search(T item) {
		Node<T>n = head;
		while (n != null) {
			if (n.data == item)
				return true;
			n = n.next;
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
	public static void main(String args[]) {
		Linklist llist = new Linklist(); }
}
