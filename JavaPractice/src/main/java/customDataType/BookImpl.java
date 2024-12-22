package customDataType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookImpl {
	
	public static void main(String[] args) {
		
		Book b1=new Book("One of Us is Lying", "Mayank Arya", LocalDate.of(2001, 1,  1) , 299.99f);
		Book b2=new Book("One of Us is Next", "Mayank Arya", LocalDate.of(2002, 1,  1) , 1399.99f);
		Book b3=new Book("One of Us is Stranger", "Mayank Arya", LocalDate.of(2003, 1,  1) , 2499.99f);
		Book b4=new Book("One of Us is Not Dead", "Mayank Arya", LocalDate.of(2004, 1,  1) , 1499.99f);
		
		float totalPrice=0.00f;
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		Iterator itr=bookList.iterator();
		
		while(itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println("===========================");
			System.out.println("Title:- " + b.getTitle());
			System.out.println("Author:- " + b.getAuthor());
			System.out.println("Published Date:- " + b.getPublishDate());
			System.out.println("Price:- "+ b.getPrice());
			totalPrice=totalPrice+b.getPrice();
			
		}
		System.out.println("===========================");
		System.out.println("Total Price is "+ totalPrice);
		
		int index=0;
		int HighestIndex=0;
		float highPrice=0;
		
		for(Book b:bookList) {
			if(b.getPrice()>highPrice) {
				highPrice=b.getPrice();
				HighestIndex=index;
				
			}
			index++;
		}
			
		System.out.println("===========================");
		System.out.println("Title of Highest Priced:- " + bookList.get(HighestIndex).getTitle());
		System.out.println("Author:- " + bookList.get(HighestIndex).getAuthor());
		System.out.println("Published Date:- " + bookList.get(HighestIndex).getPublishDate());
		System.out.println("Price:- "+ bookList.get(HighestIndex).getPrice());
		
		
//		while(itr.hasNext()) {
//			Book b = (Book) itr.next();
//			if(highPrice>b.getPrice()) {
//				continue;
//			}
//			else {
//				highPrice=b.getPrice();
//			}
//			
//		}
		
		
		
		
		
	}
	


}
