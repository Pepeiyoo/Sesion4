package miHexagonal.core.driver_ports;

import miHexagonal.domain.Book;

public interface BookService {
	Book getBook(Long id);
}
