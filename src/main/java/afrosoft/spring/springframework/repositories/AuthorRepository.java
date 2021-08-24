package afrosoft.spring.springframework.repositories;

import afrosoft.spring.springframework.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
