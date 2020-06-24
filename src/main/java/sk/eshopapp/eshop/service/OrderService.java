package sk.eshopapp.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.eshopapp.eshop.model.CartItem;
import sk.eshopapp.eshop.model.Order;
import sk.eshopapp.eshop.repository.OrderRepository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order create(final Float totalPrice, final List<CartItem> items, final Date ordered) {
        return orderRepository.save(new Order(totalPrice, items, ordered));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
