package org.elib.repository;

import org.elib.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hamza Amentag
 * @since 5/6/2022
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
