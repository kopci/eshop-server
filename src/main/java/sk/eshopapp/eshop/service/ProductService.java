package sk.eshopapp.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import sk.eshopapp.eshop.model.AnimalCategoryEnum;
import sk.eshopapp.eshop.model.Product;
import sk.eshopapp.eshop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final MongoTemplate mongoTemplate;

    public ProductService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public Product create(final String name, final AnimalCategoryEnum animalCategory, final Float price, final String description) {
        return productRepository.save(new Product(name, animalCategory, price, description));
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(String id) {
        return productRepository.findById(id).get();
    }

    public List<Product> containsSubstring(final String substring) {
        return productRepository.findAll().stream().filter(p -> p.getName().toLowerCase().contains(substring.toLowerCase())).collect(Collectors.toList());
    }

}
