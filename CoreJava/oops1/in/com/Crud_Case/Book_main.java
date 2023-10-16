package in.com.Crud_Case;

import java.util.Scanner;

public class Book_main {
public static void main(String[] args) {
	int bookId;
	String bookName;
	String authoreName;
	int prize;
	Scanner sc = new Scanner(System.in);
	Book b[] = new Book[10];
	int choice = 0;
	int count=0;
	while (true) {
		System.out.println(" 1...add book");
		System.out.println(" 2..Update book");
		System.out.println(" 3...Delete book");
		System.out.println(" 4...Search book");
		System.out.println(" 5..get all");
		System.out.println(" 6..exit");
		System.out.println(" 7..insert book");
		System.out.println(" ");
		
		System.out.println(" Enter the choice ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
		{
			System.out.println("Add book");
			System.out.println("enter theno. of book");
			int size = sc.nextInt();
			for (int i = 0; i < b.length; i++) {
				System.out.println("Enter the book Ib..");
				bookId = sc.nextInt();
				System.out.println("Enter the book name..");
			    bookName = sc.next();
			    System.out.println("Enter the book authername..");
			    authoreName = sc.next();
			    System.out.println("Enter prize update..");
			    prize = sc.nextInt();
			    
			    b[i] = new book (bookId, bookName, authoreName, prize);
			    count++;
			}
			System.out.println("add book succesfully");		
			break;
		}
		
		case 2:{
			System.out.println("2..update book");
			System.out.println("Enter the book id for update");
			bookId = sc.nextInt();
			b[i].setBookName(bookName);
			
			System.out.println("Enter rhe book authore name update");
			authoreName = sc.next();
			b[i].setAuthoreName(authoreName);
			
			System.out.println(" ");
		}
	}
}
}
}
