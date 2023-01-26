package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.entities.Product;
import br.com.otogamidev.konan.model.repositories.DataAccessProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductManager {

    @Autowired
    private DataAccessProduct dataAccessProduct;

    @PostMapping
    public @ResponseBody Product createNewProduct(@Valid final Product newProduct) {
        System.out.println("ProductManager - createNewProduct(): BEGIN");
        dataAccessProduct.save(newProduct);
        System.out.println("ProductManager - createNewProduct(): END");
        return newProduct;
    }

    @GetMapping
    public Iterable<Product> getAllProduct() { return dataAccessProduct.findAll(); }
}
