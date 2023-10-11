package Crud_Case;

public class Book {
 int bookId;
 int bookName;
 int authorename;
 int prize;
public Book(int bookId, int bookName, int authorename, int prize) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorename = authorename;
	this.prize = prize;
	
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public int getBookName() {
	return bookName;
}
public void setBookName(int bookName) {
	this.bookName = bookName;
}
public int getAuthorename() {
	return authorename;
}
public void setAuthorename(int authorename) {
	this.authorename = authorename;
}
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
 
}
