package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogactionbean.*;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.category.CategoryDTO;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.ProductDTO;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogservice.CatalogServiceDTO;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    // Default constructor
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

    // Private constructor from DTO
    private CatalogActionBean(CatalogActionBeanDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    public CatalogActionBeanDTO toDTO() {
        return this.dtoInstance;
    }

    public static CatalogActionBean fromDTO(CatalogActionBeanDTO dtoInstance) {
        return new CatalogActionBean(dtoInstance);
    }

    // Implementation of the original methods
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
        Item item = getCatalogService().getItem(getItemId());
        setItem(item);
        setProduct(item.getProduct());
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
        CatalogActionBeanDTO.Builder builder = dtoInstance.toBuilder()

        builder.setKeyword(null)
               .setCategoryId(null)
               .setCategory(null)
               .setCategoryList(null)
               .setProductId(null)
               .setProduct(null)
               .setProductList(null)
               .setItemId(null)
               .setItemList(null);

        this.dtoInstance = builder.build();
    }

    // DTO getters and setters
    public String getKeyword() {
        return dtoInstance.getKeyword();
    }

    public void setKeyword(String keyword) {
        this.dtoInstance = this.dtoInstance.toBuilder().setKeyword(keyword).build();
    }

    public String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(String categoryId) {
        this.dtoInstance = this.dtoInstance.toBuilder().setCategoryId(categoryId).build();
    }

    public Category getCategory() {
        if (!dtoInstance.hasCategory()) {
            return null;
        }
        return Category.fromDTO(dtoInstance.getCategory());
    }

    public void setCategory(Category category) {
        CategoryDTO categoryDto = category != null ? category.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder()

        if (categoryDto != null) {
            builder.setCategory(categoryDto);
        } else {
            builder.clearCategory();
        }

        this.dtoInstance = builder.build();
    }

    public List<Category> getCategoryList() {
        if (dtoInstance.getCategoryListCount() == 0) {
            return null;
        }

        return dtoInstance.getCategoryListList().stream()
            .map(Category::fromDTO)
            .collect(Collectors.toList());
    }

    public void setCategoryList(List<Category> categoryList) {
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder();
        builder.clearCategoryList()

        if (categoryList != null) {
            List<CategoryDTO> categoryDtoList = categoryList.stream()
                .map(Category::toDTO)
                .collect(Collectors.toList());
            builder.addAllCategoryList(categoryDtoList);
        }

        this.dtoInstance = builder.build();
    }

    public String getProductId() {
        return dtoInstance.getProductId();
    }

    public void setProductId(String productId) {
        this.dtoInstance = this.dtoInstance.toBuilder().setProductId(productId).build();
    }

    public Product getProduct() {
        if (!dtoInstance.hasProduct()) {
            return null;
        }
        return Product.fromDTO(dtoInstance.getProduct());
    }

    public void setProduct(Product product) {
        ProductDTO productDto = product != null ? product.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder()

        if (productDto != null) {
            builder.setProduct(productDto);
        } else {
            builder.clearProduct();
        }

        this.dtoInstance = builder.build();
    }

    public List<Product> getProductList() {
        if (dtoInstance.getProductListCount() == 0) {
            return null;
        }

        return dtoInstance.getProductListList().stream()
            .map(Product::fromDTO)
            .collect(Collectors.toList());
    }

    public void setProductList(List<Product> productList) {
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder();
        builder.clearProductList()

        if (productList != null) {
            List<ProductDTO> productDtoList = productList.stream()
                .map(Product::toDTO)
                .collect(Collectors.toList());
            builder.addAllProductList(productDtoList);
        }

        this.dtoInstance = builder.build();
    }

    public String getItemId() {
        return dtoInstance.getItemId();
    }

    public void setItemId(String itemId) {
        this.dtoInstance = this.dtoInstance.toBuilder().setItemId(itemId).build();
    }

    public Item getItem() {
        if (!dtoInstance.hasItem()) {
            return null;
        }
        return (Item) IDMapper.fromID(dtoInstance.getItem());
    }

    public void setItem(Item item) {
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder()

        if (item != null) {
            builder.setItem(IDMapper.toID(item));
        } else {
            builder.clearItem();
        }

        this.dtoInstance = builder.build();
    }

    public List<Item> getItemList() {
        if (dtoInstance.getItemListCount() == 0) {
            return null;
        }

        List<Item> itemList = new ArrayList<>();
        for (refactoredObjectID id : dtoInstance.getItemListList()) {
            itemList.add((Item) IDMapper.fromID(id));
        }
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder();
        builder.clearItemList()

        if (itemList != null) {
            for (Item item : itemList) {
                builder.addItemList(IDMapper.toID(item));
            }
        }

        this.dtoInstance = builder.build();
    }

    public CatalogService getCatalogService() {
        if (!dtoInstance.hasCatalogService()) {
            return null;
        }
        return CatalogService.fromDTO(dtoInstance.getCatalogService());
    }

    public void setCatalogService(CatalogService catalogService) {
        CatalogServiceDTO catalogServiceDto = catalogService != null ? catalogService.toDTO() : null;
        CatalogActionBeanDTO.Builder builder = this.dtoInstance.toBuilder()

        if (catalogServiceDto != null) {
            builder.setCatalogService(catalogServiceDto);
        } else {
            builder.clearCatalogService();
        }

        this.dtoInstance = builder.build();
    }
}
