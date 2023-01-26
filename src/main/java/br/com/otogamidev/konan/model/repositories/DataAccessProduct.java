package br.com.otogamidev.konan.model.repositories;

import br.com.otogamidev.konan.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface DataAccessProduct extends CrudRepository<Product, Integer> {

    public Iterable<Product> findByNameContainsIgnoreCase(final String contain);
}
