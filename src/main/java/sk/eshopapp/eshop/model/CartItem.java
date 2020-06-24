package sk.eshopapp.eshop.model;

public class CartItem {

    private String productId;
    private int quantity;

    public CartItem(final String productId, final int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProduct(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
