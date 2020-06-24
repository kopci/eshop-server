package sk.eshopapp.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.eshopapp.eshop.model.AnimalCategoryEnum;
import sk.eshopapp.eshop.model.CartItem;
import sk.eshopapp.eshop.model.Order;
import sk.eshopapp.eshop.model.Product;
import sk.eshopapp.eshop.service.OrderService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity createNewOrder(@RequestBody Order order) {
        orderService.create(order.getTotalPrice(), order.getItems(), order.getOrdered());
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/getAll")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

}
