package sk.eshopapp.eshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sk.eshopapp.eshop.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
