package br.com.loja.rafaimports.controller;

import br.com.loja.rafaimports.entity.Product;
import br.com.loja.rafaimports.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/adicionar")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/listar")
    public List<Product> listAllProducts() {
        return service.listProducts();

    }

}