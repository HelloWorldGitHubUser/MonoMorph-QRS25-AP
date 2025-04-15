package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.cartitem.*;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import java.math.BigDecimal;

/**
 * Auto-generated DTO gRPC client
 * {@link CartItem} and {@link CartItemDTO}.
 */
public class CartItem implements java.io.Serializable {
    private CartItemDTO dtoInstance;

    // Private constructor for fromDTO
    private CartItem() {
        this.dtoInstance = CartItemDTO.newBuilder().build();
    }

    // Constructor matching the original class
    public CartItem() {
        this.dtoInstance = CartItemDTO.newBuilder()
                .setSerialVersionUID(6620528781626504362L)
                .setQuantity(0)
                .setInStock(false)
                .build();
    }

    // dtoConstructor to initialize from a DTO instance
    public CartItem(CartItemDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    public CartItemDTO toDTO() {
        return this.dtoInstance;
    }

    public static CartItem fromDTO(CartItemDTO dtoInstance) {
        CartItem instance = new CartItem();
        instance.dtoInstance = dtoInstance;
        return instance;
    }

    // Implementation of the methods from the original class
    public boolean isInStock() {
        return dtoInstance.getInStock();
    }

    public void setInStock(boolean inStock) {
        dtoInstance = dtoInstance.toBuilder().setInStock(inStock).build();
    }

    public BigDecimal getTotal() {
        return dtoInstance.getTotal().isEmpty() ? null : new BigDecimal(dtoInstance.getTotal());
    }

    public Item getItem() {
        if (!dtoInstance.hasItem()) {
            return null;
        }
        return (Item) IDMapper.fromID(dtoInstance.getItem());
    }

    public void setItem(Item item) {
        CartItemDTO.Builder builder = dtoInstance.toBuilder();
        if (item != null) {
            builder.setItem(IDMapper.toID(item));
        } else {
            builder.clearItem();
        }
        dtoInstance = builder.build();
        calculateTotal();
    }

    public int getQuantity() {
        return dtoInstance.getQuantity();
    }

    public void setQuantity(int quantity) {
        dtoInstance = dtoInstance.toBuilder().setQuantity(quantity).build();
        calculateTotal();
    }

    public void incrementQuantity() {
        setQuantity(getQuantity() + 1);
    }

    private void calculateTotal() {
        Item item = getItem();
        BigDecimal totalValue = null;

        if (item != null && item.getListPrice() != null) {
            totalValue = item.getListPrice().multiply(new BigDecimal(getQuantity()));
        }

        CartItemDTO.Builder builder = dtoInstance.toBuilder();
        if (totalValue != null) {
            builder.setTotal(totalValue.toString());
        } else {
            builder.clearTotal();
        }
        dtoInstance = builder.build();
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    public long getSerialVersionUID() {
        return dtoInstance.getSerialVersionUID();
    }

    private void setSerialVersionUID(long serialVersionUID) {
        dtoInstance = dtoInstance.toBuilder().setSerialVersionUID(serialVersionUID).build();
    }

    private void setTotal(BigDecimal total) {
        CartItemDTO.Builder builder = dtoInstance.toBuilder();
        if (total != null) {
            builder.setTotal(total.toString());
        } else {
            builder.clearTotal();
        }
        dtoInstance = builder.build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
