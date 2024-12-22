package customDataType;
import java.time.*;

public class Book {
	
	private String title;
	private String author;
	private LocalDate publishDate;
	private float price;
	public Book(String title, String author, LocalDate publishDate, float price) {
		super();
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publishDate=" + publishDate + ", price=" + price
				+ "]";
	}
	
	

}
