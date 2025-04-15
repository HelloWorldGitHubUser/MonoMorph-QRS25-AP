# jpetstore-6
## account
### Expected inter-service method interactions
- org.mybatis.jpetstore.web.actions.AccountActionBean::editAccount() -> org.mybatis.jpetstore.service.CatalogService::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.web.actions.AccountActionBean::newAccount() -> org.mybatis.jpetstore.service.CatalogService::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.web.actions.AccountActionBean::signon() -> org.mybatis.jpetstore.service.CatalogService::getProductListByCategory(java.lang.String)

### Potential Test inter-service method interactions
- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getCartItems()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::containsItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getAllCartItems()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::removeItemById(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getNumberOfItems()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::incrementQuantityByItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::getSubTotal()

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::setQuantityByItemId(java.lang.String,int)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::setQuantityByItemId(java.lang.String,int)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::removeItemById(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getCartItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::containsItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getAllCartItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getNumberOfItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsEmpty() -> org.mybatis.jpetstore.domain.Cart::getSubTotal()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getUnitPrice()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getItem()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getTotal()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getStatus()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getUsername()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getName()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getDescription()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getCategoryId()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategoryList()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getName()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getDescription()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getCategoryId()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategory(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getInventoryQuantity() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getUnitCost()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getStatus()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute3()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getProduct()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute4()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute1()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute2()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getSupplierId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute5()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.mapper.ItemMapper::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getUnitCost()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getStatus()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute3()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getProduct()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute4()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute1()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute2()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getSupplierId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute5()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::updateInventoryQuantity() -> org.mybatis.jpetstore.mapper.ItemMapper::updateInventoryQuantity(java.util.Map)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getUnitPrice()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getOrderId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setUnitPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setLineNumber(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.mapper.LineItemMapper::insertLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getOrderId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setUnitPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setLineNumber(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.mapper.LineItemMapper::insertLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getUsername()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::getStatus()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.mapper.ProductMapper::getProduct(java.lang.String)

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.mapper.ProductMapper::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.mapper.ProductMapper::searchProductList(java.lang.String)

- org.mybatis.jpetstore.mapper.SequenceMapperTest::updateSequence() -> org.mybatis.jpetstore.mapper.SequenceMapper::updateSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.domain.Sequence::getName()

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.domain.Sequence::getNextId()

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnFalseWhenNotExistStock() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnFalseWhenNotExistStock() -> org.mybatis.jpetstore.service.CatalogService::isItemInStock(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategory() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategory() -> org.mybatis.jpetstore.service.CatalogService::getCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItemList() -> org.mybatis.jpetstore.mapper.ItemMapper::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItemList() -> org.mybatis.jpetstore.service.CatalogService::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProductList() -> org.mybatis.jpetstore.mapper.ProductMapper::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProductList() -> org.mybatis.jpetstore.service.CatalogService::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItem() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItem() -> org.mybatis.jpetstore.service.CatalogService::getItem(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldCallTheSearchMapperTwice() -> org.mybatis.jpetstore.mapper.ProductMapper::searchProductList(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldCallTheSearchMapperTwice() -> org.mybatis.jpetstore.service.CatalogService::searchProductList(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategoryList() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategoryList()

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategoryList() -> org.mybatis.jpetstore.service.CatalogService::getCategoryList()

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProduct() -> org.mybatis.jpetstore.mapper.ProductMapper::getProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProduct() -> org.mybatis.jpetstore.service.CatalogService::getProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnTrueWhenExistStock() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnTrueWhenExistStock() -> org.mybatis.jpetstore.service.CatalogService::isItemInStock(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnNextId() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnNextId() -> org.mybatis.jpetstore.service.OrderService::getNextId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.service.OrderService::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.Order::addLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.service.OrderService::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldThrowExceptionWhenSequenceNotFound() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldThrowExceptionWhenSequenceNotFound() -> org.mybatis.jpetstore.service.OrderService::getNextId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.Item::getQuantity()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.LineItem::getItem()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.service.OrderService::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderList() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderList() -> org.mybatis.jpetstore.service.OrderService::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProductList()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProductId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategoryList()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategoryId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getKeywordOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getKeyword()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItemId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategory()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItem()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProduct()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItemList()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::isShippingAddressRequiredOutputFalse() -> org.mybatis.jpetstore.web.actions.OrderActionBean::isShippingAddressRequired()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::getOrderListOutputNull() -> org.mybatis.jpetstore.web.actions.OrderActionBean::getOrderList()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::isConfirmedOutputFalse() -> org.mybatis.jpetstore.web.actions.OrderActionBean::isConfirmed()


## order
### Expected inter-service method interactions
- org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean) -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.domain.Cart::getSubTotal() -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.domain.LineItem::org.mybatis.jpetstore.domain.LineItem(int,org.mybatis.jpetstore.domain.CartItem) -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.domain.LineItem::org.mybatis.jpetstore.domain.LineItem(int,org.mybatis.jpetstore.domain.CartItem) -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart) -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.web.actions.OrderActionBean::listOrders() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.web.actions.OrderActionBean::listOrders() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getAccount()

- org.mybatis.jpetstore.web.actions.OrderActionBean::viewOrder() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.web.actions.OrderActionBean::viewOrder() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getAccount()

- org.mybatis.jpetstore.web.actions.OrderActionBean::newOrderForm() -> org.mybatis.jpetstore.web.actions.AccountActionBean::isAuthenticated()

- org.mybatis.jpetstore.web.actions.OrderActionBean::newOrderForm() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getAccount()

- org.mybatis.jpetstore.web.actions.OrderActionBean::newOrderForm() -> org.mybatis.jpetstore.web.actions.CartActionBean::getCart()

- org.mybatis.jpetstore.web.actions.OrderActionBean::newOrder() -> org.mybatis.jpetstore.web.actions.CartActionBean::clear()

- org.mybatis.jpetstore.service.OrderService::insertOrder(org.mybatis.jpetstore.domain.Order) -> org.mybatis.jpetstore.mapper.ItemMapper::updateInventoryQuantity(java.util.Map)

- org.mybatis.jpetstore.service.OrderService::getOrder(int) -> org.mybatis.jpetstore.domain.Item::setQuantity(int)

- org.mybatis.jpetstore.service.OrderService::getOrder(int) -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.OrderService::getOrder(int) -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

### Potential Test inter-service method interactions
- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Item::setItemId(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Item::setListPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setFavouriteCategoryId(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setBannerOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setListOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setLanguagePreference(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.mapper.AccountMapper::insertProfile(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.mapper.AccountMapper::insertAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.mapper.AccountMapper::insertSignon(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setFavouriteCategoryId(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setBannerOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setListOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setLanguagePreference(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.mapper.AccountMapper::updateProfile(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::isBannerOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::isListOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.mapper.AccountMapper::updateAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.mapper.AccountMapper::updateSignon(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::isBannerOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::isListOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsernameAndPassword(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getName()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getDescription()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.domain.Category::getCategoryId()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategoryList() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategoryList()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getName()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getDescription()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.domain.Category::getCategoryId()

- org.mybatis.jpetstore.mapper.CategoryMapperTest::getCategory() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategory(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getInventoryQuantity() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getUnitCost()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getStatus()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute3()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getProduct()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute4()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute1()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute2()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getSupplierId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Item::getAttribute5()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItemListByProduct() -> org.mybatis.jpetstore.mapper.ItemMapper::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getUnitCost()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getStatus()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getItemId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute3()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getProduct()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute4()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute1()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute2()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getListPrice()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getSupplierId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Item::getAttribute5()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ItemMapperTest::getItem() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.mapper.ItemMapperTest::updateInventoryQuantity() -> org.mybatis.jpetstore.mapper.ItemMapper::updateInventoryQuantity(java.util.Map)

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProduct() -> org.mybatis.jpetstore.mapper.ProductMapper::getProduct(java.lang.String)

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::getProductListByCategory() -> org.mybatis.jpetstore.mapper.ProductMapper::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getName()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getDescription()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getProductId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.domain.Product::getCategoryId()

- org.mybatis.jpetstore.mapper.ProductMapperTest::searchProductList() -> org.mybatis.jpetstore.mapper.ProductMapper::searchProductList(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsernameAndPassword() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsernameAndPassword(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsernameAndPassword() -> org.mybatis.jpetstore.service.AccountService::getAccount(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsername() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsername(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsername() -> org.mybatis.jpetstore.service.AccountService::getAccount(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToInsertAnAccount() -> org.mybatis.jpetstore.service.AccountService::insertAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToUpdateAnAccount() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToUpdateAnAccount() -> org.mybatis.jpetstore.service.AccountService::updateAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnFalseWhenNotExistStock() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnFalseWhenNotExistStock() -> org.mybatis.jpetstore.service.CatalogService::isItemInStock(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategory() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategory() -> org.mybatis.jpetstore.service.CatalogService::getCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItemList() -> org.mybatis.jpetstore.mapper.ItemMapper::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItemList() -> org.mybatis.jpetstore.service.CatalogService::getItemListByProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProductList() -> org.mybatis.jpetstore.mapper.ProductMapper::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProductList() -> org.mybatis.jpetstore.service.CatalogService::getProductListByCategory(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItem() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnItem() -> org.mybatis.jpetstore.service.CatalogService::getItem(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldCallTheSearchMapperTwice() -> org.mybatis.jpetstore.mapper.ProductMapper::searchProductList(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldCallTheSearchMapperTwice() -> org.mybatis.jpetstore.service.CatalogService::searchProductList(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategoryList() -> org.mybatis.jpetstore.mapper.CategoryMapper::getCategoryList()

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnCategoryList() -> org.mybatis.jpetstore.service.CatalogService::getCategoryList()

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProduct() -> org.mybatis.jpetstore.mapper.ProductMapper::getProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnProduct() -> org.mybatis.jpetstore.service.CatalogService::getProduct(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnTrueWhenExistStock() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.CatalogServiceTest::shouldReturnTrueWhenExistStock() -> org.mybatis.jpetstore.service.CatalogService::isItemInStock(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.Item::getQuantity()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.ItemMapper::getInventoryQuantity(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.ItemMapper::getItem(java.lang.String)

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getPasswordOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getPassword()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getMyListOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getMyList()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::isAuthenticatedOutputFalse() -> org.mybatis.jpetstore.web.actions.AccountActionBean::isAuthenticated()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getAccount()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getUsernameOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getUsername()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProductList()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProductId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategoryList()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategoryId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getKeywordOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getKeyword()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemIdOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItemId()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getCategoryOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getCategory()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItem()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getProductOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getProduct()

- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest::getItemListOutputNull() -> org.mybatis.jpetstore.web.actions.CatalogActionBean::getItemList()


## catalog
### Expected inter-service method interactions
- org.mybatis.jpetstore.web.actions.CartActionBean::removeItemFromCart() -> org.mybatis.jpetstore.domain.Cart::removeItemById(java.lang.String)

- org.mybatis.jpetstore.web.actions.CartActionBean::addItemToCart() -> org.mybatis.jpetstore.domain.Cart::containsItemId(java.lang.String)

- org.mybatis.jpetstore.web.actions.CartActionBean::addItemToCart() -> org.mybatis.jpetstore.domain.Cart::incrementQuantityByItemId(java.lang.String)

- org.mybatis.jpetstore.web.actions.CartActionBean::addItemToCart() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.web.actions.CartActionBean::updateCartQuantities() -> org.mybatis.jpetstore.domain.Cart::getAllCartItems()

- org.mybatis.jpetstore.web.actions.CartActionBean::updateCartQuantities() -> org.mybatis.jpetstore.domain.Cart::setQuantityByItemId(java.lang.String,int)

- org.mybatis.jpetstore.web.actions.CartActionBean::updateCartQuantities() -> org.mybatis.jpetstore.domain.CartItem::getItem()

### Potential Test inter-service method interactions
- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getCartItems()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::containsItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getAllCartItems()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::removeItemById(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemNotFound() -> org.mybatis.jpetstore.domain.Cart::getNumberOfItems()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::incrementQuantityByItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::incrementQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::getSubTotal()

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsExist() -> org.mybatis.jpetstore.domain.Cart::setQuantityByItemId(java.lang.String,int)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsFalse() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.Cart::setQuantityByItemId(java.lang.String,int)

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::setQuantityByItemId() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::removeItemByIdWhenItemFound() -> org.mybatis.jpetstore.domain.Cart::removeItemById(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getCartItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getCartItemList()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::containsItemId(java.lang.String)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getAllCartItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.Cart::getNumberOfItems()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getQuantity()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getItem()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::isInStock()

- org.mybatis.jpetstore.domain.CartTest::addItemWhenIsInStockIsTrue() -> org.mybatis.jpetstore.domain.CartItem::getTotal()

- org.mybatis.jpetstore.domain.CartTest::getSubTotalWhenItemIsEmpty() -> org.mybatis.jpetstore.domain.Cart::getSubTotal()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Cart::addItem(org.mybatis.jpetstore.domain.Item,boolean)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getUnitPrice()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getItem()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.LineItem::getTotal()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getStatus()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getUsername()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::initOrder(org.mybatis.jpetstore.domain.Account,org.mybatis.jpetstore.domain.Cart)

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.domain.OrderTest::initOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setFavouriteCategoryId(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setBannerOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setListOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.domain.Account::setLanguagePreference(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertProfile() -> org.mybatis.jpetstore.mapper.AccountMapper::insertProfile(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertAccount() -> org.mybatis.jpetstore.mapper.AccountMapper::insertAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.mapper.AccountMapperTest::insertSignon() -> org.mybatis.jpetstore.mapper.AccountMapper::insertSignon(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setFavouriteCategoryId(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setBannerOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setListOption(boolean)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.domain.Account::setLanguagePreference(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateProfile() -> org.mybatis.jpetstore.mapper.AccountMapper::updateProfile(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::isBannerOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::isListOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsername() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setZip(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setCity(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setState(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setPhone(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setEmail(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::setFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateAccount() -> org.mybatis.jpetstore.mapper.AccountMapper::updateAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.mapper.AccountMapperTest::updateSignon() -> org.mybatis.jpetstore.mapper.AccountMapper::updateSignon(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::isBannerOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::isListOption()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.mapper.AccountMapperTest::getAccountByUsernameAndPassword() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsernameAndPassword(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getUnitPrice()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getOrderId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setUnitPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setLineNumber(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.mapper.LineItemMapper::insertLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::getLineItemsByOrderId() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getQuantity()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setOrderId(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getOrderId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getItemId()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setUnitPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setLineNumber(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.domain.LineItem::getLineNumber()

- org.mybatis.jpetstore.mapper.LineItemMapperTest::insertLineItem() -> org.mybatis.jpetstore.mapper.LineItemMapper::insertLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getUsername()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrdersByUsername() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCreditCard(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCourier()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setExpiryDate(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCreditCard()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipState(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCourier(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipZip()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getTotalPrice()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getCardType()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setLocale(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipToFirstName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipToLastName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillCity()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillCountry(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setUsername(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getOrderDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getExpiryDate()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillZip(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setTotalPrice(java.math.BigDecimal)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setShipCity(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress2(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillToLastName()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getBillCountry()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setCardType(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipState()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillAddress1(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getLocale()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress1()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::getShipAddress2()

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.domain.Order::setBillToFirstName(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::getOrder() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setOrderId(int)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::getStatus()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::getOrderId()

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setOrderDate(java.util.Date)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.domain.Order::setStatus(java.lang.String)

- org.mybatis.jpetstore.mapper.OrderMapperTest::insertOrderStatus() -> org.mybatis.jpetstore.mapper.OrderMapper::insertOrderStatus(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.mapper.SequenceMapperTest::updateSequence() -> org.mybatis.jpetstore.mapper.SequenceMapper::updateSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.domain.Sequence::getName()

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.domain.Sequence::getNextId()

- org.mybatis.jpetstore.mapper.SequenceMapperTest::getSequence() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsernameAndPassword() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsernameAndPassword(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsernameAndPassword() -> org.mybatis.jpetstore.service.AccountService::getAccount(java.lang.String,java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsername() -> org.mybatis.jpetstore.mapper.AccountMapper::getAccountByUsername(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToGetAccountAnUsername() -> org.mybatis.jpetstore.service.AccountService::getAccount(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToInsertAnAccount() -> org.mybatis.jpetstore.service.AccountService::insertAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToUpdateAnAccount() -> org.mybatis.jpetstore.domain.Account::setPassword(java.lang.String)

- org.mybatis.jpetstore.service.AccountServiceTest::shouldCallTheMapperToUpdateAnAccount() -> org.mybatis.jpetstore.service.AccountService::updateAccount(org.mybatis.jpetstore.domain.Account)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnNextId() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnNextId() -> org.mybatis.jpetstore.service.OrderService::getNextId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdWithOutLineItems() -> org.mybatis.jpetstore.service.OrderService::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.LineItem::setQuantity(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.domain.Order::addLineItem(org.mybatis.jpetstore.domain.LineItem)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldCallTheMapperToInsert() -> org.mybatis.jpetstore.service.OrderService::insertOrder(org.mybatis.jpetstore.domain.Order)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldThrowExceptionWhenSequenceNotFound() -> org.mybatis.jpetstore.mapper.SequenceMapper::getSequence(org.mybatis.jpetstore.domain.Sequence)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldThrowExceptionWhenSequenceNotFound() -> org.mybatis.jpetstore.service.OrderService::getNextId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.LineItem::getItem()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.LineItem::setItemId(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.domain.Order::getLineItems()

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.LineItemMapper::getLineItemsByOrderId(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderWhenGivenOrderIdExistedLineItems() -> org.mybatis.jpetstore.service.OrderService::getOrder(int)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderList() -> org.mybatis.jpetstore.mapper.OrderMapper::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.service.OrderServiceTest::shouldReturnOrderList() -> org.mybatis.jpetstore.service.OrderService::getOrdersByUsername(java.lang.String)

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getPasswordOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getPassword()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getMyListOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getMyList()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::isAuthenticatedOutputFalse() -> org.mybatis.jpetstore.web.actions.AccountActionBean::isAuthenticated()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getPhone()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getAddress1()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getAddress2()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getCountry()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getStatus()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getFavouriteCategoryId()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getUsername()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getCity()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getLastName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getZip()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getPassword()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getBannerName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getState()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getLanguagePreference()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getEmail()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.domain.Account::getFirstName()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getAccountOutputNotNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getAccount()

- org.mybatis.jpetstore.web.actions.AccountActionBeanTest::getUsernameOutputNull() -> org.mybatis.jpetstore.web.actions.AccountActionBean::getUsername()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::isShippingAddressRequiredOutputFalse() -> org.mybatis.jpetstore.web.actions.OrderActionBean::isShippingAddressRequired()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::getOrderListOutputNull() -> org.mybatis.jpetstore.web.actions.OrderActionBean::getOrderList()

- org.mybatis.jpetstore.web.actions.OrderActionBeanTest::isConfirmedOutputFalse() -> org.mybatis.jpetstore.web.actions.OrderActionBean::isConfirmed()

