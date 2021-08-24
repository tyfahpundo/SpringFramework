package afrosoft.spring.springframework.repositories;

import afrosoft.spring.springframework.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
