package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.entities.Product;
import br.com.otogamidev.konan.model.repositories.DataAccessProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Iterable<Product> getAllProduct() { return dataAccessProduct.findAll(); }

    @GetMapping(path="/{id}")
    public Optional<Product> getProductById(@PathVariable final int id) { return dataAccessProduct.findById(id); }

//    @PutMapping
//    public Product putProduct(@Valid final Product product) {
//        dataAccessProduct.save(product);
//        return product;
//    }
}
