package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.entities.Product;
import br.com.otogamidev.konan.model.repositories.DataAccessProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductManager {

    @Autowired
    private DataAccessProduct dataAccessProduct;

    @PostMapping
    public @ResponseBody Product createNewProduct(@RequestParam final String name,
                                                  @RequestParam final double price,
                                                  @RequestParam final double discount) {
        System.out.println("ProductManager - createNewProduct(): BEGIN");
        final Product newProduct = new Product(name,price,discount);
        dataAccessProduct.save(newProduct);
        System.out.println("ProductManager - createNewProduct(): END");
        return newProduct;
    }
}
