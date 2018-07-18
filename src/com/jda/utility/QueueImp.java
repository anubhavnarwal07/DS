package com.jda.utility;
public class QueueImp<T> {
	private class Node<T> {
		private T data;
		private Node<T> next;
		

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node<T> head;
	public int size=0;

	public void push(int data) {
		Node newNode = new Node(data);
		Node temp = null;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public T pop() {
		if (head == null) {
			return null;
		}
		T data = head.data;
		head = head.next;
		return data;
	}
}
