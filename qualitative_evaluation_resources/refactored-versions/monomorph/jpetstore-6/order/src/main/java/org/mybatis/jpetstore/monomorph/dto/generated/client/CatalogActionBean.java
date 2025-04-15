package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogactionbean.*;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.category.CategoryDTO;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.ProductDTO;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogservice.CatalogServiceDTO;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.monomorph.id.generated.client.Item;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.SessionScope;

/**
 * Auto-generated DTO gRPC client
 * {@link CatalogActionBean} and {@link CatalogActionBeanDTO}.
 */
@SessionScope
public class CatalogActionBean extends AbstractActionBean {
    private static final long serialVersionUID = 5849523372175050635L;
    private static final String MAIN = "/WEB-INF/jsp/catalog/Main.jsp";
    private static final String VIEW_CATEGORY = "/WEB-INF/jsp/catalog/Category.jsp";
    private static final String VIEW_PRODUCT = "/WEB-INF/jsp/catalog/Product.jsp";
    private static final String VIEW_ITEM = "/WEB-INF/jsp/catalog/Item.jsp";
    private static final String SEARCH_PRODUCTS = "/WEB-INF/jsp/catalog/SearchProducts.jsp";

    private CatalogActionBeanDTO dtoInstance;

    public CatalogActionBean() {
        this.dtoInstance = CatalogActionBeanDTO.newBuilder()
                .setSerialVersionUID(serialVersionUID)
                .setMAIN(MAIN)
                .setVIEW_CATEGORY(VIEW_CATEGORY)
                .setVIEW_PRODUCT(VIEW_PRODUCT)
                .setVIEW_ITEM(VIEW_ITEM)
                .setSEARCH_PRODUCTS(SEARCH_PRODUCTS)
                .build();
    }

    private CatalogActionBean(CatalogActionBeanDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    public CatalogActionBeanDTO toDTO() {
        return this.dtoInstance;
    }

    public static CatalogActionBean fromDTO(CatalogActionBeanDTO dtoInstance) {
        CatalogActionBean instance = new CatalogActionBean(dtoInstance);
        return instance;
    }

    // implementation of the gRPC exposed methods
    @net.sourceforge.stripes.action.DefaultHandler
    public ForwardResolution viewMain() {
        return new ForwardResolution(MAIN);
    }

    public ForwardResolution viewCategory() {
        if (getCategoryId() != null) {
            setProductList(getCatalogService().getProductListByCategory(getCategoryId()));
            setCategory(getCatalogService().getCategory(getCategoryId()));
        }
        return new ForwardResolution(VIEW_CATEGORY);
    }

    public ForwardResolution viewProduct() {
        if (getProductId() != null) {
            setItemList(getCatalogService().getItemListByProduct(getProductId()));
            setProduct(getCatalogService().getProduct(getProductId()));
        }
        return new ForwardResolution(VIEW_PRODUCT);
    }

    public ForwardResolution viewItem() {
        setItem(getCatalogService().getItem(getItemId()));
        setProduct(getItem().getProduct());
        return new ForwardResolution(VIEW_ITEM);
    }

    public ForwardResolution searchProducts() {
        if ((getKeyword() == null) || (getKeyword().length() < 1)) {
            setMessage("Please enter a keyword to search for, then press the search button.");
            return new ForwardResolution(ERROR);
        } else {
            setProductList(getCatalogService().searchProductList(getKeyword().toLowerCase()));
            return new ForwardResolution(SEARCH_PRODUCTS);
        }
    }

    public void clear() {
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder();
        builder.setKeyword(null)
               .setCategoryId(null)
               .setCategory(null)
               .clearCategoryList()
               .setProductId(null)
               .setProduct(null)
               .clearProductList()
               .setItemId(null)
               .setItem(null)
               .clearItemList();
        dtoInstance = builder.build();
    }

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public String getKeyword() {
        return dtoInstance.getKeyword();
    }

    public void setKeyword(String keyword) {
        dtoInstance = dtoInstance.toBuilder().setKeyword(keyword).build();
    }

    public String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(String categoryId) {
        dtoInstance = dtoInstance.toBuilder().setCategoryId(categoryId).build();
    }

    public Category getCategory() {
        if (!dtoInstance.hasCategory()) {
            return null;
        }
        return Category.fromDTO(dtoInstance.getCategory());
    }

    public void setCategory(Category category) {
        CategoryDTO categoryDTO = category != null ? category.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder();
        if (categoryDTO != null) {
            builder.setCategory(categoryDTO);
        } else {
            builder.clearCategory();
        }
        dtoInstance = builder.build();
    }

    public List<Category> getCategoryList() {
        List<Category> result = new ArrayList<>();
        for (CategoryDTO dto : dtoInstance.getCategoryListList()) {
            result.add(Category.fromDTO(dto));
        }
        return result;
    }

    public void setCategoryList(List<Category> categoryList) {
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder().clearCategoryList();
        if (categoryList != null) {
            for (Category category : categoryList) {
                builder.addCategoryList(category.toDTO());
            }
        }
        dtoInstance = builder.build();
    }

    public String getProductId() {
        return dtoInstance.getProductId();
    }

    public void setProductId(String productId) {
        dtoInstance = dtoInstance.toBuilder().setProductId(productId).build();
    }

    public Product getProduct() {
        if (!dtoInstance.hasProduct()) {
            return null;
        }
        return Product.fromDTO(dtoInstance.getProduct());
    }

    public void setProduct(Product product) {
        ProductDTO productDTO = product != null ? product.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder();
        if (productDTO != null) {
            builder.setProduct(productDTO);
        } else {
            builder.clearProduct();
        }
        dtoInstance = builder.build();
    }

    public List<Product> getProductList() {
        List<Product> result = new ArrayList<>();
        for (ProductDTO dto : dtoInstance.getProductListList()) {
            result.add(Product.fromDTO(dto));
        }
        return result;
    }

    public void setProductList(List<Product> productList) {
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder().clearProductList();
        if (productList != null) {
            for (Product product : productList) {
                builder.addProductList(product.toDTO());
            }
        }
        dtoInstance = builder.build();
    }

    public String getItemId() {
        return dtoInstance.getItemId();
    }

    public void setItemId(String itemId) {
        dtoInstance = dtoInstance.toBuilder().setItemId(itemId).build();
    }

    public Item getItem() {
        if (!dtoInstance.hasItem()) {
            return null;
        }
        return (Item) IDMapper.fromID(dtoInstance.getItem());
    }

    public void setItem(Item item) {
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder();
        if (item != null) {
            builder.setItem(IDMapper.toID(item));
        } else {
            builder.clearItem();
        }
        dtoInstance = builder.build();
    }

    public List<Item> getItemList() {
        List<Item> result = new ArrayList<>();
        for (var id : dtoInstance.getItemListList()) {
            result.add((Item) IDMapper.fromID(id));
        }
        return result;
    }

    public void setItemList(List<Item> itemList) {
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder().clearItemList();
        if (itemList != null) {
            for (Item item : itemList) {
                builder.addItemList(IDMapper.toID(item));
            }
        }
        dtoInstance = builder.build();
    }

    public CatalogService getCatalogService() {
        if (!dtoInstance.hasCatalogService()) {
            return null;
        }
        return CatalogService.fromDTO(dtoInstance.getCatalogService());
    }

    public void setCatalogService(CatalogService catalogService) {
        CatalogServiceDTO catalogServiceDTO = catalogService != null ? catalogService.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder();
        if (catalogServiceDTO != null) {
            builder.setCatalogService(catalogServiceDTO);
        } else {
            builder.clearCatalogService();
        }
        dtoInstance = builder.build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}