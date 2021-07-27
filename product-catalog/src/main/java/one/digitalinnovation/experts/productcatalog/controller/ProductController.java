package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public Optional<Product> readById(@PathVariable Long productId) {
        return productRepository.findById(productId);
    }
}