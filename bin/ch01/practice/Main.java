package ch01.practice;

import ch01.A1.Book;
import ch01.A1.BookShelf;

public class Main {
  
  public static void main(String[] args) {
    //책 생성
    Book b1 = new Book("book1");
    Book b2 = new Book("book2");
    System.out.println(b1.getName());

    // 책꽂이 생성
    BookShelf bs1 = new BookShelf(10);

    bs1.appendBook(b1);
    // Books result1 = bs1.getBookAt(0);
    // System.out.println(result1.getName());    

    bs1.appendBook(b2);
    // Books result2 = bs1.getBookAt(1);
    // System.out.println(result2.getName());

    // 책을 꺼내오는 메소드
    for (Book b : bs1) {
  }
  
}
