package br.com.loja.rafaimports.controller;

import br.com.loja.rafaimports.entity.Product;
import br.com.loja.rafaimports.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/adicionar-produto")
    public Product addProduct(@RequestBody Product product {
        return service.saveProduct(product);
    }

}
