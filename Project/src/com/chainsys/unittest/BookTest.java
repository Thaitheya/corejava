package com.chainsys.unittest;
import com.chainsys.classandmethod.Book;
public class BookTest {
	public static void testgetAuthor() {
     Book firstAuthor = new Book();
     firstAuthor.setAuthor("Thaitheyasudan");
     System.out.println(firstAuthor.getAuthor());
	}
	public static void testgetBookNames() {
		Book firstBook = new Book();
	    firstBook.setBookName("God Of War");
	    System.out.println(firstBook.getAuthor());
	}
	public static void testgetYearOfPublish() {
		Book firstpublish = new Book();
	     firstpublish.setYearOfPublish(2022);
	     System.out.println(firstpublish.getYearOfPublish());
	}
	
	
}
