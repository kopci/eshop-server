package sk.eshopapp.eshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Order {

    @Id
    String id;
    Float totalPrice;
    List<CartItem> items;
    Date ordered;

    public Order(final Float totalPrice, final List<CartItem> items, final Date ordered) {
        this.totalPrice = totalPrice;
        this.items = items;
        this.ordered = ordered;
    }

    public String getId() {
        return id;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

}
