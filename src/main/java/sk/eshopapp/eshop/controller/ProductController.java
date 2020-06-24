package sk.eshopapp.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.eshopapp.eshop.model.AnimalCategoryEnum;
import sk.eshopapp.eshop.model.Product;
import sk.eshopapp.eshop.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/create")
    public String createProduct(@RequestParam String name, @RequestParam AnimalCategoryEnum animalCategory, @RequestParam Float price, @RequestParam String description) {
        Product product = productService.create(name, animalCategory, price, description);
        return product.toString();
    }

    @RequestMapping("/get")
    public Product getProduct(@RequestParam String id) {
        return productService.getById(id);
    }

    @RequestMapping("/getAll")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @RequestMapping("/contains")
    public List<Product> getIfContains(@RequestParam String substring) {
        return productService.containsSubstring(substring);
    }

}
