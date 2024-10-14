package miHexagonal.core.driver_ports;

import miHexagonal.core.driven_ports.BookRepository;
import miHexagonal.domain.Book;

public class BookServiceImpl implements BookService {
	private BookRepository bookrepo;
	public BookServiceImpl(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	public Book getBook(Long id) {
		return this.bookrepo.FindById(id);
	}
}
