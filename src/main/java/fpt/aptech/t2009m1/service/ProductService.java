package fpt.aptech.t2009m1.service;

import fpt.aptech.t2009m1.entity.Product;
import fpt.aptech.t2009m1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    public Product save(Product account) {
        return productRepository.save(account);
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
