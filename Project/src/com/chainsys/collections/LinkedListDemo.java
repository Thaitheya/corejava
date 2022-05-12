package com.chainsys.collections;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo {
  public static void main(String[] args) {
	LinkedList<String> stringLinkedList = new LinkedList<>();
	stringLinkedList.add("F");
	stringLinkedList.add("B");
	stringLinkedList.add("D");
	stringLinkedList.add("E");
	stringLinkedList.add("C");
	stringLinkedList.add("F");
	stringLinkedList.add("B");
	stringLinkedList.add("D");
	stringLinkedList.add("E");
	stringLinkedList.add("C");
	stringLinkedList.add("Z");
	stringLinkedList.add("A");
	stringLinkedList.add(1,"A2");
	Iterator<String> stringIterator = stringLinkedList.iterator();
	while(stringIterator.hasNext()) {
		System.out.println(stringIterator.next() + "***");
	}
	stringLinkedList.remove("F");
	stringLinkedList.remove(2);
	while(stringIterator.hasNext()) {
		System.out.println(stringIterator.next() + "---");
	}
	stringLinkedList.removeFirst();
	stringLinkedList.removeLast();
	stringIterator = stringLinkedList.iterator();
	while(stringIterator.hasNext()) {
		System.out.println(stringIterator.next() + "___");
	}
}
}
