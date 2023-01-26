package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.entities.Product;
import br.com.otogamidev.konan.model.repositories.DataAccessProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductManager {

    @Autowired
    private DataAccessProduct dataAccessProduct;

    @RequestMapping(method={RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product createAndUpdateProduct(@Valid final Product newProduct) {
        System.out.println("ProductManager - createAndUpdateProduct(): BEGIN");
        dataAccessProduct.save(newProduct);
        System.out.println("ProductManager - createAndUpdateProduct(): END");
        return newProduct;
    }

    @GetMapping
    public Iterable<Product> getAllProducts() { return dataAccessProduct.findAll(); }

    @GetMapping(path="/{id}")
    public Optional<Product> getProductById(@PathVariable final int id) { return dataAccessProduct.findById(id); }

//    @PutMapping
//    public Product putProduct(@Valid final Product product) {
//        dataAccessProduct.save(product);
//        return product;
//    }

    @DeleteMapping(path="/{id}")
    public void deleteProduct(@PathVariable final int id) { dataAccessProduct.deleteById(id); }

    @GetMapping(path = "/page/{pageNumber}")
    public Iterable<Product> getProductsByPage(@PathVariable final int pageNumber) {
//        final Pageable page = PageRequest.of(0,3);
        Iterable<Integer> iterable = new ArrayList<>(3);
        return dataAccessProduct.findAllById(iterable);
    }

    @GetMapping(path = "/name/{contains}")
    public Iterable<Product> getAllProductsByName(@PathVariable final String contains) {
        return dataAccessProduct.findByNameContainsIgnoreCase(contains);
    }
}
