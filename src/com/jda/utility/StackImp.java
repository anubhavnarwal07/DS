package com.jda.utility;
public class StackImp<T>{
  public char[] charArray;
 public int top;
	public int capacity;

	public StackImp(int size) {
		top = -1;
		capacity = size;
		charArray = new char[size];
	}


	public boolean checkFull() {
		return (top == capacity - 1);
	}

public boolean checkEmpty() {
		return (top == -1);
	}

	public void push(char data) {
		if (checkFull()) {
			return;
		}
		top = top + 1;
		charArray[top] = data;
	}


	public char pop() {
		char data = charArray[top];
		top = top - 1;
		return data;
	}

	public char peek() {
		return charArray[top];
	}

	
	public int search(char key) {
		for (int i = capacity - 1; i >= 0; i--) {
			if (charArray[i] == key) {
				return capacity - i;
			}
		}
		return -1;
	}
}


