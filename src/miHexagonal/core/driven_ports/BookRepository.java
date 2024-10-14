package miHexagonal.core.driven_ports;

import miHexagonal.domain.Book;

public interface BookRepository {
	Book FindById(Long id);
}
