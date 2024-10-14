package miHexagonal.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import miHexagonal.core.driven_ports.BookRepository;
import miHexagonal.db_driven_adapter.domain.BookEntity;
import miHexagonal.db_driven_adapter.jparepository.HAAJpaRepository;
import miHexagonal.domain.Book;
import miHexagonal.domain.BookDoesNotExistException;

@Component
public class JpaBookRepository implements BookRepository {
   

@Autowired //enlaza repositorio y servicio

private HAAJpaRepository haaJpaRepository;

    @Override

public Book FindById(Long id) {

Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

return bookEntity.toBook();

}

}