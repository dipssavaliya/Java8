package java8;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Book1", 100));
		books.add(new Book(2, "Book2", 200));
		books.add(new Book(3, "Book3", 300));
		books.add(new Book(4, "Book4", 400));
		return books;
	}
}
