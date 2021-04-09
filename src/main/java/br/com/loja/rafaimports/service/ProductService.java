package br.com.loja.rafaimports.service;

import br.com.loja.rafaimports.entity.Product;
import br.com.loja.rafaimports.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> listProducts() {

        return repository.findAll();
    }
}
