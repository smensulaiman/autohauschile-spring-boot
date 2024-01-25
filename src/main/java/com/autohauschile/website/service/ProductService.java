package com.autohauschile.website.service;

import com.autohauschile.website.entity.Product;
import com.autohauschile.website.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product insertProduct(Product product){
      return productRepository.save(product);
    }

    public List<Product> insertProductList(List<Product> products){
        return productRepository.saveAll(products);
    }

    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductByName(String name){
        return productRepository.findByName(name);
    }

    public void deleteProductById(int id){
        productRepository.deleteById(id);
    }

    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        if(product != null){
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            return productRepository.save(existingProduct);
        }
        return null;
    }

}
