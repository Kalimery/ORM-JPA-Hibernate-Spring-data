package me.mundiapolis.demobdccspringdata.web;

import me.mundiapolis.demobdccspringdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.mundiapolis.demobdccspringdata.entities.Product;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> allProducts(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findBuId(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Product not found"));



    }
    @GetMapping("/find/products")
    public List<Product> findProducts(@RequestParam(name = "kw", defaultValue = "") String kw) {
        return productRepository.findByNameContains(kw);
    }
    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Long id){
         productRepository.deleteById(id);



    }
}