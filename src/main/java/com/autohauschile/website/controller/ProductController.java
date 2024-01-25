package com.autohauschile.website.controller;

import com.autohauschile.website.entity.Product;
import com.autohauschile.website.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("getProduct/{id}")
    public Product getProductById(@PathVariable("id") int id){
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        productService.deleteProductById(id);
    }

}
