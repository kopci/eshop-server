package sk.eshopapp.eshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sk.eshopapp.eshop.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
